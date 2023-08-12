package com.project.etp.hrm.filter;

import com.alibaba.fastjson.JSONObject;
import com.project.etp.hrm.exception.ExceptionStatusCode;
import com.project.etp.hrm.util.AjaxResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;

import javax.servlet.Filter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/***
 * @Author: it.wizard@foxmail.com
 * @Date: 2023/3/17 9:29
 * @Description: TODO
 * @Version 1.0
 ***/
public abstract class BaseFilter implements Filter, Ordered {

    protected Logger logger = LoggerFactory.getLogger(BaseFilter.class);

    protected void returnResult(HttpServletResponse response, String errMsg, ExceptionStatusCode statusCode) {
        AjaxResult error;
        if (statusCode != null) {
            error = AjaxResult.error(statusCode, errMsg);
        } else {
            error = AjaxResult.error(errMsg);
        }
        response.setHeader("Content-Type", "application/json;charset=UTF-8");
        String resultMsg = JSONObject.toJSONString(error);
        try {
            response.getWriter().write(resultMsg);
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

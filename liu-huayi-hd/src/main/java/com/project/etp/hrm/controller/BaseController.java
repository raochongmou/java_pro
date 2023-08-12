package com.project.etp.hrm.controller;

import com.project.etp.hrm.exception.BusinessException;
import com.project.etp.hrm.exception.ExceptionStatusCode;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.Objects;

/***
 * @Author: it.wizard@foxmail.com
 * @Date: 2023/3/17 9:26
 * @Description: TODO
 * @Version 1.0
 ***/
public class BaseController {
    /***
     *
     *  获取当前用户的基本信息，如果userID,userRole 是空 那么抛出无效用户的异常
     *
     * @return
     */
    protected Map<String, String> getUserInfo() {
        HttpServletRequest request = getRequest();
        if (request == null) {
            throw new BusinessException(ExceptionStatusCode.ERROR_INFO);
        }
        Map<String, String> userMap = (Map) request.getAttribute("userInfo");
        if (Objects.isNull(userMap)) {
            throw new BusinessException(ExceptionStatusCode.ERROR_USER_INVALID);
        }
        return userMap;
    }


    protected String getUserId() {
        Map<String, String> userInfo = getUserInfo();
        String userId = userInfo.get("userId");
        if (StringUtils.isEmpty(userId)) {
            throw new BusinessException(ExceptionStatusCode.ERROR_USER_INVALID);
        }
        return userId;
    }


    protected HttpServletRequest getRequest() {
        try {
            return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

package com.project.etp.hrm.controller;


import com.project.etp.hrm.exception.BusinessException;
import com.project.etp.hrm.exception.ExceptionStatusCode;
import com.project.etp.hrm.util.AjaxResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 * @Author: it.wizard@foxmail.com
 * @Date: 2022/3/19 17:00
 * @Description: TODO
 * @Version 1.0
 ***/
@ControllerAdvice
public class MyExceptionHandler {

    private static Logger logger = LoggerFactory.getLogger(MyExceptionHandler.class);

    @ExceptionHandler(value = BusinessException.class)
    public @ResponseBody
    AjaxResult jsonBusinessHandler(BusinessException e) {
        e.printStackTrace();
        logger.error("BusinessException自定义异常拦截:异常信息:message={};\\n" +
                        "stackTrace={};\\n" +
                        "localMessage={};\\n" +
                        "异常对象={}\\n",
                e.getMessage(), e.getStackTrace(), e.getLocalizedMessage(), "");
        return AjaxResult.error(e.getMessage());
    }

    @ExceptionHandler(value = Exception.class)
    public @ResponseBody
    AjaxResult jsonHandler(Exception e) {
        if (!(e instanceof BusinessException)) {
            e.printStackTrace();
            logger.error("Exception系统异常拦截:异常信息:message={};\\n" +
                            "stackTrace={};\\n" +
                            "localMessage={};\\n",
                    e.getMessage(), e.getStackTrace(), e.getLocalizedMessage());
        }
        return AjaxResult.error(e.getMessage());
    }
}

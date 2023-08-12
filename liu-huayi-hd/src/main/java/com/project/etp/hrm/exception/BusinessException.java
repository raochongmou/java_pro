package com.project.etp.hrm.exception;

/**
 * @Author: 刘胜
 * @DateTime: 2021/7/19 14:38
 * @e-mail: it.wizard@foxmail.com
 * @Description: TODO
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 2045332047069508231L;
    private Integer errorCode;
    private String errorMessage;
    private Object data;

    public BusinessException() {

    }

    public BusinessException(String errorMessage) {
        this.errorMessage = errorMessage;
        this.errorCode = -999;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public Object getData() {
        return data;
    }

    public BusinessException(ExceptionStatusCode exceptionStatusCode) {
        this.data = null;
        this.errorCode = exceptionStatusCode.getCode();
        this.errorMessage = exceptionStatusCode.getMessage();
    }
}

package com.project.etp.hrm.util;

import com.project.etp.hrm.exception.ExceptionStatusCode;

public class AjaxResult<T> {
    /**
     * 数据对象  --- class 对象  list<class>
     */
    private T data;

    /**
     * 状态码
     */
    private int code;

    /**
     * 返回内容
     */
    private String message;

    /**
     * 总记录数
     */
    private long total;

    public static AjaxResult error(ExceptionStatusCode responseCodeEnum) {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setCode(responseCodeEnum.getCode());
        ajaxResult.setMessage(responseCodeEnum.getMessage());
        return ajaxResult;
    }

    public static AjaxResult error(ExceptionStatusCode errorUserLoginError, String s) {
        AjaxResult error = AjaxResult.error(errorUserLoginError);
        error.setMessage(error.getMessage() + s);
        return error;
    }


    private static AjaxResult error(String msg, int code) {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setCode(code);
        ajaxResult.setMessage(msg);
        return ajaxResult;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "data=" + data +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", total=" + total +
                '}';
    }

    /**
     * 状态类型
     */
    public enum Type {
        /**
         * 成功
         */
        SUCCESS(1),
        /**
         * 错误
         */
        ERROR(0);
        private final int value;

        Type(int value) {
            this.value = value;
        }

        public int value() {
            return this.value;
        }
    }

    /**
     * 初始化一个新创建的 AjaxResult 对象，使其表示一个空消息。
     */
    public AjaxResult() {
    }

    /**
     * 初始化一个新创建的 AjaxResult 对象
     *
     * @param type    状态类型
     * @param message 返回内容
     */
    public AjaxResult(Type type, String message) {
        this.code = type.value;
        this.message = message;
    }

    /**
     * 初始化一个新创建的 AjaxResult 对象
     *
     * @param type    状态类型
     * @param message 返回内容
     * @param data    数据对象
     */
    public AjaxResult(Type type, String message, T data) {
        this.code = type.value;
        this.message = message;
        this.data = data;
    }

    public AjaxResult(Type type, String message, T data, long total) {
        this.code = type.value;
        this.message = message;
        this.data = data;
        this.total = total;
    }

    /**
     * 返回成功消息
     *
     * @return 成功消息
     */
    public static AjaxResult success() {
        return AjaxResult.success("操作成功", null);
    }

    /**
     * 返回成功数据
     *
     * @return 成功消息
     */
    public static <T> AjaxResult success(T data) {
        return AjaxResult.success("操作成功", data);
    }

    /**
     * 返回成功消息
     *
     * @param msg  返回内容
     * @param data 数据对象
     * @return 成功消息
     */
    public static <T> AjaxResult success(String msg, T data) {
        return new AjaxResult(Type.SUCCESS, msg, data);
    }

    /**
     * 返回成功消息
     *
     * @param msg  返回内容
     * @param data 数据对象
     * @return 成功消息
     */
    public static <T> AjaxResult success(String msg, T data, long total) {
        return new AjaxResult(Type.SUCCESS, msg, data, total);
    }

    public static <T> AjaxResult success(T data, long total) {
        return new AjaxResult(Type.SUCCESS, "操作成功", data, total);
    }


    /**
     * 返回错误消息
     *
     * @return
     */
    public static AjaxResult error() {
        return AjaxResult.error("操作失败");
    }

    /**
     * 返回错误消息
     *
     * @param msg 返回内容
     * @return 警告消息
     */
    public static AjaxResult error(String msg) {
        return AjaxResult.error(msg, null);
    }

    /**
     * 返回错误消息
     *
     * @param msg  返回内容
     * @param data 数据对象
     * @return 警告消息
     */
    public static <T> AjaxResult error(String msg, T data) {
        return new AjaxResult(Type.ERROR, msg, data);
    }


    /**
     * 响应返回结果
     *
     * @param rows 影响行数
     * @return 操作结果
     */
    public static AjaxResult toAjax(int rows) {
        return rows > 0 ? success() : error();
    }

    /**
     * 响应返回结果
     *
     * @param result 结果
     * @return 操作结果
     */
    public static AjaxResult toAjax(boolean result) {
        return result ? success() : error();
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

}

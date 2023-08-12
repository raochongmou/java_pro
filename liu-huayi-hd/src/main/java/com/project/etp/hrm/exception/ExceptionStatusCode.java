package com.project.etp.hrm.exception;

/**
 * @Author liusheng
 * @email it.wizard@foxmail.com
 * @Date 2021-05-06 13:31
 * @remark 错误枚举类型
 **/
public enum ExceptionStatusCode {

    /**
     * 成功失败 0-1
     */
    SUCCESS(0, "成功"),
    FAIL(-1, "失败"),

    /**
     * 请求参数相关错误  2100-2199
     */
    ERROR_REQUEST_PARAM_MISS(2100, "请求参数缺失！"),
    ERROR_REQUEST_PARAM_TYPE_INVALID(2101, "请求参数类型无效！"),
    ERROR_REQUEST_PARAM_EMPTY(2102, "请求参数是空！"),
    ERROR_REQUEST_PARAM_ILLEGAL(2103, "参数不合法"),
    ERROR_REQUEST_PARAM_INVALID(2104, "请求的参数值范围错误！"),
    ERROR_REQUEST_PARAM_PAGE_SORT_ERROR(2105, "请求分页排序列错误！"),
    ERROR_REQUEST_SMS_CODE(2106, "手机验证码错误!"),

    /**
     * 用户错误 2200-2299
     */
    ERROR_USER_LOGIN_ERROR(2200, "错误的用户密码！"),
    ERROR_USER_LOGIN_LOCK(2201, "用户多次登录失败，已被锁定!"),
    ERROR_USER_INVALID(2202, "无效的用户！"),
    ERROR_USER_GET_MENU_MISS(2203, "获取用户权限列表失败！"),
    ERROR_USER_GET_ROLE_MISS(2204, "获取用户角色列表失败！"),
    ERROR_USER_REGISTER_USER_NO_REPEAT(2205, "注册用户的userNo重复!"),
    ERROR_USER_HAS_NOT_VENDOR(2206, "当前用户没有指定委托方,请联系华艺业务员管理委托方!"),
    ERROR_USER_HANDLE_ORDER_NOT_PERMISSION(2210, "用户没有权限操作当前单据！"),


    /**
     * token错误  2300-2399
     */
    ERROR_USER_TOKEN_INVALID(2300, "无效的token！"),
    ERROR_USER_TOKEN_MISSION(2301, "token缺失！"),
    ERROR_USER_TOKEN_EXPIRED(2302, "token过期!"),
    ERROR_USER_TOKEN_REFRESH_INVALID(2303, "刷新Token无效!"),

    /**
     * 单据错误 2500 -2599
     */
    ERROR_ORDER_PERMISSIONS(2500, "当前用户没有权限获取单据!"),
    ERROR_ORDER_NOT_MAIN_EXISTS(2501, "没有对应的单据信息!"),
    ERROR_ORDER_NOT_DETAIL_EXISTS(2502, "当前单据详情缺失!"),
    ERROR_ORDER_OBJECT_NO_INVALID(2503, "错误的单据类型"),
    ERROR_ORDER_SAVE_NO_DETAIL(2504, "保存的单据缺少明细!"),
    ERROR_ORDER_NOT_VENDOR(2504, "单据的往来单位编码是空!"),
    ERROR_ORDER_VENDOR(2504, "单据的往来单位编码错误,与实际名称不符!"),

    /**
     * 异常错误 9900-9999
     */
    ERROR_VERIFICATION_CODE_CREATE(9900, "创建验证码错误!"),
    ERROR_INFO(9999, "系统内部错误!"),
    ERROR_DATE_FORMAT(9998, "日期格式错误!");

    /**
     * 错误代码
     */
    private final int code;
    /**
     * 错误信息
     */
    private final String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    ExceptionStatusCode(int code, String message) {
        this.code = code;
        this.message = message;
    }


}

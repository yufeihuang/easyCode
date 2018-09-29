package com.yfive.enums;


/**
 * @author yufei.huang
 * @Description 用户登录返回状态码枚举类
 * @Date Create in  2018/4/24 17:50
 */
public enum UserLoginStatusCode {

    /**
     * 账号错误或不存在
     */
    UnknownAccount(1000, "账号错误或不存在"),

    /**
     * 密码错误
     */
    IncorrectCredentials(1001, "密码错误"),

    /**
     * 帐号被锁定
     */
    LockedAccount(1002, "帐号被锁定"),

    /**
     * 登录失败次数过多
     */
    ExcessiveAttempts(1003, "登录失败次数过多"),

    /**
     * 帐号被禁用
     */
    DisabledAccount(1004, "帐号被禁用"),

    /**
     * 凭证过期
     */
    ExpiredCredentials(1005, "凭证过期");

    private final int code;
    private final String message;

    UserLoginStatusCode(int code, String message) {
        this.code = code;

        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

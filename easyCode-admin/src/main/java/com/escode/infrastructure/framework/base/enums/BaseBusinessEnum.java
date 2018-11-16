package com.escode.infrastructure.framework.base.enums;

/**
 * <p>业务类型枚举类</p>
 *
 * @author yFive
 * @version 1.0
 * @Description {业务类型枚举类}
 * @Company yFive
 * @date 2018/9/14 21:29
 */

public enum BaseBusinessEnum {

    /**
     * 未知类业务异常
     */
    UNKNOWN_BUSINESS_EXCEPTION(9999, "未知类业务异常"),

    /**
     * 登录类业务异常
     */
    LOGGING_BUSINESS_EXCEPTION(9000, "登录类业务异常");

    BaseBusinessEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private final int code;
    private final String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

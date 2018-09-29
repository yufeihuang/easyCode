package com.yfive.core.enums;

/**
 * <p>业务类型枚举类</p>
 *
 * @author yFive
 * @version 1.0
 * @description {业务类型枚举类}
 * @company yFive
 * @date 2018/9/14 21:29
 */

public enum BusinessEnum {

    /** 未知该业务异常 */
    UNKNOWN_BUSINESS_EXCEPTION(9999,"未知业务异常");

    BusinessEnum(int code, String message) {
        this.code = code;
        this.message=message;
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

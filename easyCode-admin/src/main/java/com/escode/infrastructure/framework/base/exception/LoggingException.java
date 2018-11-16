package com.escode.infrastructure.framework.base.exception;

import com.escode.infrastructure.framework.base.enums.BaseBusinessEnum;

/**
 * <p>登录类业务异常</p>
 *
 * @author yFive
 * @version 1.0
 * @Description {登录类业务异常}
 * @Company yFive
 * @date 2018/9/29 11:18
 */
public class LoggingException extends AbstractBusinessException {

    public LoggingException(Throwable e) {
        super(BaseBusinessEnum.LOGGING_BUSINESS_EXCEPTION.getCode()
                , BaseBusinessEnum.LOGGING_BUSINESS_EXCEPTION.getMessage()
                , (Exception) e);
    }

    public LoggingException() {
        super(BaseBusinessEnum.LOGGING_BUSINESS_EXCEPTION.getCode()
                , BaseBusinessEnum.LOGGING_BUSINESS_EXCEPTION.getMessage());
    }

    /**
     * 默认异常---无异常信息输出
     *
     * @param code 编码
     * @param msg  消息
     */
    public LoggingException(int code, String msg) {
        super(code, msg);
    }

    /**
     * 默认异常---异常信息输出
     *
     * @param code 编码
     * @param msg  消息
     */
    public LoggingException(int code, String msg, Exception e) {
        super(code, msg, e);
    }

}

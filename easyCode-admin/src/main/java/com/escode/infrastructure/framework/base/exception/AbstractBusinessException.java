package com.escode.infrastructure.framework.base.exception;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>业务异常基类</p>
 *
 * @author yFive
 * @version 1.0
 * @Description {所有业务异常都要继承此类，并定义自己的异常规范}
 * @Company yFive
 * @date 2018/9/14 21:18
 */

@Slf4j
@Getter
@Setter
abstract class AbstractBusinessException extends RuntimeException {

    /**
     * 异常处理编码
     */
    private static final  int CODE = 0;
    /**
     * 异常消息
     */
    private static final String MSG = "";
    /**
     * 获取当前异常信息类
     */
    private final String target = "" + this;

    public AbstractBusinessException() {
        super();
    }

    protected AbstractBusinessException(int code, String msg) {
        PrintExceptionLoggerAssist.printLogger(target, code, msg);
    }

    protected AbstractBusinessException(int code, String msg, Exception e) {
        PrintExceptionLoggerAssist.printLogger(target, code, msg, e);
    }

    /**
     * 默认异常---自定义业务异常输出
     */
    protected void unknownBusinessException(Throwable e) {
        PrintExceptionLoggerAssist.printLoggerUnknownBusinessException(target, e);
    }

    /**
     * 默认异常---自定义业务异常输出
     */
    protected void defaultBusinessException() {
        PrintExceptionLoggerAssist.printDefaultBusinessException(target);
    }


}


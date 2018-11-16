package com.escode.infrastructure.framework.base.exception;

import com.escode.infrastructure.framework.base.enums.BaseBusinessEnum;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>日志打印工具类</p>
 *
 * @author yFive
 * @version 1.0
 * @Description {日志打印工具类}
 * @Company yFive
 * @date 2018/9/29 10:07
 */
@Slf4j
public class PrintExceptionLoggerAssist {

    /**
     * 默认无参异常
     *
     * @param target
     */
    public static void printDefaultBusinessException(String target) {
        log.error("【code:{} msg:{} target_cls:{}】",
                BaseBusinessEnum.UNKNOWN_BUSINESS_EXCEPTION.getCode()
                , BaseBusinessEnum.UNKNOWN_BUSINESS_EXCEPTION.getMessage()
                , target
        );
    }

    /**
     * @param e 异常
     */
    public static void printLoggerUnknownBusinessException(String target, Throwable e) {
        log.error("【code:{} msg:{} ex_cause:{} target_cls:{}】",
                BaseBusinessEnum.UNKNOWN_BUSINESS_EXCEPTION.getCode()
                , BaseBusinessEnum.UNKNOWN_BUSINESS_EXCEPTION.getMessage()
                , e.getMessage()
                , target
        );
    }

    /**
     * @param code
     * @param msg
     * @param e
     */
    public static void printLogger(String target, int code, String msg, Exception e) {
        log.error(" -------->>>> code:{} msg:{} ex_cause:{} target_cls:{} <<<<--------",
                code
                , msg
                , e
                , target
        );

    }

    /**
     * @param code
     * @param msg
     */
    public static void printLogger(String target, int code, String msg) {
        log.error("【code:{} msg:{}】", code, msg, target);
    }

}

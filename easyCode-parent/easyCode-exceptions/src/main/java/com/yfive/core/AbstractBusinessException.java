package com.yfive.core;

import com.yfive.core.enums.BusinessEnum;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>业务异常基类</p>
 *
 * @author yFive
 * @version 1.0
 * @description {所有业务异常都要继承此类，并定义自己的异常规范}
 * @company yFive
 * @date 2018/9/14 21:18
 */
@Data
public abstract class AbstractBusinessException extends RuntimeException {
    private final Logger logger = LoggerFactory.getLogger(AbstractBusinessException.class);

    /**
     * 异常处理编码
     */
    private int code = 0;
    /**
     * 异常消息
     */
    private String msg = "";

    public AbstractBusinessException() {
        super();
    }

    protected AbstractBusinessException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    protected AbstractBusinessException(int code, String msg, Exception e) {
        super(e);
        this.code = code;
        this.msg = msg;
    }

    protected void unknownBusinessException(Throwable e) {
        logger.error("【{}:{}:{}】",
                BusinessEnum.UNKNOWN_BUSINESS_EXCEPTION.getCode()
                , BusinessEnum.UNKNOWN_BUSINESS_EXCEPTION.getMessage()
                ,e.getMessage()
                , e
        );
    }


}


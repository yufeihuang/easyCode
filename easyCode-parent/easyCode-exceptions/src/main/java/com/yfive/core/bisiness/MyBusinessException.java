package com.yfive.core.bisiness;

import com.yfive.core.AbstractBusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p></p>
 *
 * @author yFive
 * @version 1.0
 * @description {}
 * @company yFive
 * @date 2018/9/14 21:43
 */
public class MyBusinessException extends AbstractBusinessException {

    private final Logger logger = LoggerFactory.getLogger(AbstractBusinessException.class);

    public MyBusinessException(Throwable e) {
        unknownBusinessException(e);
    }

    /**
     * 默认异常---无异常信息输出
     *
     * @param code 编码
     * @param msg 消息
     */
    public MyBusinessException(int code, String msg) {
        super(code, msg);
    }

    /**
     * 默认异常---异常信息输出
     *
     * @param code 编码
     * @param msg 消息
     */
    public MyBusinessException(int code, String msg, Exception e) {
        super(code, msg, e);
    }

    /**
     * 自定义业务异常输出
     */
    @Override
    protected void unknownBusinessException(Throwable e) {
       super.unknownBusinessException(e);
    }

}

package com.escode.infrastructure.framework.base.exception;

/**
 * <p>基础异常信息类</p>
 *
 * @author yFive
 * @version 1.0
 * @Description {基础异常信息类}
 * @Company yFive
 * @date 2018/9/14 21:43
 */
public class BaseBusinessException extends AbstractBusinessException {

    public BaseBusinessException(Throwable e) {
        unknownBusinessException(e);
    }

    public BaseBusinessException() {
        defaultBusinessException();
    }

    /**
     * 默认异常---无异常信息输出
     *
     * @param code 编码
     * @param msg 消息
     */
    public BaseBusinessException(int code, String msg) {
        super(code, msg);
    }

    /**
     * 默认异常---异常信息输出
     *
     * @param code 编码
     * @param msg 消息
     */
    public BaseBusinessException(int code, String msg, Exception e) {
        super(code, msg, e);
    }

    /**
     * 默认异常---自定义业务异常输出
     */
    @Override
    protected void unknownBusinessException(Throwable e) {
       super.unknownBusinessException(e);
    }

    /**
     * 默认无参异常
     */
    @Override
    protected void defaultBusinessException() {
        super.defaultBusinessException();
    }

}

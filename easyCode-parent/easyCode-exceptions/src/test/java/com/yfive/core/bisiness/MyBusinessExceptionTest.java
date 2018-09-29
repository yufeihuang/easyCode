package com.yfive.core.bisiness;

import org.junit.Test;

/**
 * <p>测试异常</p>
 *
 * @author yFive
 * @version 1.0
 * @Description {测试抛出默认异常}
 * @Company yFive
 * @date 2018/9/28 20:02
 */
public class MyBusinessExceptionTest {

    /*默认异常---自定义业务异常输出*/
    @Test
    public void unknownBusinessException() throws Exception {
        try {
            int i = 1 / 0;
        } catch (Throwable e) {
            throw new MyBusinessException(e);
        }
    }

    /*默认异常---异常信息输出*/
    @Test
    public void BusinessException() throws Exception {
        int code=9000;
        String msg="error 错误";
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            throw new MyBusinessException(code, msg, e);
        }
    }

    /*默认异常---无异常信息输出*/
    @Test
    public void BusinessExceptions() throws Exception {
        int code=9000;
        String msg="error 错误";
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            throw new MyBusinessException(code, msg);
        }
    }

}
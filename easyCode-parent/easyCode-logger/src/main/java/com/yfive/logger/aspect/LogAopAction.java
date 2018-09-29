/*
package com.yfive.logger.aspect;


import com.yfive.configuration.annotation.pointcut.LoggerPointcut;
import com.yfive.logger.model.OpLog;
import com.yfive.logger.service.OpLogService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.HashMap;

*/
/**
 * @author dengjinhong
 * @Description 日志切面切入点处理类
 * @date 2018/3/13 14:12
 *//*


@Aspect
@Component
@Slf4j
public class LogAopAction {

    @Autowired
    private OpLogService logService;

    Long startTime;

    */
/**
     * 日志类
     *//*

    OpLog opLog = new OpLog();
    HashMap<String, String> map = new HashMap<String, String>();


    */
/**
     * 切入前：
     * --》》插入切入之前的前置内容
     *
     * @param joinPoint
     *//*

    @Before(value = "")
    public void doBefore(JoinPoint joinPoint) {

        */
/**
         * 1:获取http请求的基本信息并处理
         * 2：获取切面类的基本信息并处理
         * ---------------->>
         * method:post
         * url:/login
         * addr:192.168.1.1
         *
         * Simpleclass:loginContrller
         * method:loginVali
         * agrs:username/password
         *
         *---------------->>
         *//*

        opLog = getHttpRequestInfoAndJoingPointInfo(getHttpServletRequest(), joinPoint);

    }

    */
/**
     * 环绕切入点：
     * --》》处理切入内容
     *
     * @param pjp
     * @return
     * @throws Throwable
     *//*

    @Around("controllerAspect()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {

        Object object = null;

        //获取拦截前的时间
        startTime = System.currentTimeMillis();

        //获取当前被拦截的方法
        Method method = aspectjUtil.getMethod(pjp);

        if (null != method) {
            // 判断指定类型的注释存在于此方法上
            if (method.isAnnotationPresent(SystemLog.class)) {

                //设置注解上配置的日志信息
                setLogAnnoByClassInfo(method);

                //执行目标方法
                object = pjp.proceed();

                //设置返回的信息
                ResponseData responseData = (ResponseData) object;
                if(null!=responseData){
                    opLog.setResponseCode(responseData.getCode());
                    opLog.setResponseMessage(responseData.getMessage());
                }

                //设置方法执行的耗时
                opLog.setTimeConsuming(System.currentTimeMillis() - startTime);

                //保存数据
                logService.insertSelective(opLog);

            }else {
                */
/**缺少注解类*//*

                object = pjp.proceed();
            }
        }else {
            */
/**不需要拦截直接执行*//*

            object = pjp.proceed();
        }
        return object;
    }

    */
/**
     * 后置：
     * --》》统一结果集处理
     *
     * @param joinPoint
     *//*

    @AfterReturning("controllerAspect()")
    public void doAfterReturning(JoinPoint joinPoint) {
        log.info("method--》》耗时（毫秒） : " + (System.currentTimeMillis() - startTime));

    }

    */
/**
     * 获取用户请求+切面处理的基本信息
     *//*

    public OpLog getHttpRequestInfoAndJoingPointInfo(HttpServletRequest request, JoinPoint joinPoint) {

        String aa = DateGetUtil.getDateByPattern(DATE_PATTERN_CONSTANTS.PRE_YYYY_MM_DD_HH_MM_SS);

        */
/**
         * 设置插入日志的基本信息
         * 1：系统当前时间
         * 2：日志主键id
         *//*

        opLog.setCreateDates(aa);
        opLog.setId(PrimaryKeyUtil.nextId());

        */
/**
         * 获取http请求的基本信息
         *//*

        opLog.setHttpUrl(new HttpRequestUtils(request).getUrl());
        opLog.setMethod(new HttpRequestUtils(request).getMethod());
        opLog.setHttpAddr(new HttpRequestUtils(request).getAddr());


        */
/**
         * 获取切入类的基本信息
         *//*

        opLog.setClassSimpleClass(new joinPointUtil(joinPoint).getSimpleclass());
        opLog.setClassMethod(new joinPointUtil(joinPoint).getMethod());
        opLog.setHttpArgs(HttpRequestUtils.getHttpServletRequestParams(request));

        return opLog;
    }

    */
/**
     * 设置注解上设置的日志信息
     *
     * @param method
     *//*

    private void setLogAnnoByClassInfo(Method method) {

        SystemLog systemlog = method.getAnnotation(SystemLog.class);

        */
/**
         * 获取token，解密，获取userid的信息
         *//*

        */
/*String token=log.getHttpArgs().get("token");
        log.setUserId();*//*


        log.setLevel(systemlog.sysLevel());

        log.setSysCode(systemlog.sysCode());

        log.setSysName(systemlog.sysName());

        log.setSysDescription(systemlog.sysDescription());

        log.setModule(systemlog.module());

        log.setSysOperation(systemlog.sysOperation());

    }

}
*/

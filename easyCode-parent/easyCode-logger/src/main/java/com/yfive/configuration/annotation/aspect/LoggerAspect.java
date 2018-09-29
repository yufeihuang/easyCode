package com.yfive.configuration.annotation.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * <p>日志类切面定义</p>
 *
 * @author yFive
 * @version 1.0
 * @description {}
 * @company yFive
 * @date 2018/9/10 11:41
 */
@Aspect
@Configuration
public class LoggerAspect {

    private final Logger log = LoggerFactory.getLogger(LoggerAspect.class);

    /**
     * (1)Aspect(切面):通常是一个类，里面可以定义切入点和通知</p>
     * (2)JointPoint(连接点):程序执行过程中明确的点，一般是方法的调用
     * (3)Advice(通知):AOP在特定的切入点上执行的增强处理，有before,after,afterReturning,afterThrowing,around
     */

    private final String pointcut="com.yfive.configuration.annotation.pointcut.LoggerPointcut.controller()";

    /**
     * 环绕通知
     * 在目标方法完成前后做增强处理,环绕通知是最重要的通知类型,像事务,日志等都是环绕通知
     * @param proceedingJoinPoint
     * @return Object
     */
    @Around(pointcut)
    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        log.info("aroundAdvice------->>");
        return null;
    }

    /**
     * 前置通知,在目标方法被调用之前做增强处理,@Before只需要指定切入点表达式即可
     * @param joinPoint 连接点
     */
    @Before(pointcut)
    public void beforeAdvice(JoinPoint joinPoint) {
        log.info("beforeAdvice------->>");
    }

    @After(pointcut)
    public void afterAdvice(JoinPoint joinPoint){
        log.info("afterAdvice------->>");
    }

    @AfterReturning(pointcut=pointcut,returning="returnVal")
    public void afterReturnAdvice(JoinPoint joinPoint,Object returnVal){
        log.info("afterReturnAdvice------->>");
    }

    @AfterThrowing(pointcut=pointcut,throwing="error")
    public void afterThrowingAdvice(JoinPoint joinPoint,Throwable error){
        log.info("afterThrowingAdvice------->>"+error);
    }

}

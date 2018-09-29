package com.yfive.configuration.annotation.pointcut;

import org.aspectj.lang.annotation.Pointcut;

/**
 * <p>日志类切入点定义</p>
 *
 * @author yFive
 * @version 1.0
 * @description {
 * - Pointcut(切入点):就是带有通知的连接点，在程序中主要体现为书写切入点表达式
 * - 简单点理解就是<em>切入到哪个类的的哪个方法上</em>
 * }
 * @company yFive
 * @date 2018/9/10 11:30
 */
public class LoggerPointcut {

    /**
     * 定义切入点：
     * <p> 【*】，表示任意返回值
     * <p> 【* com..*.controller】 表示controller包
     * <p> 【* com..*.controller..*】 表示controller包下的所有子包
     * <p> 【* com..*.controller..*.*】 表示controller包下的所有子包下的所有方法
     * <p> 【* com..*.controller..*.*(..)】 表示controller包下的所有子包下的所有方法和任意参数
     *
     *  ..(两个点)表示零个或多个
     *  *表示任意类型
     *
     *  格式示例：
     *  public com.yfive.xxPackege.xxClass.xxMethod(... params)
     *
     *  任意公共方法的执行：
     *  execution（public * *（..））
     *  任何一个名字以“set”开始的方法的执行：
     *  execution（* set*（..））
     *
     */
    @Pointcut("execution(* com..*.controller..*.*(..))")
    public static void controller() {}

}

package com.jeff.bi.aop;


import com.jeff.bi.annotation.Action;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class LogAspect {
    @Pointcut("@annotation(com.jeff.bi.annotation.Action)") //使用自定义注解配置切面
    public void annotationPointCut(){};

    @Pointcut("execution(* com.jeff.bi.service.DemoMethodService.*(..))") //使用 AspectJ 的表达式配置切面
    public void advicePointCut(){};

    @Before("annotationPointCut()")  //引用Pointcut定义的切点
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);  //获取方法上的特定注解
        System.out.println("注解方式拦截 " + action.name());
    }

    @After("advicePointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("建言方式拦截 " + method.getName());
    }

}

package com.example.system_design.ddddemo.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect2 {

    @Before("execution(* com.example.system_design.ddddemo.application.channel.*.*(..))")
    public void beforeMethodExecution(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Executing method: " + methodName);
    }

//    @AfterReturning(pointcut = "execution(* com.example.service.*.*(..))", returning = "result")
//    public void afterMethodExecution(JoinPoint joinPoint, Object result) {
//        String methodName = joinPoint.getSignature().getName();
//        System.out.println("Finished executing method: " + methodName);
//        System.out.println("Result: " + result);
//    }
}

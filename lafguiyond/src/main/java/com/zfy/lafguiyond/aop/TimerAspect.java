package com.zfy.lafguiyond.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimerAspect {

    @Around("execution(* com.zfy.lafguiyond.service.impl.*.*(..)))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        Long start = System.currentTimeMillis();
        Object result = pjp.proceed();
        long end = System.currentTimeMillis();
        System.err.println("耗时："+(end-start)+"ms.");
        return result;
    }

}

package com.spring.training.aspects;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAspect {

	@Pointcut("execution(* com.spring.training.services.*.*(..)), execution(* com.spring.training.repositories.*.*(..))")
	public void logPointcut() {
	}

	@Before("logPointcut()")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("logBefore(): method: "+ joinPoint.getSignature().getName());
	}

	@After("logPointcut()")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("logAfter(): method: "+ joinPoint.getSignature().getName());
	}

	@AfterReturning(pointcut = "logPointcut()", returning = "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {
		System.out.println("logAfterReturning(): method: " + joinPoint.getSignature().getName() + " returnedValue: " + result);
	}

	@Around("logPointcut()")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		long startTime = System.currentTimeMillis();
		System.out.println("logAround(): " + joinPoint.getSignature().getName() + " arguments: " + Arrays.toString(joinPoint.getArgs()));

		System.out.println("logAround(): before is running!");
		Object returnedValue = joinPoint.proceed(); // continue on the intercepted method
		System.out.println("logAround(): after is running!");
		
		long endTime = System.currentTimeMillis() - startTime;
		
		System.out.println("logAround(): TimeTaken: " + endTime);
		
		return returnedValue;
	}
}

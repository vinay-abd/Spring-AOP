package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectPgm
{
	@Before("execution(* Service1.*(..))")
	public void before (JoinPoint jp)
	{
		System.out.println("called before ...");
		System.out.println("----->method called is :"+jp.getSignature().getName());
	}
	
	@Around("execution(* Service1.*(..))")
	public void around(ProceedingJoinPoint point) throws Throwable {
	    long start = System.currentTimeMillis();
	    Object result = point.proceed();
	    long end = System.currentTimeMillis();
		System.out.println("Execution time = " +(end - start));

	 }
	
	@After("execution(* Service1.*(..))")
	public void After (JoinPoint jp)
	{
		System.out.println("called After ...");
		System.out.println("----->method called is :"+jp.getSignature().getName());
	}
}

package com.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MethodStartLoggingAspect {
//	@Before("execution(* *..*HelloWorldImpl.*(..))")
//	public void startLog(JoinPoint jp) {
//		System.out.println("メソッド開始: " + jp.getSignature());
//	}
//	
//	@AfterReturning("execution(* *..*HelloWorldImpl.*(..))")
//	public void endLog(JoinPoint jp) {
//		System.out.println("メソッド正常終了: " + jp.getSignature());
//	}
//
//	@AfterThrowing(value = "execution(* *..*HelloWorldImpl.*(..))", throwing = "e")
//	public void endLog(JoinPoint jp, RuntimeException e) {
//		System.out.println("メソッド異常終了: " + jp.getSignature());
//		e.printStackTrace();
//	}

	@Around("execution(* *..*HelloWorldImpl.*(..))")
	public Object log(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("メソッド開始: " + jp.getSignature());
		try {
			// 対象メソッド実行
			Object result = jp.proceed();
			System.out.println("メソッド正常終了: " + jp.getSignature() + " 戻り値=" + result);
			return result;
		} catch (Exception e) {
			System.out.println("メソッド異常終了: " + jp.getSignature());
			e.printStackTrace();
			throw e;
		}
	}
}

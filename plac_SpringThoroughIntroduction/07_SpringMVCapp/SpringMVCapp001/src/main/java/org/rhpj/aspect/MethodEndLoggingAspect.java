package org.rhpj.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MethodEndLoggingAspect {
	@After("execution(* *..*Controller.*(..))")
	public void endLog(JoinPoint jp) {
		System.out.println("メソッド終了: " + jp.getSignature());
	}
}

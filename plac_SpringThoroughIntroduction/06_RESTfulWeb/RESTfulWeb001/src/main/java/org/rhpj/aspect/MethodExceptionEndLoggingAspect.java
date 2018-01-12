package org.rhpj.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MethodExceptionEndLoggingAspect {
	@AfterThrowing(value = "execution(* *..*Controller.*(..))", throwing = "e")
	public void endLog(JoinPoint jp, RuntimeException e) {
		System.out.println("メソッド異常終了: " + jp.getSignature());
		e.printStackTrace();
	}
}

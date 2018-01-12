package org.rhpj.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MethodNormalEndLoggingAspect {
	@AfterReturning("execution(* *..*Controller.*(..))")
	public void endLog(JoinPoint jp) {
		System.out.println("メソッド正常終了: " + jp.getSignature());
	}

//	@AfterReturning(value = "execution(* *..*Service.*(..))", returning = "msg")
//	public void endLog(JoinPoint jp, String msg) {
//		System.out.println("メソッド正常終了: " + jp.getSignature() + " 戻り値=" + msg);
//	}

}

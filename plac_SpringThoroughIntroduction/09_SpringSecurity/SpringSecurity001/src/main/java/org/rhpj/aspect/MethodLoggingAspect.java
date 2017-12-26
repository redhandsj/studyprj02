package org.rhpj.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MethodLoggingAspect {
	@Around("execution(* org.rhpj.service.*.*(..))")
	public Object log(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("Around メソッド開始: " + jp.getSignature());
		try {
			// 対象メソッド実行
			Object result = jp.proceed();
			System.out.println("Around メソッド正常終了: " + jp.getSignature() + " 戻り値=" + result);
			return result;
		}catch(Exception e) {
			System.out.println("Around メソッド異常終了: " + jp.getSignature());
			e.printStackTrace();
			throw e;
		}
	}
}

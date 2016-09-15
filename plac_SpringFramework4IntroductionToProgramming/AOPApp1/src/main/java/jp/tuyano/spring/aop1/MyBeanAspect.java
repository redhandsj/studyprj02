package jp.tuyano.spring.aop1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyBeanAspect {

	@AfterReturning(value="execution(* jp.tuyano.spring.aop1.IMyBean.toString())", returning="str")
	public void toStringAfterReturning(String str) {
		System.out.println("*toString returning...*");
		System.out.println("return:" + str);
		System.out.println("*...end toString returning*");
	}
	
	@AfterThrowing(value="execution(* jp.tuyano.spring.aop1.MyBean2.addData(..))", throwing="e")
	public void addDataAfterThrowing(Exception e) {
		System.out.println("*Except in addData...*");
		System.out.println(e.getLocalizedMessage());
		System.out.println("*...end Except in addData*");
	}
	
	@Around("execution(* jp.tuyano.spring.aop1.MyBean1.addData(..))")
	public void toStringAround(ProceedingJoinPoint joinPoint) {
		System.out.println("*around addData...*");
		System.out.println("before:" + joinPoint.getTarget());
		try {
			joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("after:" + joinPoint.getTarget());
		System.out.println("*...end around addData.*");
	}

	@Before("execution(* jp.tuyano.spring.aop1.IMyBean.addData(..))")
	public void addDataBefore(JoinPoint joinPoint) {
		System.out.println("*addData before...*");
		String args = "args: \"";
		for(Object ob : joinPoint.getArgs()){
			args += ob + "\" ";
		}
		System.out.println(args);
	}
}

package aopZhuJie;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;


@Aspect
public class ErrorLogger {
	
	@AfterThrowing(pointcut="execution(* service..*.*(..))",throwing="e")
	public void afterT170(JoinPoint p,RuntimeException e){
		System.out.println("************->"+p.getSignature().getName()+"·½·¨±¨´í£º"+e);
	}
}

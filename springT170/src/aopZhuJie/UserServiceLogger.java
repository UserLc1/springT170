package aopZhuJie;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 注解实现前置增强和后置增强AOP功能
 * @author cuiyi
 *
 */
@Aspect
public class UserServiceLogger {
	private static final Logger log = Logger.getLogger(UserServiceLogger.class);
	
	@Pointcut("execution(* service..*.*(..))")
	public void pointcut(){}
	
	/**
	 * 前置增强  【进入方法之前，会执行这个方法！】
	 * @param jp
	 */
	@Before("pointcut()")
	public void before(JoinPoint jp){
		log.info("调用【"+jp.getTarget()+"】的"+jp.getSignature().getName()+"方法，参数是："+Arrays.toString(jp.getArgs()));
	}
	
	/**
	 * 后置增强  【方法执行完之后，会执行这个方法！】
	 * @param jp
	 */
	@AfterReturning(pointcut="pointcut()",returning="result")
	public void afterReturning(JoinPoint jp,Object result){
		log.info("[-_-]调用【"+jp.getTarget()+"】的"+jp.getSignature().getName()+"方法，返回值是："+result);
	}
	
	
}

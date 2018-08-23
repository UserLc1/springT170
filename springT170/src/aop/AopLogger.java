package aop;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class AopLogger {
	
	private static final Logger log = Logger.getLogger(AopLogger.class);
	
	/**
	 * 前置增强  【进入方法之前，会执行这个方法！】
	 * @param jp
	 */
	public void before(JoinPoint jp){
		log.info("调用【"+jp.getTarget()+"】的"+jp.getSignature().getName()+"方法，参数是："+Arrays.toString(jp.getArgs()));
	}
	
	
	/**
	 * 后置增强  【方法执行完之后，会执行这个方法！】
	 * @param jp
	 */
	public void afterReturning(JoinPoint jp,Object result){
		log.info("[-_-]调用【"+jp.getTarget()+"】的"+jp.getSignature().getName()+"方法，返回值是："+result);
	}
	
}

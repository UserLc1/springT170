package aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

/**
 * 异常抛出增强
 * @author cuiyi
 *
 */
public class ErrorLogger {
	private static final Logger log = Logger.getLogger(ErrorLogger.class);
	
	public void afterThrowingT170(JoinPoint jp,RuntimeException e){
		log.error("[报错---------》]"+jp.getSignature().getName()+"方法抛出异常:"+e);
	}
	
	
}

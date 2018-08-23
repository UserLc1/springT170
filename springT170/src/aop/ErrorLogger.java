package aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

/**
 * �쳣�׳���ǿ
 * @author cuiyi
 *
 */
public class ErrorLogger {
	private static final Logger log = Logger.getLogger(ErrorLogger.class);
	
	public void afterThrowingT170(JoinPoint jp,RuntimeException e){
		log.error("[����---------��]"+jp.getSignature().getName()+"�����׳��쳣:"+e);
	}
	
	
}

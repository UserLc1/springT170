package aop;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class AopLogger {
	
	private static final Logger log = Logger.getLogger(AopLogger.class);
	
	/**
	 * ǰ����ǿ  �����뷽��֮ǰ����ִ�������������
	 * @param jp
	 */
	public void before(JoinPoint jp){
		log.info("���á�"+jp.getTarget()+"����"+jp.getSignature().getName()+"�����������ǣ�"+Arrays.toString(jp.getArgs()));
	}
	
	
	/**
	 * ������ǿ  ������ִ����֮�󣬻�ִ�������������
	 * @param jp
	 */
	public void afterReturning(JoinPoint jp,Object result){
		log.info("[-_-]���á�"+jp.getTarget()+"����"+jp.getSignature().getName()+"����������ֵ�ǣ�"+result);
	}
	
}

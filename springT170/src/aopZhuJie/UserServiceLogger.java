package aopZhuJie;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * ע��ʵ��ǰ����ǿ�ͺ�����ǿAOP����
 * @author cuiyi
 *
 */
@Aspect
public class UserServiceLogger {
	private static final Logger log = Logger.getLogger(UserServiceLogger.class);
	
	@Pointcut("execution(* service..*.*(..))")
	public void pointcut(){}
	
	/**
	 * ǰ����ǿ  �����뷽��֮ǰ����ִ�������������
	 * @param jp
	 */
	@Before("pointcut()")
	public void before(JoinPoint jp){
		log.info("���á�"+jp.getTarget()+"����"+jp.getSignature().getName()+"�����������ǣ�"+Arrays.toString(jp.getArgs()));
	}
	
	/**
	 * ������ǿ  ������ִ����֮�󣬻�ִ�������������
	 * @param jp
	 */
	@AfterReturning(pointcut="pointcut()",returning="result")
	public void afterReturning(JoinPoint jp,Object result){
		log.info("[-_-]���á�"+jp.getTarget()+"����"+jp.getSignature().getName()+"����������ֵ�ǣ�"+result);
	}
	
	
}

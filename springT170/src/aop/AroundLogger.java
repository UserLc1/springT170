package aop;

import java.util.Arrays;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 推荐
 * 定义包含增强方法的JavaBean     【推荐】
 */
public class AroundLogger {
	private static final Logger log = Logger.getLogger(AroundLogger.class);

	public Object aroundLogger(ProceedingJoinPoint jp) throws Throwable {
		log.info("【环绕前】调用 " + jp.getTarget() + " 的 " + jp.getSignature().getName()
				+ " 方法。方法入参：" + Arrays.toString(jp.getArgs()));
		try {
			Object result = jp.proceed();  //进入方法，然后访问值给result
			log.info("【环绕后】调用 " + jp.getTarget() + " 的 "
					+ jp.getSignature().getName() + " 方法。方法返回值：" + result);
			return result;
		} catch (Throwable e) {
			log.error(jp.getSignature().getName() + " 方法发生异常：" + e);
			throw e;
		} finally {
            log.info(jp.getSignature().getName() + " 方法结束执行。");
        }

	}
}
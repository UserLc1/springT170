package testSpringScope;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sun.java2d.pipe.SpanShapeRenderer.Simple;

public class Test1 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		ApplicationContext ac = new ClassPathXmlApplicationContext("testSpringScope//applicationContext-scope.xml");
	
		Date d1 = (Date)ac.getBean("singletonT170");
		
		SimpleDateFormat sf =  new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str1 = sf.format(d1);
		System.out.println(str1);
		
		
		Thread.sleep(5000);
		
		Date d2 = (Date)ac.getBean("singletonT170");
		String str2 = sf.format(d2);
		System.out.println(str2);
	}

}

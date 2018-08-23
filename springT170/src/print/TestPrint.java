package print;

import helloSpring.HelloSpring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPrint {
	
	@Test
	public void t2(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("print//applicationContext.xml");
		//找到需要使用的对象
		Print sp =(Print)ac.getBean("p");
		sp.print();
	}
	
	@Test
	public void t1(){
		Print p = new Print();
		p.print();
	}
}

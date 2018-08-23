package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import helloSpring.HelloSpring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.UserService;
import entity.User;

public class TestHelloSpring {
	
	@Test
	public void t6(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext--*.xml");
		//找到需要使用的对象
		UserService sp =(UserService)ac.getBean("userService");
		User user = new User();
		user.setUserCode("112");
		user.setUserName("BBB");
		user.setUserPassword("333");
		sp.saveNewUser(user);
	}
	
	@Test
	public void t5(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("aopZhuJie//applicationContext-aopZhuJie.xml");
		//找到需要使用的对象
		UserService sp =(UserService)ac.getBean("userService");
		sp.saveNewUser(null);
	}
	
	
	@Test
	public void t4(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext6_1.xml");
		//找到需要使用的对象
		User user =(User)ac.getBean("user");
		Properties p = user.getP();
		Set<Object> set = p.keySet();
		 Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			String key = (String) iterator.next();
			System.out.println(key+"   "+p.get(key));
		}
	}
	
	@Test
	public void t3(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//找到需要使用的对象
		UserService sp =(UserService)ac.getBean("userService");
		sp.saveNewUser(null);
	}
	
	@Test
	public void t2(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//找到需要使用的对象
		HelloSpring sp =(HelloSpring)ac.getBean("helloSpring");
		sp.print();
	}
	
	
	
	@Test
	public void t1(){
		HelloSpring helloSpring = new HelloSpring();
		helloSpring.setWho("T170");
		helloSpring.print();
	}
	
}

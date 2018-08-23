package service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import service.UserService;
import dao.UserDao;
import entity.User;


@Component("userService")//等价于<bean id="userService" class="service.impl.UserServiceImpl" />
public class UserServiceImpl implements UserService{
	
	//@Autowired   //属性自动装配[根据类型]
	//@Qualifier("userDao")
	@Resource(name="userDao")
	private UserDao userDao;
	
	
	@Override
	public void saveNewUser(User user) {
		userDao.addNewUser(user);
	}

	
}

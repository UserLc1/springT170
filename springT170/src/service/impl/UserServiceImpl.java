package service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import service.UserService;
import dao.UserDao;
import entity.User;


@Component("userService")//�ȼ���<bean id="userService" class="service.impl.UserServiceImpl" />
public class UserServiceImpl implements UserService{
	
	//@Autowired   //�����Զ�װ��[��������]
	//@Qualifier("userDao")
	@Resource(name="userDao")
	private UserDao userDao;
	
	
	@Override
	public void saveNewUser(User user) {
		userDao.addNewUser(user);
	}

	
}

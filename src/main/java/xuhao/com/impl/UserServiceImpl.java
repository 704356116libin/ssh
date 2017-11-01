package xuhao.com.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import xuhao.com.domin.User;
import xuhao.com.repository.UserDao;
import xuhao.com.service.UserService;

@Service("userServiceImpl")
@Transactional
public class UserServiceImpl implements UserService{
	public UserServiceImpl() {
		System.out.println("UserService被扫描");
	}
	@Resource
	private UserDao userDao;
	@Override
	public List<User> queryAllUser() {
		// TODO Auto-generated method stub
		return userDao.findAllUser();
	}

}

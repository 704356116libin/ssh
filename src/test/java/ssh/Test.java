package ssh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xuhao.com.common.ApplicationContextUtil;
import xuhao.com.impl.UserServiceImpl;


public class Test {
 private static UserServiceImpl userServiceImpl;
 public static void main(String[] args) {
	 ApplicationContext context=ApplicationContextUtil.getApplicationContext();
	  userServiceImpl=context.getBean("userServiceImpl",UserServiceImpl.class);
	  System.out.println(userServiceImpl.queryAllUser().size());
 }
}

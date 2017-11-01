package xuhao.com.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.opensymphony.xwork2.ActionSupport;

import xuhao.com.common.ApplicationContextUtil;
import xuhao.com.domin.User;
import xuhao.com.impl.UserServiceImpl;

public class UserAction extends ActionSupport {
	private static UserServiceImpl userServiceImpl;
	static{
		 ApplicationContext context=ApplicationContextUtil.getApplicationContext();
		 userServiceImpl=context.getBean("userServiceImpl",UserServiceImpl.class);
	}

	public String hello() {
		return "hello";
	}

	public String findAllUser() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		// session异常的话滚回去登录
		HttpSession session = request.getSession();
		List<User> users=userServiceImpl.queryAllUser();
		session.setAttribute("users", users);
		return "showUser";
	}
}

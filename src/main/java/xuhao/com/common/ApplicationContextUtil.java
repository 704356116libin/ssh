package xuhao.com.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextUtil {
	private static final ApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	public static ApplicationContext getApplicationContext(){
		return context;
	}
}

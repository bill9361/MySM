package com.bill.sm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bill.sm.controller.UserController;

/**
 * 作者Email:fengminbiao@126.com<br/>
 * 创建时间：2018年7月7日下午1:58:58<br/>
 * 类说明：主入口
 */
public class Main
{

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserController userController = (UserController) appContext.getBean("userController");
		userController.queryById("2d2c1902-d322-49e8-ab1d-b125a34d4fd7");
	}

}

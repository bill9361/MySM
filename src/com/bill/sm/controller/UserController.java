package com.bill.sm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bill.sm.model.entity.User;
import com.bill.sm.service.UserServiceImpl;

/**
 * 作者Email:fengminbiao@126.com<br/>
 * 创建时间：2018年7月7日下午1:53:38<br/>
 * 类说明：用户Controller
 */
@Component("userController")
public class UserController
{
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	public void queryById(String id)
	{
		User user = userServiceImpl.queryById(id);
		System.out.println(user);
	}
}

package com.bill.sm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bill.sm.model.dao.UserDao;
import com.bill.sm.model.entity.User;

/**
 * 作者Email:fengminbiao@126.com<br/>
 * 创建时间：2018年7月7日下午1:48:31<br/>
 * 类说明：用户业务类
 */
@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserDao userDao;
	
	@Override
	public User queryById(String id)
	{
		return userDao.queryById(id);
	}
}

package com.bill.sm.service;

import com.bill.sm.model.entity.User;

/**
 * 作者Email:fengminbiao@126.com<br/>
 * 创建时间：2018年7月7日下午1:52:53<br/>
 * 类说明：用户业务类接口
 */
public interface UserService
{

	public User queryById(String id);

}
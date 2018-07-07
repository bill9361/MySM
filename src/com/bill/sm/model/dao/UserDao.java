package com.bill.sm.model.dao;

import com.bill.sm.model.entity.User;

/**
 * 作者Email:fengminbiao@126.com<br/>
 * 创建时间：2018年7月7日下午1:35:29<br/>
 * 类说明：用户Dao接口
 */
public interface UserDao
{
	/**
	 * 根据Id查询数据
	 * @param id 用户Id
	 * @return
	 */
	public User queryById(String id);
	
	//根据Id删除用户
	//public int deleteById(String id);

	//插入一条用户数据
	//public int insert(User user);

	//public int insertSelective(User user);

	//public int updateByIdSelective(User user);
	//根据Id更新数据
	//public int updateById(User user);
}

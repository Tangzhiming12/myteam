package cn.itcast.springboot.service;

import java.util.List;

import cn.itcast.springboot.pojo.User;

public interface UserService {

	/**
	 * 根据用户的名称模糊查询用户列表
	 * @param userName 用户名称
	 * @return
	 */
	List<User> queryUsersByUserName(String userName);

	/**
	 * 根查询所有用户列表
	 * @return
	 */
	List<User> queryUsersAll();

}

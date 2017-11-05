package cn.itcast.springboot.service;

import java.util.List;

import cn.itcast.springboot.pojo.User;

public interface UserService {
	// 根据用户名模模糊查询并且根据年龄降序排序
	public List<User> findByUserNameLikeOrderByAgeDesc(String userName);

	//更新用户信息
	public User save(User user);
}

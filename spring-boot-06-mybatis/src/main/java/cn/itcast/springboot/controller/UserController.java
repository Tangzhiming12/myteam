package cn.itcast.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.springboot.pojo.User;
import cn.itcast.springboot.service.UserService;

@RequestMapping("/user")
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	/**
	 * 根据用户的名称模糊查询用户列表
	 * @param userName 用户名称
	 * @return
	 */
	@RequestMapping("/list/{userName}")
	public List<User> queryUsersByUserName(@PathVariable String userName){
		return userService.queryUsersByUserName(userName);
	}
	/**
	 * 根查询所有用户列表
	 * @return
	 */
	@RequestMapping("/list/all")
	public List<User> queryUsersAll(){
		return userService.queryUsersAll();
	}
	
	
}

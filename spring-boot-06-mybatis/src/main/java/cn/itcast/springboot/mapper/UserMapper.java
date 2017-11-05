package cn.itcast.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.itcast.springboot.pojo.User;

@Mapper
public interface UserMapper {
	/**
	 * 根据用户的名称模糊查询用户列表
	 * 
	 * @param userName
	 *            用户名称
	 * @return
	 */
	@Select("select * from tb_user where user_name like '%${userName}%'")
	List<User> queryUsersByUserName(@Param("userName")String userName);

	/**
	 * 根查询所有用户列表
	 * 
	 * @return
	 */
	List<User> queryUsers();
}

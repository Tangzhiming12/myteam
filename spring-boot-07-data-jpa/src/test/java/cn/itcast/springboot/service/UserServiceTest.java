package cn.itcast.springboot.service;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.springboot.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceTest {
	
	@Autowired
	private UserService userService;

	@Test
	public void testFindByUserNameLikeOrderByAgeDesc() {
		List<User> list = userService.findByUserNameLikeOrderByAgeDesc("%雷%");
		for (User user : list) {
			System.out.println(user);
		}
	}

	@Test
	public void testSave() {
		User user = new User();
		user.setId(7L);
		user.setUserName("黑马");
		user.setBirthday(new Date());
		user.setGender(1);
		
		userService.save(user);
	}

}

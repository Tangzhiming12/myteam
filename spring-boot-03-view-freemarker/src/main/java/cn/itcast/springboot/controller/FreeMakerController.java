package cn.itcast.springboot.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/fm")
@Controller
public class FreeMakerController {

	@RequestMapping("/query/{userId}")
	public String test1(@PathVariable Long userId, Map<String, Object> root) {
		//设置返回值；Spring MVC在解析形参的时候会将类型为Map的形参的初始化为返回结果的Map
		root.put("userId", userId);
		root.put("userName", "itcast-" + userId);
		
		//表示在templates文件夹下有user/test.ftl文件
		return "user/test";
	}
	
	@RequestMapping("/query2/{userId}")
	public ModelAndView test2(@PathVariable Long userId) {
		//设置返回值；Spring MVC在解析形参的时候会将类型为Map的形参的初始化为返回结果的Map
		ModelAndView mv = new ModelAndView("user/test");
		
		mv.addObject("userId", userId);
		mv.addObject("userName", "heima - " + userId);
		
		//表示在templates文件夹下有user/test.ftl文件
		return mv;
	}
}

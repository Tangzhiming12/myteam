package cn.itcast.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.springboot.properties.ItcastProperties;

@RestController //相当于@Controller和@ResponseBody对所有方法生效
//@Controller
public class HelloController {
	
	//第一种读取配置文件中配置项
	@Autowired
	private Environment enviroment;
	//第二种读取配置文件中配置项
	@Value("${cn.itcast.name}")
	private String itcastName;
	@Value("${cn.itcast.url}")
	private String itcastUrl;
	@Value("${com.itheima.name}")
	private String heimaName;
	//第二种读取配置文件中配置项
	@Autowired
	private ItcastProperties itcastProperties;
	
	@RequestMapping("/hello")
	//@ResponseBody
	public String sayHello() {
		System.out.println("-------------------第一种读取方式-------------------");
		System.out.println("cn.itcast.name=" + enviroment.getProperty("cn.itcast.name"));
		System.out.println("cn.itcast.url=" + enviroment.getProperty("cn.itcast.url"));
		System.out.println("com.itheima.name=" + enviroment.getProperty("com.itheima.name"));
		System.out.println("-------------------第二种读取方式-------------------");
		System.out.println("cn.itcast.name=" + itcastName);
		System.out.println("cn.itcast.url=" + itcastUrl);
		System.out.println("com.itheima.name=" + heimaName);
		System.out.println("-------------------第三种读取方式-------------------");
		System.out.println("cn.itcast.name=" + itcastProperties.getName());
		System.out.println("cn.itcast.url=" + itcastProperties.getUrl());
		
		return "Hello Spring Boot.";
	}

}

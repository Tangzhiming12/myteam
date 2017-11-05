package cn.itcast.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import cn.itcast.springboot.properties.ItcastProperties;

//引导类；表示默认扫描当前类所在的包及其子包的那些注解
@SpringBootApplication
//表示ItcastProperties使用了ConfigurationProperties注解并自动配置生效
@EnableConfigurationProperties(ItcastProperties.class)
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		
		SpringApplication springApplication = new SpringApplication(Application.class);
		springApplication.setBannerMode(Mode.OFF);//启动的时候不使用默认的banner
		springApplication.run(args);
	}

}

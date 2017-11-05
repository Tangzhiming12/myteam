package cn.itcast.springboot;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 如果是war包项目的话；那么需要在引导类的平级或者引导类自己继承SpringBootServletInitializer；重写configure方法
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		//所有的web请求将转由引导类来处理
		return builder.sources(Application.class);
	}

}

package cn.itcast.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ConfigurationProperties 读取application.properties文件的配置项值
 * prefix表示：读取的配置项以cn.itcast为前缀的配置项
 * ignoreUnknownFields表示：如果在application.properties文件的配置项在当前类中没有
 * 对应的属性的时候是否要忽略，true表示如果配置项存在但是类中没对应的属性则忽略
 */
@ConfigurationProperties(prefix="cn.itcast", ignoreUnknownFields=true)
public class ItcastProperties {

	private String name;
	private String url;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}

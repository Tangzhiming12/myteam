package cn.itcast.springboot.datasource;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
public class DataSourceConfiguration {
	
	/**
	 * 定制数据源
	 * 名称为dataSource
	 * 数据源的配置参数来自application.properties文件的以c3p0为前缀的配置项
	 */
	@Bean("dataSource")
	@Primary//如果有多个数据源，以这个为主
	@ConfigurationProperties(prefix="c3p0")
	public DataSource getDataSource() {
		return DataSourceBuilder.create().type(ComboPooledDataSource.class).build();
	}

}

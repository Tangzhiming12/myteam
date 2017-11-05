package cn.itcast.springboot.datasource;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 使用junit测试spring boot项目必须要添加@SpringBootTest
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DataSourceConfigurationTest {
	
	@Autowired
	private DataSource dataSource;

	@Test
	public void test() throws SQLException {
		Connection connection = dataSource.getConnection();
		System.out.println("111111111111111111111111111111111111");
		System.out.println(connection);
		System.out.println("222222222222222222222222222222222222");
	}

}

package com.redis.conn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.redis.conn.entity.DBConnect;
import com.redis.conn.service.DBConnectService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationConext.xml")
public class MySpringTest {

	@Autowired
	private DBConnectService service;
	
	@Test
	public void test1(){
		System.out.println("-------------------");
		DBConnect connect = new DBConnect("db0001", "localhost", "root", "root", "utf-8");
		System.out.println(service.insert(connect ));
		System.out.println("-------------------");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
			DataSource dataSource = ctx.getBean("dataSource", DataSource.class);
			String sql = "select * from redis_demo";
			Connection connection = dataSource.getConnection();
			Statement stm = connection.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				System.out.println("用户名为:");
				System.out.println(rs.getString(2));
			}
		} catch (BeansException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

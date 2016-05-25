package com.redis.conn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.redis.conn.dao.DBConnectDao;
import com.redis.conn.service.DBConnectService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationConext.xml")
public class MySpringTest {

	@Autowired
	private DBConnectService service;

	@Test
	public void test1() {
		System.out.println("-------------------");
		// DBConnect connect = new DBConnect("db0001", "localhost", "root",
		// "root", "utf-8");
		System.out.println(service.queryList());
		System.out.println("-------------------");
	}

	@Test
	public void queryList1() {
		System.out.println("-------------------");
		System.out.println(service.queryList1());
		System.out.println("-------------------");
	}

	@Test
	public void queryList() {
		System.out.println("-------------------");
		System.out.println(service.queryList(DBConnectDao.class));
		System.out.println("-------------------");
	}

	@Test
	public void get() {
		System.out.println("-------------------");
		System.out.println(service.get(Long.valueOf(1),DBConnectDao.class));
		System.out.println("-------------------");
	}
	
	@Test
	public void insert() {
	}
	
	
}

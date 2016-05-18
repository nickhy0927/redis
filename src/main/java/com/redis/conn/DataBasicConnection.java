package com.redis.conn;

import javax.sql.DataSource;

public class DataBasicConnection {

	private DataSource dataSource;
	
	public DataSource getDataSource() {
		return dataSource;
	}
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void init() {
		System.out.println("正在加载中...");
		System.out.println(dataSource);
	}
}

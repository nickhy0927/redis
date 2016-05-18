package com.redis.commons.unil;

import javax.sql.DataSource;

public class DataBasic {

	private DataSource dataSource;
	
	public DataSource getDataSource() {
		return dataSource;
	}
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void getDataSources(){
		System.out.println("正在数据化...");
		System.out.println(getDataSource());
	}
}

package com.redis.conn.service;

import java.util.List;

import com.redis.commons.service.CommonService;
import com.redis.conn.entity.DBConnect;

public interface DBConnectService  extends CommonService<DBConnect, Long> {
	
	public List<DBConnect> queryList();
	
	List<DBConnect> queryList1();
}

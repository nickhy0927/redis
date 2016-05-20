package com.redis.conn.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.redis.commons.service.impl.CommonServiceImpl;
import com.redis.conn.dao.DBConnectDao;
import com.redis.conn.entity.DBConnect;
import com.redis.conn.service.DBConnectService;

@Service
public class DBConnectServiceImpl extends CommonServiceImpl<DBConnect, Long> implements DBConnectService {

	@Override
	public List<DBConnect> queryList() {
		List<DBConnect> list = this.getSqlSession().selectList("com.redis.conn.entity.DBConnect.selectRedis");
		return list;
	}

	@Override
	public List<DBConnect> queryList1() {
		DBConnectDao connectDao = this.getSqlSession().getMapper(DBConnectDao.class);
		List<DBConnect> queryList = connectDao.queryList();
		return queryList;
	}
	
	

	
}

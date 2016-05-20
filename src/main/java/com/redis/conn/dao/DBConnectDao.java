package com.redis.conn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.redis.commons.dao.CommonDao;
import com.redis.conn.entity.DBConnect;

public interface DBConnectDao extends CommonDao<DBConnect, Long> {

	@Select("SELECT * FROM redis_demo")
	public List<DBConnect> queryList();
}

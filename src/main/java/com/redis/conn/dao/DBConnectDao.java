package com.redis.conn.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.redis.commons.dao.CommonDao;
import com.redis.conn.entity.DBConnect;

public interface DBConnectDao extends CommonDao<DBConnect, Long> {

	@Select("SELECT * FROM redis_demo")
	public List<DBConnect> queryList();

	@Insert("insert into redis_demo(dbname,dbip,dbpwd,dbusername,dbencoding) "
			+ " values(#{dbname},#{dbip},#{dbpwd},#{dbusername},#{dbencoding})")
	public void insert(DBConnect t);

	@Select("select * from redis_demo")
	public List<DBConnect> queryListByMap(Map<String, Object> paramsMap);

	@Select("select * from redis_demo where id = #{id}")
	public DBConnect get(Long id);

}

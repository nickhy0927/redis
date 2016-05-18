package com.redis.conn.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

import com.redis.commons.service.CommonDao;
import com.redis.conn.entity.DBConnect;

public interface DBConnectDao extends CommonDao<DBConnect, Long> {

    @Override
    @Insert("insert into redis_demo (dbname,dbip,dbpwd,dbusername,dbencoding) values(#{dbname},#{dbip},#{dbpwd},#{dbusername},#{dbencoding})")
    @Options(useGeneratedKeys=true, keyProperty="id")
    void insert(DBConnect dbConnect);
}

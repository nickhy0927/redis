package com.redis.conn.service;

import com.redis.commons.service.CommonService;
import com.redis.conn.entity.DBConnect;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

public interface DBConnectService extends CommonService<DBConnect, Long> {

    @Override
    @Insert("insert into redis_demo (dbname,dbip,dbpwd,dbusername,dbencoding) values(#{dbname},#{dbip},#{dbpwd},#{dbusername},#{dbencoding})")
    @Options(useGeneratedKeys=true, keyProperty="id")
    void insert(DBConnect dbConnect);
}

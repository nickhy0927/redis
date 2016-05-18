package com.redis.conn.service.impl;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redis.conn.dao.DBConnectDao;
import com.redis.conn.entity.DBConnect;
import com.redis.conn.service.DBConnectService;

@Service
public class DBConnectServiceImpl extends SqlSessionDaoSupport implements DBConnectService {
	/** 
     * Autowired 必须要有 
     */  
    @Autowired  
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){  
        super.setSqlSessionFactory(sqlSessionFactory);  
    }  
    
	@Override
	public int insert(DBConnect connect) {
		DBConnectDao mapper = this.getSqlSession().getMapper(DBConnectDao.class);
		System.out.println(mapper);
		return 1;
	}

}

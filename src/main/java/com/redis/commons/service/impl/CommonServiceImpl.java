package com.redis.commons.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import com.redis.commons.dao.CommonDao;
import com.redis.commons.service.CommonService;

@SuppressWarnings("unchecked")
public class CommonServiceImpl<T,ID extends Serializable> extends SqlSessionDaoSupport implements CommonService<T, ID>{
	/** 
     * Autowired 必须要有 
     */  
    @Autowired  
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){  
        super.setSqlSessionFactory(sqlSessionFactory);  
    }

	@Override
	public List<T> queryListByMap(Map<String, Object> paramsMap) {
		return null;
	}

	@Override
	public int insert(T t, Serializable type) {
		CommonDao<T, ID> mapper = (CommonDao<T, ID>) this.getSqlSession().getMapper((Class<T>) type);
		System.out.println(mapper);
		mapper.insert(t);
		return 0;
	}

	@Override
	public List<T> queryList(Serializable type) {
		CommonDao<T, ID> mapper = (CommonDao<T, ID>) this.getSqlSession().getMapper((Class<T>) type);
		List<T> list = mapper.queryList();
		return list;
	}

	@Override
	public T get(ID id, Serializable type) {
		return null;
	}

	@Override
	public void save(T t, Serializable type) {
		
	}

	
}

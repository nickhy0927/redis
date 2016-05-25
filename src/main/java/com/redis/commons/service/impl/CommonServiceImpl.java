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
public class CommonServiceImpl<T, ID extends Serializable> extends SqlSessionDaoSupport
		implements CommonService<T, ID> {
	/**
	 * Autowired 必须要有
	 */
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	/**
	 * 根据条件查询
	 */
	@Override
	public List<T> queryListByMap(Map<String, Object> paramsMap, Serializable type) {
		return null;
	}

	/**
	 * 插入数据
	 */
	@Override
	public T insert(T t, Serializable type) {
		CommonDao<T, ID> mapper = (CommonDao<T, ID>) this.getSqlSession().getMapper((Class<T>) type);
		mapper.insert(t);
		return t;
	}

	/**
	 * 查询所以的数据
	 */
	@Override
	public List<T> queryList(Serializable type) {
		CommonDao<T, ID> mapper = (CommonDao<T, ID>) this.getSqlSession().getMapper((Class<T>) type);
		List<T> list = mapper.queryList();
		return list;
	}

	/**
	 * 根据ID查询一条数据
	 */
	@Override
	public T get(ID id, Serializable type) {
		CommonDao<T, ID> mapper = (CommonDao<T, ID>) this.getSqlSession().getMapper((Class<T>) type);
		T t = mapper.get(id);
		return t;
	}
}

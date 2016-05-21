package com.redis.commons.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface CommonService<T, ID extends Serializable> {

	public List<T> queryListByMap(Map<String, Object> paramsMap,Serializable type);

	T insert(T t, Serializable type);

	List<T> queryList(Serializable type);

	T get(ID id, Serializable type);
}

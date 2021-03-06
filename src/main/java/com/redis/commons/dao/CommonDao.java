package com.redis.commons.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface CommonDao<T, ID extends Serializable> {

    public void insert(T t);

    public List<T> queryListByMap(Map<String, Object> paramsMap);
    
    List<T> queryList();
    
    T get(ID id);
}

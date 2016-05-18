package com.redis.commons.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface CommonService<T, ID extends Serializable> {

    public int insert(T t);

    public List<T> queryListByMap(Map<String, Object> paramsMap);
}

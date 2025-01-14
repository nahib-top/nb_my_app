package com.nb.my_app.service;

public interface RedisService {
    void save(String key,Object value);
    Object get(String key);

    Boolean delete(String key);
}

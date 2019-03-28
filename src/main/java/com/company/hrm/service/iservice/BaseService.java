package com.company.hrm.service.iservice;

import java.util.List;

public interface BaseService<T> {
    void save(T t);
    void delete(T t);
    void update(T t);
    T findById(Integer id);
    List<T> findAll();
}

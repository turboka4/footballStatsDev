package com.gus.dao;

import java.util.List;

public interface EntityDao<T> {
    List<T> findAll();
    T findById(int id);
    void persist(T entity);
}

package com.harium.database.model;

import java.util.List;

public interface BaseDAO<T, C> {
    void init(C connection);

    List<T> queryAll();

    int create(T model);

    int update(T model);

    int delete(T model);

    Class<T> getKlass();
}
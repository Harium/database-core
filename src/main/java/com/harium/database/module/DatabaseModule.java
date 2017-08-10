package com.harium.database.module;

import com.harium.database.model.BaseDAO;

public interface DatabaseModule<T> {
    void init(boolean clearDatabase);

    void register(BaseDAO<?, T> dao);

    void clear() throws Exception;

    BaseDAO getDAO(Class klass);
}
package com.team11;

import java.util.List;

public interface CRUD<T> {
    void delete(T entry);
    void create(T entry);
    void update(int id, T entry);
    T findById(int id);
    List<T> findAll();
}

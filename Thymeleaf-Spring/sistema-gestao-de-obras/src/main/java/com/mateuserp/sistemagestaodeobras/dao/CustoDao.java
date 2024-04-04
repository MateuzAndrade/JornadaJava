package com.mateuserp.sistemagestaodeobras.dao;

import java.util.List;

import com.mateuserp.sistemagestaodeobras.model.Custo;

public interface CustoDao {

    void save(Custo custo);

    void update(Custo custo);

    void delete(Long id);

    Custo findById(Long id);

    List<Custo> findAll();

}

package com.mateuserp.sistemagestaodeobras.dao;

import java.util.List;

import com.mateuserp.sistemagestaodeobras.model.Obra;

public interface ObraDao {

    void save(Obra obra);

    void update(Obra obra);

    void delete(Long id);

    Obra findById(Long id);

    List<Obra> findAll();

}

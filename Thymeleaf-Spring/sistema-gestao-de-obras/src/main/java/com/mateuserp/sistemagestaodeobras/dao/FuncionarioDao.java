package com.mateuserp.sistemagestaodeobras.dao;

import java.util.List;

import com.mateuserp.sistemagestaodeobras.model.Funcionario;

public interface FuncionarioDao {

    void save (Funcionario Funcionario);

    void update (Funcionario funcionario);

    void delete (Long id);

    Funcionario findById(Long id);

    List<Funcionario> findAll();
}

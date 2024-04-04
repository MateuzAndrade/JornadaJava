package com.mateuserp.sistemagestaodeobras.service;

import java.util.List;

import com.mateuserp.sistemagestaodeobras.model.Cargo;

public interface FuncionarioService {

    void salvar(Cargo cargo);

    void editar(Cargo cargo);

    void excluir(Long id);

    Cargo buscarPorId(Long id);

    List<Cargo> buscarTodos();
}

package com.mateuserp.sistemagestaodeobras.service;

import java.util.List;

import com.mateuserp.sistemagestaodeobras.model.Cargo;
import com.mateuserp.sistemagestaodeobras.model.Custo;

public interface CustoService {
    void salvar(Custo custo);

    void editar(Custo custo);

    void excluir(Long id);

    Custo buscarPorId(Long id);

    List<Custo> buscarTodos();
}

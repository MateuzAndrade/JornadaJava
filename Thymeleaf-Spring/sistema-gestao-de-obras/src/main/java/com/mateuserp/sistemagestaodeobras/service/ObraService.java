package com.mateuserp.sistemagestaodeobras.service;

import java.util.List;

import com.mateuserp.sistemagestaodeobras.model.Obra;

public interface ObraService {

    void salvar(Obra obra);

    void editar(Obra obra);

    void excluir(Long id);

    Obra buscarPorId(Long id);

    List<Obra> buscarTodos();
}

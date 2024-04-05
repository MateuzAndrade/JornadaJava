package com.mateuserp.sistemagestaodeobras.service;

import java.util.List;

import com.mateuserp.sistemagestaodeobras.model.Funcionario;

public interface FuncionarioService {

    void salvar(Funcionario funcionario);

    void editar(Funcionario funcionario);

    void excluir(Long id);

    Funcionario buscarPorId(Long id);

    List<Funcionario> buscarTodos();
}

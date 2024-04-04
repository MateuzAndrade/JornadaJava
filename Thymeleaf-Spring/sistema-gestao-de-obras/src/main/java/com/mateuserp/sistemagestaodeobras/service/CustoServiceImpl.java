package com.mateuserp.sistemagestaodeobras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mateuserp.sistemagestaodeobras.dao.CustoDao;
import com.mateuserp.sistemagestaodeobras.model.Cargo;
import com.mateuserp.sistemagestaodeobras.model.Custo;

@Service
@Transactional(readOnly = false)
public class CustoServiceImpl implements CustoService {

    @Autowired
    private CustoDao dao;

    @Override
    @Transactional(readOnly = false)
    public void salvar(Custo custo) {
        dao.save(custo);
    }

    @Override
    @Transactional(readOnly = false)
    public void editar(Custo custo) {
        dao.update(custo);
    }

    @Override
    @Transactional(readOnly = false)
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Custo buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Custo> buscarTodos() {
        return dao.findAll();
    }

}

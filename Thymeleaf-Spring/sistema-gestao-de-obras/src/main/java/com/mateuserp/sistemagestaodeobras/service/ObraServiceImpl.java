package com.mateuserp.sistemagestaodeobras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mateuserp.sistemagestaodeobras.dao.ObraDao;
import com.mateuserp.sistemagestaodeobras.model.Obra;

@Service
@Transactional(readOnly = false)
public class ObraServiceImpl implements ObraService {

    @Autowired 
    private ObraDao dao;

    @Override @Transactional(readOnly = false)
    public void salvar(Obra obra) {
        dao.save(obra);
    }

    @Override @Transactional(readOnly = false)
    public void editar(Obra obra) {
        dao.update(obra);
    }

    @Override @Transactional(readOnly = false)
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override @Transactional(readOnly = true)
    public Obra buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override @Transactional(readOnly = true)
    public List<Obra> buscarTodos() {
        return dao.findAll();
    }

}

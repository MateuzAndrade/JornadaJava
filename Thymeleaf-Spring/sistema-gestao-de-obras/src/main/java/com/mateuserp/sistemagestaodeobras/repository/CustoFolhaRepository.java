package com.mateuserp.sistemagestaodeobras.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateuserp.sistemagestaodeobras.model.CustoFolha;
import com.mateuserp.sistemagestaodeobras.model.Funcionario;
import com.mateuserp.sistemagestaodeobras.model.Obra;

public interface CustoFolhaRepository extends JpaRepository<CustoFolha, Long> {
    
    List<CustoFolha> findByDescricaoContaining (String descricao);
    List<CustoFolha> findByObra(Obra obra);
    List<CustoFolha> findByFuncionario(Funcionario funcionario);

}

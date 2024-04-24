package com.mateuserp.sistemagestaodeobras.repository;

import java.util.List;
import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mateuserp.sistemagestaodeobras.model.CustoFolha;
import com.mateuserp.sistemagestaodeobras.model.Funcionario;
import com.mateuserp.sistemagestaodeobras.model.Obra;

@Repository
public interface CustoFolhaRepository extends JpaRepository<CustoFolha, Long> {
    
    List<CustoFolha> findByDescricaoContaining (String descricao);
    List<CustoFolha> findByObra(Obra obra);
    List<CustoFolha> findByFuncionario(Funcionario funcionario);

    @Query(value = "SELECT COALESCE(SUM(valor), 0) FROM CUSTOSFOLHA", nativeQuery = true)
    BigDecimal sumValor();

}

package com.mateuserp.sistemagestaodeobras.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mateuserp.sistemagestaodeobras.model.CustoFolha;
import com.mateuserp.sistemagestaodeobras.model.Funcionario;
import com.mateuserp.sistemagestaodeobras.model.Obra;

@Repository
public interface CustoFolhaRepository extends JpaRepository<CustoFolha, Long> {
    
    List<CustoFolha> findByDescricaoContaining (String descricao);
    List<CustoFolha> findByObra(Obra obra);
    List<CustoFolha> findByFuncionario(Funcionario funcionario);

    @Query(value = "SELECT COALESCE(SUM(valor), 0) FROM custosfolha", nativeQuery = true)
    BigDecimal sumValor();


    @Query(value = "SELECT COALESCE(SUM(c.valor), 0) FROM custosfolha c WHERE c.obra_id_fk  = :obraId", nativeQuery = true)
    BigDecimal sumValorByObra(@Param("obraId") Long obraId);

}

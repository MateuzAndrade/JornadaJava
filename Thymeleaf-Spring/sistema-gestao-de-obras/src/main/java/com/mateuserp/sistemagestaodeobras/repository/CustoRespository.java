package com.mateuserp.sistemagestaodeobras.repository;

import org.apache.logging.log4j.util.BiConsumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.math.BigDecimal;

import com.mateuserp.sistemagestaodeobras.model.Custo;
import com.mateuserp.sistemagestaodeobras.model.Obra;

@Repository
public interface CustoRespository extends JpaRepository<Custo, Long> {

    List<Custo> findByDescricaoContaining (String descricao);
    List<Custo> findByObra(Obra obra);
    
    @Query(value = "SELECT COALESCE(SUM(valor), 0) FROM custos", nativeQuery = true)
    BigDecimal sumValor();
    
    @Query(value = "SELECT COALESCE(SUM(c.valor), 0) FROM custos c WHERE c.obra_id_fk  = :obraId", nativeQuery = true)
    BigDecimal sumValorByObra(@Param("obraId") Long obraId);

}

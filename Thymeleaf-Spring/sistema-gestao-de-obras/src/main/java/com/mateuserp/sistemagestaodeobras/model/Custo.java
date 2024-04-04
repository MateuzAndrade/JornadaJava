package com.mateuserp.sistemagestaodeobras.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CUSTOS")
public class Custo extends AbstractEntity<Long> {

    @Column(name = "descricao", nullable = false, unique = true, length = 200)
    @Getter
    @Setter
    private String descricao;

    @Column(name = "valor", nullable = false, unique = true)
    @Getter
    @Setter
    private Double Valor;

    @ManyToOne
    @JoinColumn(name = "obra_id_fk")
    @Getter
    @Setter
    private Obra obra;
}

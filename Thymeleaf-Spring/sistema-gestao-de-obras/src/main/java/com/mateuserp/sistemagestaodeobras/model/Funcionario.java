package com.mateuserp.sistemagestaodeobras.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "FUNCIONARIOS")
public class Funcionario extends AbstractEntity<Long> {

    @Column(name = "nome", nullable = false, unique = true, length = 200)
    @Getter
    @Setter
    private String nome;

    @Column(name = "salario", nullable = false)
    @Getter
    @Setter
    private BigDecimal salario;

    @Column(name = "chavePix", nullable = false, unique = true, length = 200)
    @Getter
    @Setter
    private BigDecimal chavePix;

    @Column(name = "data_entrada", nullable = false, columnDefinition = "DATE")
    @Getter
    @Setter
    private LocalDate dataEntrada;

    @ManyToOne
    @JoinColumn(name = "cargo_id_fk")
    @Getter
    @Setter
    private Cargo cargo;

    @ManyToOne
    @JoinColumn(name = "obra_id_fk")
    @Getter
    @Setter
    private Obra obra;

}

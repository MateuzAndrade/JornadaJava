package com.mateuserp.sistemagestaodeobras.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "FUNCIONARIOS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Funcionario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
    private String chavePix;

    @DateTimeFormat(iso = ISO.DATE)
    @Column(name = "data_entrada", nullable = false, columnDefinition = "DATE")
    @Getter
    @Setter
    private LocalDate dataEntrada;

    @ManyToOne
    @JoinColumn(name = "cargo_id_fk")
    @Getter
    @Setter
    private Cargo cargo;

}

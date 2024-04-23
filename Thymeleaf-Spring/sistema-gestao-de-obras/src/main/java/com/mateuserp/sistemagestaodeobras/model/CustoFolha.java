package com.mateuserp.sistemagestaodeobras.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CUSTOSFOLHA")
@Getter
@Setter
@EqualsAndHashCode(of = "id" )
public class CustoFolha {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Column(name = "valor", nullable = false, unique = false)
    @Getter
    @Setter
    private BigDecimal valor;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "dataCusto", nullable = false, unique = false)
    @Getter
    @Setter
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "obra_id_fk")
    @Getter
    @Setter
    private Obra obra;

    @ManyToOne
    @JoinColumn(name = "fucnionario_id_fk")
    @Getter
    @Setter
    private Funcionario funcionario;

    @Column(name = "descricao", nullable = false, unique = false, length = 200)
    @Getter
    @Setter
    private String descricao;

}

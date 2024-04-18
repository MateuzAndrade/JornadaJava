package com.mateuserp.sistemagestaodeobras.model;

import java.io.Serial;
import java.math.BigDecimal;
import java.util.Date;

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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "CUSTOS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Custo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descricao", nullable = false, unique = false, length = 200)
    @Getter
    @Setter
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "obra_id_fk")
    @Getter
    @Setter
    private Obra obra;
    
    @Column(name = "valor", nullable = false, unique = false)
    @Getter
    @Setter
    private BigDecimal valor;

    @Column(name = "quantidade", nullable = false, unique = false)
    @Getter
    @Setter
    private Integer quantidade;

    @Column(name = "unidade_medida", nullable = false, unique = false)
    @Getter
    @Setter
    private String unidadeMedida;

    @DateTimeFormat(iso = ISO.DATE)
    @Temporal(TemporalType.DATE)
    @Column(name = "dataCusto", nullable = false, unique = false)
    @Getter
    @Setter
    private Date data;

}

package com.pegmatita.LocadoraDeCarros.model;

import java.time.Year;
import java.util.Date;

import javax.annotation.processing.Generated;

import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "carro")
public class Carro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	private String marca;
	
	private String modelo;
	
	private Integer anoFabricacao;
	
	private Integer anoModelo;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataCadastro;
	
}

package com.pegmatita.LocadoraDeCarros.model;

import java.time.Year;
import java.util.Date;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "carro")
public class Carro {
	
	@Id
	private Long Id;
	
	private String marca;
	
	private String modelo;
	
	@DateTimeFormat(pattern = "yyyy")
	private Year anoFabricacao;
	
	@DateTimeFormat(pattern = "yyyy")
	private Year anoModelo;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataCadastro;
	
}

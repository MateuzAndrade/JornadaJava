package com.pegmatita.LocadoraDeCarros.model;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "endereco")
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String rua;
	
	private String bairro;
	
	private String cidade;
	
	private Estato estado;
	
	private String cep;

	@OneToMany
	private List<Cliente> clientes;

}

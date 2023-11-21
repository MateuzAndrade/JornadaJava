package br.com.LocadoraCarros.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Carro {
	public String marca;
	public String modelo;
	public String anoModelo;
	public String anoFabricacao;

	public Carro() {
	}
}
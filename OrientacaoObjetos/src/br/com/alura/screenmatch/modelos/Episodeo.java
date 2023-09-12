package br.com.alura.screenmatch.modelos;

public class Episodeo {
	private int numero;
	private String nome;
	private Serie serie;
	
	public int getNumero() {
		return numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Serie getSerie() {
		return serie;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSerie(Serie serie) {
		this.serie = serie;
	}

}

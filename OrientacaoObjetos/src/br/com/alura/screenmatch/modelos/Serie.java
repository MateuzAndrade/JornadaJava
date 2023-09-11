package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
	private int temporadas;
	private int episodeosPorTemporada;
	private int minutosPorEpisodeo;
	
	public int getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	public int getEpisodeosPorTemporada() {
		return episodeosPorTemporada;
	}
	public void setEpisodeosPorTemporada(int episodeosPorTemporada) {
		this.episodeosPorTemporada = episodeosPorTemporada;
	}
	public int getMinutosPorEpisodeo() {
		return minutosPorEpisodeo;
	}
	public void setMinutosPorEpisodeo(int minutosPorEpisodeo) {
		this.minutosPorEpisodeo = minutosPorEpisodeo;
	}
	
	//sobrescrevendo
	@Override
	public int getDuracaoEmMinutos() {
		return (temporadas*episodeosPorTemporada*minutosPorEpisodeo);
	}
	//sobrescrevendo
	@Override
	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		super.setDuracaoEmMinutos(duracaoEmMinutos);
	}


	}

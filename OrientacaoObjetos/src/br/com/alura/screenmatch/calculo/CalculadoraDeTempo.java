package br.com.alura.screenmatch.calculo;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
	private int tempoTotal;

	public int getTempoTotal() {
		return tempoTotal;
	}
	
	public void inclui (Titulo titulo) {
		System.out.println("Adicionando Duracao em Minutos de : " + titulo.getNome()+"Com tempo de: " +titulo.getDuracaoEmMinutos() );
		tempoTotal += titulo.getDuracaoEmMinutos();
		
	}
}

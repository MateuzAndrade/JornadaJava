package br.com.alura.screenmatch.calculo;

public class FiltroRecomendacao {
	
	public void filtra(Classificavel classificavel) {
		if (classificavel.getClassificacao()>= 4) {
			System.out.println("Está entre os Preferidos do Momento!");
		} else if (classificavel.getClassificacao() >= 2) {
			System.out.println("Muito bem avaliado no moemnto");
		} else {
			System.out.println("Assista depois.");
		}

	}
}

package com.alura.desafio;

import com.alura.desafio.playes.Classificacao;
import com.alura.desafio.playes.Podcast;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReprodutorAudioApplication {

	public static void main(String[] args) {

		Podcast alo = new Podcast();
		alo.setClassificacao(Classificacao.culturaGeek);

	}

}

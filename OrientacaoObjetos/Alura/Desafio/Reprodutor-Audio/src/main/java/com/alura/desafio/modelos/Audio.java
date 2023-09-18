package com.alura.desafio.modelos;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public abstract class Audio {


    private  String titulo;

    private  int duracaoMinutos;

    private int totalReproducao;

    private Classificacao classificacao;

    public void play(){
        System.out.println("Tocando");
        totalReproducao++;

    }
    public void stop(){

        System.out.println("Pausando");
    }

}

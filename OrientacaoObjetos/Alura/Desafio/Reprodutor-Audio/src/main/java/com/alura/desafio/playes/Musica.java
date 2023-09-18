package com.alura.desafio.playes;

import com.alura.desafio.modelos.Audio;
import lombok.*;

@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor
public class Musica extends Audio {
    private String cantor;

    private Classificacao classificacao;

}

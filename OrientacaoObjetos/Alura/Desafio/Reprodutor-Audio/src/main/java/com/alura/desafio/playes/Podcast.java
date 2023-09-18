package com.alura.desafio.playes;

import com.alura.desafio.modelos.Audio;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Podcast extends Audio {

    private Classificacao classificacao;

}

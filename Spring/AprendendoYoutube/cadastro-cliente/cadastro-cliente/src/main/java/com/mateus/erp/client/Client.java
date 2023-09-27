package com.mateus.erp.client;


import jakarta.persistence.*;
import lombok.*;

@Table(name = "tb_client", schema = "list_client")
@Entity(name = "client")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Client {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    @Enumerated()
    private Atendimento atendimento;

    public Client(DadosCadastroCliente dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.cpf = dados.cpf();
        this.atendimento = dados.atendimento();
        this.telefone = dados.telefone();

    }

    public void atualizarInformacoes(DadosAtualizacaoClient dados) {
        if (dados.telefone() != null) {
            this.telefone = dados.telefone();
        }
        if (dados.atendimento() != null) {
            this.atendimento = dados.atendimento();
        }

    }
}

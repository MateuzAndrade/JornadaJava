package com.mateus.erp.client;

import com.mateus.erp.endereco.DadosEndereco;
import com.mateus.erp.endereco.Endereco;
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
    private String cpf;
    @Enumerated(EnumType.STRING)
    private Atendimento atendimento;
    @Embedded
    private Endereco endereco;

    public Client(DadosCadastroCliente dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.cpf = dados.cpf();
        this.atendimento = (dados.atendimento());
        this.endereco = new Endereco(dados.endereco());
    }
}

package dev.PLJrInterprise.CadastroDeNinjas.Ninjas;

import dev.PLJrInterprise.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


// O Entity transforma uma classe em uma entidade do DB
@Entity
@Table(name = "tb_cadastro") // É uma boa prática escrever tudo em minúsculo e separado pelo underline, juntamente do tb, que representa "table"
@NoArgsConstructor
@AllArgsConstructor // Se eu passar um novo parametro, ele adiciona esse novo parametro automaticamente
@Data
public class NinjaModel { // Numa aplicação Spring, no prefixo eu sempre vou pôr o nome da classe que eu estou trabalhando, e no sufixo, o que eu vou trabalhar
    // Como nesse caso vou trabalhar com o modelo da classe, coloquei a palavrinha "model" como sufixo

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Serve para gerar um numero para Id
    private Long id; // O id nós só declaramos, mas quem vai fazer o trabalho com ele é o próprio Java, não eu

    @Column(name = "nome") // Adiciona uma coluna de nome para os ninjas
    private String nome;

    @Column(unique = true) // Isso quer dizer que essa coluna é única, que ninguém pode ter outro email igual
    private String email;

    @Column(name = "img_url")
    private String imgURL;

    private Integer idade;

    // @ManyToOne ⇾ Um ninja tem uma única missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreigner Key -> Chave estrangeira
    private MissoesModel tb_missoes;

}

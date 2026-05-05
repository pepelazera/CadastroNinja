package dev.PLJrInterprise.CadastroDeNinjas.Missoes;

import dev.PLJrInterprise.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "missoes")
@NoArgsConstructor // Cria um construtor vazio sem eu ver. Ele faz essa construção automaticamente
@AllArgsConstructor // Mesma coisa só que para um construtor com todos os argumentos
@Data // Cria todos os Getters e Setters automaticamente também
public class MissoesModel {

    /*
        Aqui, vai ser criada uma tabela com as informações abaixo
    */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String nome;

    private String dificuldade;

    // @OneToMany ⇾ Uma missão vai ter vários ninjas
    @OneToMany (mappedBy = "missoes") // Aqui, eu mapeei ambas das tabelas por meio da chave estrangeira
    private List<NinjaModel> cadastro; // Uma missão pode ter vários ninjas fazendo essa missão. Ou seja, uma missão pode receber vários ninjas, mas um ninja só pode receber uma missão

}

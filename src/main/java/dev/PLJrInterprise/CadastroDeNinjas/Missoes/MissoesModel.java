package dev.PLJrInterprise.CadastroDeNinjas.Missoes;

import dev.PLJrInterprise.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "/missoes")
public class MissoesModel {

    /*
        Aqui, vai ser criada uma tabela com as informações abaixo
    */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    // @OneToMany ⇾ Uma missão vai ter vários ninjas
    @OneToMany
    private NinjaModel ninja; // Uma missão pode ter vários ninjas fazendo essa missão. Ou seja, uma missão pode receber vários ninjas, mas um ninja só pode receber uma missão



    // No args constructor
    public MissoesModel() {
    }

    // All args constructor
    public MissoesModel(Long id, String nome, String dificuldade, NinjaModel ninja) {
        this.id = id;
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.ninja = ninja;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public NinjaModel getNinja() {
        return ninja;
    }

    public void setNinja(NinjaModel ninja) {
        this.ninja = ninja;
    }
}

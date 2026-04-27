package dev.PLJrInterprise.CadastroDeNinjas;
import jakarta.persistence.*;

// O Entity transforma uma classe em uma entidade do DB
@Entity
@Table(name = "tb_cadastro") // É uma boa prática escrever tudo em minúsculo e separado pelo underline, juntamente do tb, que representa "table"
public class NinjaModel { // Numa aplicação Spring, no prefixo eu sempre vou pôr o nome da classe que eu estou trabalhando, e no sufixo, o que eu vou trabalhar
    // Como nesse caso vou trabalhar com o modelo da classe, coloquei a palavrinha "model" como sufixo

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Serve para gerar um numero para Id
    Long id; // O id nós só declaramos, mas quem vai fazer o trabalho com ele é o próprio Java, não eu
    String nome;
    String email;
    Integer idade;

    // No args constructor
    public NinjaModel() {
    }

    // All args constructors
    public NinjaModel(String nome, String email, Integer idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}

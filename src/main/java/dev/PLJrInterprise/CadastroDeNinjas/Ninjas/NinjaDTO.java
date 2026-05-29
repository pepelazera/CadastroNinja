package dev.PLJrInterprise.CadastroDeNinjas.Ninjas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.PLJrInterprise.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {

    // Agora, quem vai conversar com o service vai ser o DTO

    private Long id;

    private String nome;

    private String email;

    private String imgURL;

    private Integer idade;

    private String rank;

    private MissoesModel tb_missoes;
}

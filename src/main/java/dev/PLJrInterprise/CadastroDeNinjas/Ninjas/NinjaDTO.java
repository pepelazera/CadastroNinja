package dev.PLJrInterprise.CadastroDeNinjas.Ninjas;

import dev.PLJrInterprise.CadastroDeNinjas.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaDTO {

    // Data Transfer Object

    private Long id;

    private String nome;

    private String email;

    private String img_Url;

    private Integer idade;

    private String rank;

    private MissoesModel missoes;

}

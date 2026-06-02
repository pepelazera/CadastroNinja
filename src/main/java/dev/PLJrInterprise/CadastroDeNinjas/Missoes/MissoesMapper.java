package dev.PLJrInterprise.CadastroDeNinjas.Missoes;

import dev.PLJrInterprise.CadastroDeNinjas.Ninjas.NinjaModel;
import org.springframework.stereotype.Component;

@Component
public class MissoesMapper {

    public MissoesModel map(MissoesDTO missoesDTO) {

        MissoesModel missoesModel = new MissoesModel();

        missoesModel.setId(missoesModel.getId());
        missoesModel.setNome(missoesDTO.getNome());
        missoesModel.setDificuldade(missoesDTO.getDificuldade());
        missoesModel.setCadastro(missoesDTO.getCadastro());

        return missoesModel;
    }

    public MissoesDTO map(MissoesModel missoesModel) {

        MissoesDTO missoesDTO = new MissoesDTO();

        missoesDTO.setId(missoesModel.getId());
        missoesDTO.setNome(missoesModel.getNome());
        missoesDTO.setDificuldade(missoesModel.getDificuldade());
        missoesDTO.setCadastro(missoesModel.getCadastro());

        return missoesDTO;
    }
}

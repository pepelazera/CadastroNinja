package dev.PLJrInterprise.CadastroDeNinjas.Missoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {
    
    @Autowired
    private MissoesRepository missoesRepository;
    
    public List<MissoesModel> listarMissoes() {
        return missoesRepository.findAll();
    }

    public MissoesModel listarMissoesPorId(Long id) {
        Optional<MissoesModel> listarPorId = missoesRepository.findById(id);
        return listarPorId.orElse(null);
    }

    public MissoesModel adicionarMissao(MissoesModel missoesModel) {
        return missoesRepository.save(missoesModel);
    }

    public void deletarMissaoPorId(Long id) {
        missoesRepository.deleteById(id);
    }
}

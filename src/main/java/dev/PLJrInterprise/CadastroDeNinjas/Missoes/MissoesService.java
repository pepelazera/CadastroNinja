package dev.PLJrInterprise.CadastroDeNinjas.Missoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MissoesService {
    
    @Autowired
    private MissoesRepository missoesRepository;

    @Autowired
    private MissoesMapper missoesMapper;

    // Listar missoes
    public List<MissoesDTO> listarMissoes() {
        List<MissoesModel> missoes = missoesRepository.findAll();

        return missoes.stream()
                .map(missoesMapper::map)
                .collect(Collectors.toList());
    }

    // Listar missoes por id
    public MissoesDTO listarMissoesPorId(Long id) {
        Optional<MissoesModel> missoesId = missoesRepository.findById(id);

        return missoesId.stream()
                .map(missoesMapper::map)
                .findAny().orElse(null);
    }

    public MissoesDTO criarMissao(MissoesDTO missoesDTO) {
        MissoesModel missoes = missoesMapper.map(missoesDTO);
        missoes = missoesRepository.save(missoes);

        return missoesMapper.map(missoes);
    }

    public void deletarMissaoPorId(Long id) {
        missoesRepository.deleteById(id);
    }

    public MissoesDTO atualizarMissoesPorId(Long id, MissoesDTO missoesDTOAtualizado) {
        Optional<MissoesModel> missoesExistente = missoesRepository.findById(id);

        if (missoesExistente.isPresent()) {
            MissoesModel missoesAtualizado = missoesMapper.map(missoesDTOAtualizado);

            MissoesModel missoesSalvas = missoesRepository.save(missoesAtualizado);
            return missoesMapper.map(missoesSalvas);
        }
        return null;
    }
}

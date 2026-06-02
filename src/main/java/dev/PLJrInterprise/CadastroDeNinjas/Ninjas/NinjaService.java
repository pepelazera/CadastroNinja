package dev.PLJrInterprise.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private final NinjaRepository ninjaRepository;
    private final NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    // Lista normalmente
    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }

    // Lista por id
    public NinjaModel listarNinjasPorId(Long id) {
        Optional<NinjaModel> listarPorId = ninjaRepository.findById(id); // O Optional eh uma biblioteca que vai aceitar OU nao um valor
        return listarPorId.orElse(null);
    }

    // Criar um novo ninja usando o service
    public  NinjaDTO criarNinja(NinjaDTO ninjaDTO) {
        NinjaModel ninja = ninjaMapper.map(ninjaDTO);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
    }

    // Deletar o ninja - Tem que ser um metodo void
    public void deletarNinjaPorId(Long id) {
        ninjaRepository.deleteById(id);
    }

    // Atualizar um ninja
    public NinjaModel atualizarNinjaPorId(Long id, NinjaModel ninjaModelAtualizado) { // Vou precisar tanto buscar pelo id quanto alterar seus parametros
        if (ninjaRepository.existsById(id)) {
            ninjaModelAtualizado.setId(id);
            return ninjaRepository.save(ninjaModelAtualizado);
        }
        return null;
    }

}
package dev.PLJrInterprise.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    @Autowired
    private NinjaRepository ninjaRepository;

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
    public  NinjaModel criarNinja(NinjaModel ninjaModel) {
        return ninjaRepository.save(ninjaModel); // Salva os parametros da classe ninjaModel
    }

    // Deletar o ninja - Tem que ser um metodo void
    public void deletarNinjaPorId(Long id) {
        ninjaRepository.deleteById(id);
    }

}

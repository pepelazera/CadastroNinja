package dev.PLJrInterprise.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    @Autowired
    private NinjaRepository ninjaRepository;

    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }

    public NinjaModel listarNinjasPorId(Long id) {
        Optional<NinjaModel> listarPorId = ninjaRepository.findById(id); // O Optional eh uma biblioteca que vai aceitar OU nao um valor
        return listarPorId.orElse(null);
    }

}

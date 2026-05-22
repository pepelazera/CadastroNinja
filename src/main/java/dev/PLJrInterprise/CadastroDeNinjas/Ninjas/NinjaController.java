package dev.PLJrInterprise.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;


    // Esses topicos formam o meu CRUD
    // Para criar esse CRUD, eu preciso criar os meus endpoints com base na sigla, que eh o que fiz logo abaixo

    // Adicionar ninja (CREATE)
    @PostMapping("/criar") // Usado quando queremos criar ou procurar algo. Aqui nos estou criando um novo ninja
    public String criarNinja() {
        return "Ninja criado";
    }

    // Procurar ninja por ID (CREATE)
    @PostMapping("/adicionarId") // Usado quando queremos criar ou procurar algo. Aqui nos estou procurando um ninja por Id
    public String ProcurarNinjaPorId() {
        return "Procurando ninja por Id...";
    }

    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    // Mostrar todos os Ninjas por Id (READ)
    @GetMapping("/listarId")
    public String mostrarTodosOsNinjas() {
        return "Mostrar todos os ninjas";
    }

    // Mostrar Ninja por Id (READ)
    @GetMapping("/todosId") // Pega uma informacao para mostrar para o usuario
    public String mostrarTodosOsNinjasId() {
        return "Mostrar Ninja por Id";
    }

    // Alterar dados dos Ninjas (UPDATE)
    @PutMapping("/alterarId") // Utilizado para atualizar uma informacao
    public String alterarNinjaPorId() {
        return "Alterar Ninja por Id";
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletarPorId")
    public String deletarNinja() {
        return "Deletar Ninja por Id";
    }

}

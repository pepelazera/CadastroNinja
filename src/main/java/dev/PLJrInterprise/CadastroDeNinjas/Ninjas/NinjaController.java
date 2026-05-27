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
    public NinjaModel criarNinja(@RequestBody NinjaModel ninjaModel) { // Preciso que ele mande no corpo da minha requisicao um json igual ao que eu tenho no localhost
        return ninjaService.criarNinja(ninjaModel); // Pega o metodo criado no NinjaService e usa ele nos parametros do ninjaModel
    }

    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    // Mostrar todos os Ninjas por Id (READ)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id) {
        return ninjaService.listarNinjasPorId(id);
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

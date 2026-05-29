package dev.PLJrInterprise.CadastroDeNinjas.Missoes;

import dev.PLJrInterprise.CadastroDeNinjas.Ninjas.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// LocalHost:8080
@RestController // -> Serve para controlar a minha rota
@RequestMapping("missoes") // -> Mapear minhas APIs
public class MissoesController {

    @Autowired
    private MissoesService missoesService;

    // A controller também pode ser chamada de camada de apresentação

    // Vai ser aqui que eu vou criar a rota para o meu servidor
    // Eh a camada mais proxima do usuario

    // POST -- Mandar uma requisicao para criar as missoes
    @PostMapping("/criar") // Usuario vai mandar pra mim
    public MissoesModel criarMissao(@RequestBody MissoesModel missoesModel)  { // Sem essa annotation, os parametros que eu passar no postman nao ficarao salvos
        return missoesService.adicionarMissao(missoesModel);
    }

    // GET -- Mandar uma requisicao para mostrar as missoes
    @GetMapping("/listar") // Entrego pro usuario alguma coisa
    public List<MissoesModel> listarMissoes() {
        return missoesService.listarMissoes();
    }

    @GetMapping("/listar/{id}")
    public MissoesModel listarMissoesPorId(@PathVariable Long id){
        return missoesService.listarMissoesPorId(id);
    }

    // PUT -- Mandar uma requisicao para alterar as missoes
    @PutMapping("/atualizar/{id}")
    public MissoesModel atualizarMissoesPorId(@PathVariable Long id, @RequestBody MissoesModel missoesModelAtualizado) {
        return missoesService.atualizarMissoesPorId(id, missoesModelAtualizado);
    }

    // DELETE -- Mandar uma requisicao para deletar as missoes
    @DeleteMapping("/deletar/{id}")
    public void deletarMissaoPorId(@PathVariable Long id) {
        missoesService.deletarMissaoPorId(id);
    }

}

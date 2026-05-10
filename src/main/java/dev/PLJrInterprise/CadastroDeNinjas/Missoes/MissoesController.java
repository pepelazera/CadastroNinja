package dev.PLJrInterprise.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

// LocalHost:8080
@RestController // -> Serve para controlar a minha rota
@RequestMapping("missoes") // -> Mapear minhas APIs
public class MissoesController {

    // A controller também pode ser chamada de camada de apresentação

    // Vai ser aqui que eu vou criar a rota para o meu servidor
    // Eh a camada mais proxima do usuario


    // GET -- Mandar uma requisicao para mostrar as missoes
    @GetMapping("/listar") // Entrego pro usuario alguma coisa
    public String listarMissoes() {
        return "Missões listasdas com sucesso";
    }


    // POST -- Mandar uma requisicao para criar as missoes
    @PostMapping("/criar") // Usuario vai mandar pra mim
    public String criarMissao()  {
        return "Missão criada com sucesso";
    }

    // PUT -- Mandar uma requisicao para alterar as missoes
    @PutMapping
    public String alterarMissao() {
        return "Missão alterada com sucesso";
    }

    // DELETE -- Mandar uma requisicao para deletar as missoes
    @DeleteMapping
    public String deletarMissao() {
        return "Missão deletada com sucesso";
    }

}

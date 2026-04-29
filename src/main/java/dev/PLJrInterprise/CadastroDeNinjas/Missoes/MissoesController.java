package dev.PLJrInterprise.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MissoesController {

    /*
        Já aqui, vai ser criada outra tabela para ambas das classes Controllers também (assim como vão ser para os Models)
     */

    @GetMapping("/telamissoes")
    public String telaMissoes() {
        return "Tela da rota de missões";
    }

}

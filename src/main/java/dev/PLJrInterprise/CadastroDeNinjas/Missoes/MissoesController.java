package dev.PLJrInterprise.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MissoesController {

    @GetMapping("/telamissoes")
    public String telaMissoes() {
        return "Tela da rota de missões";
    }

}

package dev.PLJrInterprise.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MissoesController {

    @GetMapping("/tela_missoes")
    public String telaMissoes() {
        return "Primeira tela da aba de missões";
    }

}

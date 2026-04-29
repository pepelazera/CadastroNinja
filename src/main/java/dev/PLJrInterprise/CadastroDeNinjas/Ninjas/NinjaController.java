package dev.PLJrInterprise.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    // Com o GetMapping, eu vou pegar informações
    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

    @GetMapping("/ninjas")
    public String telaNinjas() {
        return "Tela da rota de ninjas";
    }

}

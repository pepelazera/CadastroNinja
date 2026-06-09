package dev.PLJrInterprise.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    // Esses topicos formam o meu CRUD
    // Para criar esse CRUD, eu preciso criar os meus endpoints com base na sigla, que eh o que fiz logo abaixo

    // Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public ResponseEntity<String> criarNinja(@RequestBody NinjaDTO ninja) {
        NinjaDTO novoNinja = ninjaService.criarNinja(ninja);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Ninja criado com sucesso: " + novoNinja.getNome() + " --> (ID): " + novoNinja.getId() + ".");
    }

    @GetMapping("/listar")
    public ResponseEntity<List<NinjaDTO>> listarNinjas() {
        List<NinjaDTO> ninjas = ninjaService.listarNinjas();

        return ResponseEntity.ok(ninjas);
    }

    // Mostrar todos os Ninjas por Id (READ)
    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarNinjasPorId(@PathVariable Long id) { // Passo um Generics para poder retornar um json
          NinjaDTO ninjasPorId = ninjaService.listarNinjasPorId(id);

          if (ninjasPorId != null) {
              return ResponseEntity.ok(ninjasPorId);
          }
          else {
              return ResponseEntity.status(HttpStatus.NOT_FOUND)
                      .body("Ninja (id): " + id + " -- não foi encontrado.");
          }
    }

    // Alterar dados dos Ninjas (UPDATE)
    @PutMapping("/atualizar/{id}") // Utilizado para atualizar uma informacao
    public ResponseEntity<?> atualizarNinjaPorId(@PathVariable Long id, @RequestBody NinjaDTO ninjaDTOAtualizado) { // Ponho aqui duas variaveis no meu metodo tambem

        NinjaDTO ninjaDTO = ninjaService.atualizarNinjaPorId(id, ninjaDTOAtualizado);

        if (ninjaDTO != null) {
            return ResponseEntity.ok(ninjaDTO);
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja (id): " + id + " não foi encontrado.");
        }

    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarNinjaPorId(@PathVariable Long id) { // Annotation que serve para passar esse parametro para minha URL

        if (ninjaService.listarNinjasPorId(id) != null) {
            ninjaService.deletarNinjaPorId(id);
            return ResponseEntity.ok("Ninja (ID): " + id + " -> deletado com sucesso!");
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja (ID): " + id + " -> não encontrado.");
        }
    }

}
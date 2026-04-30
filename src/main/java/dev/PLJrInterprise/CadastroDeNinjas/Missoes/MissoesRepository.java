package dev.PLJrInterprise.CadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository extends JpaRepository<MissoesModel, Long> { // O JPA pede qual classe o ORM ira ficar scaneando
                                                                       // O tipo aqui vai ser Long, pois é o mesmo tipo do Id
}

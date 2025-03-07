package br.com.acme.beerfact.repository;

import br.com.acme.beerfact.model.Lupulo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LupuloRepository extends JpaRepository<Lupulo,Long> {
    Lupulo findAllByNome(String nome);
    List<Lupulo> findAllByNomeContainingIgnoreCase(String nome);
    List<Lupulo> findAllByNomeStartingWithIgnoreCase(String nome);
}

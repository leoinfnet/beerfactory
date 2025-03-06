package br.com.acme.beerfact.repository;

import br.com.acme.beerfact.model.Estilo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EstiloRepository extends JpaRepository<Estilo, Long> {
}

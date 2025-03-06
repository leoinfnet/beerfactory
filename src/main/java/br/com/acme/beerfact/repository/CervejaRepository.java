package br.com.acme.beerfact.repository;

import br.com.acme.beerfact.model.Cerveja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CervejaRepository extends JpaRepository<Cerveja,Long> {
}

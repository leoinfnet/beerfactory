package br.com.acme.beerfact.repository;

import br.com.acme.beerfact.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
}

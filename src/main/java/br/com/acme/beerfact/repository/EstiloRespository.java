package br.com.acme.beerfact.repository;

import br.com.acme.beerfact.model.Estilo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstiloRespository extends JpaRepository<Estilo,Long> {

}

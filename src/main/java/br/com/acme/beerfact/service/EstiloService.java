package br.com.acme.beerfact.service;

import br.com.acme.beerfact.model.Estilo;

import java.util.List;
import java.util.Optional;

public interface EstiloService {
    void save(Estilo estilo);
    void update(Estilo estilo);
    void delete(Long id);
    Optional<Estilo> findById(Long id);
    List<Estilo> findAll();
}

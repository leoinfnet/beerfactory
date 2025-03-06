package br.com.acme.beerfact.service;



import br.com.acme.beerfact.model.Cerveja;

import java.util.List;
import java.util.Optional;

public interface CervejaService {
    void save(Cerveja cerveja);
    List<Cerveja> findAll();
    Optional<Cerveja> findById(Long id);
    Cerveja update(Long id, Cerveja atualizada);
    void deleteById(Long id);

}

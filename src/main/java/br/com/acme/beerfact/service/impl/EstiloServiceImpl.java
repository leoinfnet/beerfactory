package br.com.acme.beerfact.service.impl;

import br.com.acme.beerfact.model.Estilo;
import br.com.acme.beerfact.repository.EstiloRepository;
import br.com.acme.beerfact.service.EstiloService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service@RequiredArgsConstructor
public class EstiloServiceImpl implements EstiloService {
    private final EstiloRepository estiloRepository;

    @Override
    public void save(Estilo estilo) {
        estiloRepository.save(estilo);
    }

    @Override
    public void update(Estilo estilo) {
        estiloRepository.save(estilo);
    }

    @Override
    public void delete(Long id) {
        estiloRepository.deleteById(id);
    }

    @Override
    public Optional<Estilo> findById(Long id) {
       return estiloRepository.findById(id);
    }

    @Override
    public List<Estilo> findAll() {
        return estiloRepository.findAll();
    }
}

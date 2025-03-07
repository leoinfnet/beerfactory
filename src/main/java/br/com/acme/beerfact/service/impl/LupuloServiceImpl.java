package br.com.acme.beerfact.service.impl;


import br.com.acme.beerfact.model.Lupulo;
import br.com.acme.beerfact.repository.LupuloRepository;
import br.com.acme.beerfact.service.LupuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LupuloServiceImpl implements LupuloService {
    @Autowired
    LupuloRepository lupuloRepository;
    @Override
    public List<Lupulo> findAll() {
        PageRequest pageRequest = PageRequest.ofSize(20);
        return lupuloRepository.findAll(pageRequest).stream().toList();
    }

    @Override
    public List<Lupulo> findAll(int page, int size) {
        PageRequest pageRequest = PageRequest.of(page, size);
        return lupuloRepository.findAll(pageRequest).stream().toList();
    }
    @Override
    public List<Lupulo> findAll(int page, int size, boolean asceding) {
        Sort order = asceding ? Sort.by("nome").ascending() : Sort.by("nome").descending();
        PageRequest pageRequest = PageRequest.of(page, size, order);
        return lupuloRepository.findAll(pageRequest).stream().toList();
    }
    @Override
    public Lupulo findAllByName(String nome) {
        return lupuloRepository.findAllByNome(nome);
    }
    @Override
    public List<Lupulo> findAllByNomeContains(String nome) {
        return lupuloRepository.findAllByNomeStartingWithIgnoreCase(nome);
    }

}

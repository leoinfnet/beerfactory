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
        return lupuloRepository.findAll();
    }

    @Override
    public List<Lupulo> findAll(int page, int size) {
        return null;
    }
    @Override
    public List<Lupulo> findAll(int page, int size, boolean asceding) {
        return null;
    }
    @Override
    public List<Lupulo> findAllByName(String nome) {
        return null;
    }
    @Override
    public List<Lupulo> findAllByNomeContains(String nome) {
      return null;
    }

}

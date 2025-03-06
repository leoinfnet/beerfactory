package br.com.acme.beerfact.service.impl;


import br.com.acme.beerfact.model.Cerveja;
import br.com.acme.beerfact.repository.CervejaRepository;
import br.com.acme.beerfact.service.CervejaService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CervejaServiceImpl implements CervejaService {
    @Autowired
    EntityManager entityManager;
    @Autowired
    CervejaRepository cervejaRepository;
    @Override
    public void save(Cerveja cerveja) {
        cervejaRepository.save(cerveja);
    }
    @Override
    public List<Cerveja> findAll() {
        return cervejaRepository.findAll();
    }

    @Override
    public Optional<Cerveja> findById(Long id) {
        return cervejaRepository.findById(id);
    }
    @Override
    public Cerveja update(Long id, Cerveja atualizada) {
        atualizada.setId(id);
        return cervejaRepository.save(atualizada);
    }
    @Override
    public void deleteById(Long id) {
        cervejaRepository.deleteById(id);
    }

}

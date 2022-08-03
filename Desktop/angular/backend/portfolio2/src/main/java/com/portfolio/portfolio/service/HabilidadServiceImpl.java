package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Habilidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.portfolio.repository.HabilidadRepository;

@Service
public class HabilidadServiceImpl implements HabilidadService {
    @Autowired
    private HabilidadRepository habilidadesRepository;
    
    @Override
    public Iterable<Habilidad> findAll() {
        return habilidadesRepository.findAll();
    }
    
    @Override
    public Habilidad save(Habilidad id) {
        return habilidadesRepository.save(id);
    }

    @Override
    public Habilidad findById(Long id) {
        return habilidadesRepository.findById(id).orElse(null);
    }

    @Override
    public String deleteById(Long id) {
        habilidadesRepository.deleteById(id);
        return "OK";
    }
    
    
}

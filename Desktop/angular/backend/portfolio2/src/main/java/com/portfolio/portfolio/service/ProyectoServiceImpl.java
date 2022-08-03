package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Proyecto;
import com.portfolio.portfolio.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoServiceImpl implements ProyectoService {

    @Autowired
    private ProyectoRepository proyectoRepository;
    
    @Override
    public Iterable<Proyecto> findAll() {
        return proyectoRepository.findAll();
    }
    
    @Override
    public Proyecto save(Proyecto id) {
        return proyectoRepository.save(id);
    }

    @Override
    public Proyecto findById(Long id) {
        return proyectoRepository.findById(id).orElse(null);
    }

    @Override
    public String deleteById(Long id) {
        proyectoRepository.deleteById(id);
        return "OK";
    }
    
    
}


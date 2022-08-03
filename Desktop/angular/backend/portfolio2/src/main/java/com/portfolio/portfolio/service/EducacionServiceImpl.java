package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Educacion;
import com.portfolio.portfolio.repository.EducacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionServiceImpl implements EducacionService {

    @Autowired
    private EducacionRepository educacionRepository;

    @Override
    public Iterable<Educacion> findAll() {
        return educacionRepository.findAll();
    }

    @Override
    public Educacion save(Educacion id) {
        return educacionRepository.save(id);
    }
    @Override
    public Educacion findById(Long id) {
        return educacionRepository.findById(id).orElse(null);
    }

    @Override
    public String deleteById(Long id) {
        educacionRepository.deleteById(id);
        return "OK";
    }
}


package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Experience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.portfolio.repository.ExperienceRepository;

@Service
public class ExperienceServiceImpl implements ExperienceService {

    @Autowired
    private ExperienceRepository experienceRepository;
    
    @Override
    public Iterable<Experience> findAll() {
        return experienceRepository.findAll();
    }
    
    @Override
    public Experience save(Experience id) {
        return experienceRepository.save(id);
    }

    @Override
    public Experience findById(Long id) {
        return experienceRepository.findById(id).orElse(null);
    }

    @Override
    public String deleteById(Long id) {
        experienceRepository.deleteById(id);
        return "OK";
    }
    
    
}

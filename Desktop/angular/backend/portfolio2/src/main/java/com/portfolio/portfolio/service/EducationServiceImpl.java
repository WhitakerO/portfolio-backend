package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Education;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.portfolio.repository.EducationRepository;

@Service
public class EducationServiceImpl implements EducationService {

    @Autowired
    private EducationRepository educationRepository;

    @Override
    public Iterable<Education> findAll() {
        return educationRepository.findAll();
    }

    @Override
    public Education save(Education id) {
        return educationRepository.save(id);
    }
    @Override
    public Education findById(Long id) {
        return educationRepository.findById(id).orElse(null);
    }

    @Override
    public String deleteById(Long id) {
        educationRepository.deleteById(id);
        return "OK";
    }
}


package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.ExpLaboral;
import com.portfolio.portfolio.repository.ExpLaboralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpLaboralServiceImpl implements ExpLaboralService {

    @Autowired
    private ExpLaboralRepository expLaboralRepository;
    
    @Override
    public Iterable<ExpLaboral> findAll() {
        return expLaboralRepository.findAll();
    }
    
    @Override
    public ExpLaboral save(ExpLaboral id) {
        return expLaboralRepository.save(id);
    }

    @Override
    public ExpLaboral findById(Long id) {
        return expLaboralRepository.findById(id).orElse(null);
    }

    @Override
    public String deleteById(Long id) {
        expLaboralRepository.deleteById(id);
        return "OK";
    }
    
    
}

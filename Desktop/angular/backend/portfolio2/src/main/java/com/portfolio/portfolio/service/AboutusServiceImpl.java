
package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.AboutUs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.portfolio.repository.AboutusRepository;

@Service
public class AboutusServiceImpl implements AboutusService {
    
    @Autowired
    private AboutusRepository aboutusRepository;

    @Override
    public AboutUs save(AboutUs id) {
        return aboutusRepository.save(id);
    }
    
    @Override
    public AboutUs findById(Long id) {
        return aboutusRepository.findById(id).orElse(null);
    }
    
}

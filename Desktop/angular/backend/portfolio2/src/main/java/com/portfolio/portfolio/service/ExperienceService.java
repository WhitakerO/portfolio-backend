
package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Experience;

public interface ExperienceService {
    
    public Iterable<Experience> findAll();
    
    public Experience save (Experience id);
    
    public Experience findById (Long id);
    
    public String deleteById (Long id);
}

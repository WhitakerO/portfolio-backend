
package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Project;

public interface ProjectService {
    
    public Iterable<Project> findAll();
    
    public Project save (Project id);
    
    public Project findById (Long id);
    
    public String deleteById (Long id);
}
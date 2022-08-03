
package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Proyecto;

public interface ProyectoService {
    
    public Iterable<Proyecto> findAll();
    
    public Proyecto save (Proyecto id);
    
    public Proyecto findById (Long id);
    
    public String deleteById (Long id);
}
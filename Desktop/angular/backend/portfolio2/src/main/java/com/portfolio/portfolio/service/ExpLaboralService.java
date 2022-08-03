
package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.ExpLaboral;

public interface ExpLaboralService {
    
    public Iterable<ExpLaboral> findAll();
    
    public ExpLaboral save (ExpLaboral id);
    
    public ExpLaboral findById (Long id);
    
    public String deleteById (Long id);
}

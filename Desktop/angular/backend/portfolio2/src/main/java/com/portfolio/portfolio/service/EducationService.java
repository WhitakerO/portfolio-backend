/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Education;

/**
 *
 * @author whita
 */
public interface EducationService {
    
    public Iterable<Education> findAll();
    
    public Education save (Education id);
    
    public Education findById (Long id);
    
    public String deleteById (Long id);
    
}

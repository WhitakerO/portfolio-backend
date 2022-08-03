/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Educacion;

/**
 *
 * @author whita
 */
public interface EducacionService {
    
    public Iterable<Educacion> findAll();
    
    public Educacion save (Educacion id);
    
    public Educacion findById (Long id);
    
    public String deleteById (Long id);
    
}

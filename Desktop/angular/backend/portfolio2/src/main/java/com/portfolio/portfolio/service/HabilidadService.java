/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Habilidad;

/**
 *
 * @author whita
 */
public interface HabilidadService {
    public Iterable<Habilidad> findAll();
    
    public Habilidad save (Habilidad id);
    
    public Habilidad findById (Long id);
    
    public String deleteById (Long id);
}

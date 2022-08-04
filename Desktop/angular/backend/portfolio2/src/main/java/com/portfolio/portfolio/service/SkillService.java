/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Skill;

/**
 *
 * @author whita
 */
public interface SkillService {
    public Iterable<Skill> findAll();
    
    public Skill save (Skill id);
    
    public Skill findById (Long id);
    
    public String deleteById (Long id);
}

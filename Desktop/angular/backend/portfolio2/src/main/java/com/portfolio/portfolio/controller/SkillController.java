/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.model.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.portfolio.portfolio.service.SkillService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/habilidad")
public class SkillController {
    
    @Autowired
    private SkillService skillService;
    
    @GetMapping("/obtener")
    public Iterable<Skill>lista(){
        return skillService.findAll();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){
        String resp = skillService.deleteById(id);
        if("OK".equalsIgnoreCase(resp)){
            return new ResponseEntity<>(resp, HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(resp, HttpStatus.NOT_FOUND);
        }
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/agregar")
    public Skill add(@RequestBody Skill skill){
       return skillService.save(skill);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/guardar")
    public Skill save(@RequestBody Skill skill){
       return skillService.save(skill);
    }
}

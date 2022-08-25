package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.model.Experience;
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
import com.portfolio.portfolio.service.ExperienceService;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/explaboral")
public class ExperienceController {
    @Autowired
    private ExperienceService experienceService;
    
    
    public ResponseEntity<?> create (@RequestBody Experience id) {
        return ResponseEntity.status(HttpStatus.CREATED).body(experienceService.save(id));
    }
    
    @GetMapping("/obtener")
    public Iterable<Experience>list(){
        return experienceService.findAll();
    }
    @PostMapping("/eliminar/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){
        String resp = experienceService.deleteById(id);
        if("OK".equalsIgnoreCase(resp)){
            return new ResponseEntity<>(resp, HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(resp, HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/agregar")
    public Experience add(@RequestBody Experience exp){
       return experienceService.save(exp);
    }
    
    @PutMapping("/guardar")
    public Experience save(@RequestBody Experience exp){
       return experienceService.save(exp);
    }
    
}

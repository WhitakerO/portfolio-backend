package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.model.AboutUs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.portfolio.portfolio.service.AboutusService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/acercade")
public class AboutusController {
    
    @Autowired
    private AboutusService aboutusService;
    
    @GetMapping("/obtener/{id}")
    public AboutUs get(@PathVariable Long id){
        return aboutusService.findById(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/agregar")
    public AboutUs add(@RequestBody AboutUs abt){
       return aboutusService.save(abt);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/guardar")
    public AboutUs save(@RequestBody AboutUs abt){
       return aboutusService.save(abt);
    }
}

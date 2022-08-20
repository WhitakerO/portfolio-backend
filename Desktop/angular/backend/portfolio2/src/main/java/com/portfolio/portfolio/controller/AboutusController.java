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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/acercade")
public class AboutusController {
    @Autowired
    private AboutusService aboutusService;
    
    
    public ResponseEntity<?> create (@RequestBody AboutUs id) {
        return ResponseEntity.status(HttpStatus.CREATED).body(aboutusService.save(id));
    }
    
    @GetMapping("/obtener/{id}")
    public AboutUs get(@PathVariable Long id){
        return aboutusService.findById(id);
    }
    
    @PostMapping("/guardar")
    public AboutUs add(@RequestBody AboutUs abt){
       return aboutusService.save(abt);
    }
    
    @PutMapping("/guardar")
    public AboutUs save(@RequestBody AboutUs abt){
       return aboutusService.save(abt);
    }
}

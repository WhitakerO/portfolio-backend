

package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.model.Education;
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
import com.portfolio.portfolio.service.EducationService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@CrossOrigin(origins = {
    "https://portfolio-611ec.web.app/",
    "http://localhost:4200/"
})
@RequestMapping("/api/educacion")
public class EducationController {
    
    @Autowired
    private EducationService educationService;
    
    @GetMapping("/obtener")
    public Iterable<Education>list(){
        return educationService.findAll();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){
        String resp = educationService.deleteById(id);
        if("OK".equalsIgnoreCase(resp)){
            return new ResponseEntity<>(resp, HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(resp, HttpStatus.NOT_FOUND);
        }
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/agregar")
    public Education add(@RequestBody Education education){
       return educationService.save(education);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/guardar")
    public Education save(@RequestBody Education education){
       return educationService.save(education);
    }
}

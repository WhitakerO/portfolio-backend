

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
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/educacion")
public class EducationController {
    @Autowired
    private EducationService educationService;
    
    
    public ResponseEntity<?> create (@RequestBody Education id) {
        return ResponseEntity.status(HttpStatus.CREATED).body(educationService.save(id));
    }
    
    @GetMapping("/obtener")
    public Iterable<Education>list(){
        return educationService.findAll();
    }
    @PostMapping("/eliminar/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){
        String resp = educationService.deleteById(id);
        if("OK".equalsIgnoreCase(resp)){
            return new ResponseEntity<>(resp, HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(resp, HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping("/agregar")
    public Education add(@RequestBody Education education){
       return educationService.save(education);
    }
    
    @PutMapping("/guardar")
    public Education save(@RequestBody Education education){
       return educationService.save(education);
    }
}

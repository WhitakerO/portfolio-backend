package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.model.ExpLaboral;
import com.portfolio.portfolio.service.ExpLaboralService;
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

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/explaboral")
public class ExpLaboralControlador {
    @Autowired
    private ExpLaboralService expLaboralService;
    
    
    public ResponseEntity<?> create (@RequestBody ExpLaboral id) {
        return ResponseEntity.status(HttpStatus.CREATED).body(expLaboralService.save(id));
    }
    
    @GetMapping("/obtener")
    public Iterable<ExpLaboral>listar(){
        return expLaboralService.findAll();
    }
    @PostMapping("/eliminar/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){
        String resp = expLaboralService.deleteById(id);
        if("OK".equalsIgnoreCase(resp)){
            return new ResponseEntity<>(resp, HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(resp, HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/agregar")
    public ExpLaboral guardar(@RequestBody ExpLaboral exp){
       return expLaboralService.save(exp);
    }
    
}

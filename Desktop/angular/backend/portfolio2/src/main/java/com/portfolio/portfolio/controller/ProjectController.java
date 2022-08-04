/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.model.Project;
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
import com.portfolio.portfolio.service.ProjectService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/proyecto")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    
    
    public ResponseEntity<?> create (@RequestBody Project id) {
        return ResponseEntity.status(HttpStatus.CREATED).body(projectService.save(id));
    }
    
    @GetMapping("/obtener")
    public Iterable<Project>list(){
        return projectService.findAll();
    }
    @PostMapping("/eliminar/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){
        String resp = projectService.deleteById(id);
        if("OK".equalsIgnoreCase(resp)){
            return new ResponseEntity<>(resp, HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(resp, HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/agregar")
    public Project save(@RequestBody Project project){
       return projectService.save(project);
    }
    
}

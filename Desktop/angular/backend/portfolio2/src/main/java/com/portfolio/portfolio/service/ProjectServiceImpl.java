package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.portfolio.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;
    
    @Override
    public Iterable<Project> findAll() {
        return projectRepository.findAll();
    }
    
    @Override
    public Project save(Project id) {
        return projectRepository.save(id);
    }

    @Override
    public Project findById(Long id) {
        return projectRepository.findById(id).orElse(null);
    }

    @Override
    public String deleteById(Long id) {
        projectRepository.deleteById(id);
        return "OK";
    }
    
}


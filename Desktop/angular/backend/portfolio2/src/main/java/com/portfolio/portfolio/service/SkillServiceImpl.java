package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.portfolio.repository.SkillRepository;

@Service
public class SkillServiceImpl implements SkillService {
    @Autowired
    private SkillRepository skillRepository;
    
    @Override
    public Iterable<Skill> findAll() {
        return skillRepository.findAll();
    }
    
    @Override
    public Skill save(Skill id) {
        return skillRepository.save(id);
    }

    @Override
    public Skill findById(Long id) {
        return skillRepository.findById(id).orElse(null);
    }

    @Override
    public String deleteById(Long id) {
        skillRepository.deleteById(id);
        return "OK";
    }
    
    
}

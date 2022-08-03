package com.portfolio.portfolio.repository;
import com.portfolio.portfolio.model.ExpLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpLaboralRepository extends JpaRepository<ExpLaboral, Long>{

    
}

package com.portfolio.portfolio.repository;

import com.portfolio.portfolio.model.AboutUs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutusRepository extends JpaRepository<AboutUs, Long>{

    
}

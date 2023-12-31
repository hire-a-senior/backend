package com.developers.hireasenior.repository;

import com.developers.hireasenior.model.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyRepository extends JpaRepository<Technology, String> {
    Technology findTechnologyByCode(String code);
}

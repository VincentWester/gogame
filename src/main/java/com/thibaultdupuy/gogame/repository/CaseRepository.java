package com.thibaultdupuy.gogame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thibaultdupuy.gogame.model.Case;

@Repository
public interface CaseRepository extends JpaRepository<Case, Long>{

}

package com.thibaultdupuy.gogame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thibaultdupuy.gogame.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}
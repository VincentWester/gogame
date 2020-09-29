package com.thibaultdupuy.gogame.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thibaultdupuy.gogame.model.Game;
import com.thibaultdupuy.gogame.repository.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;

	public Game startGame(Integer size) {
		return new Game(size);
	}

}

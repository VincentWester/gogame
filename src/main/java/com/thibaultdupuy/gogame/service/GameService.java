package com.thibaultdupuy.gogame.service;

import org.springframework.stereotype.Service;

import com.thibaultdupuy.gogame.model.Game;

@Service
public class GameService {

	public Game startGame() {
		return new Game();
	}

}

package com.thibaultdupuy.gogame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thibaultdupuy.gogame.model.Game;
import com.thibaultdupuy.gogame.service.GameService;

@RestController
@RequestMapping(value = "/")
public class GameController {

	@Autowired
	private GameService gameService;
	
	@GetMapping(value = "/gogame")
	public Game startGame() {
		return gameService.startGame();		
	}
	
	
	
	
}

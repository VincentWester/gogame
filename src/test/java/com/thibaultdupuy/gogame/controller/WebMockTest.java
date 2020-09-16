package com.thibaultdupuy.gogame.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.thibaultdupuy.gogame.model.Game;
import com.thibaultdupuy.gogame.service.GameService;

@WebMvcTest(GameController.class)
public class WebMockTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private GameService service;
	
	@Test
	public void startGameShouldReturnADefaultGameObject() throws Exception {
		Game game = new Game();
		
		when(service.startGame()).thenReturn(game);
		this.mockMvc.perform(get("/gogame")).andExpect(status().isOk());
				//.andExpect(content().string(containsString("Hello, Mock")));
	}

}

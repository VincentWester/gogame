package com.thibaultdupuy.gogame.service;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.thibaultdupuy.gogame.GogameApplication;
import com.thibaultdupuy.gogame.model.Case;
import com.thibaultdupuy.gogame.model.Game;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GogameApplication.class)
@ExtendWith(MockitoExtension.class)
public class GameServiceTest {
	
	@Autowired	
	private GameService service;

	@Test
	public void shouldCreateAGameWith9SizeBoard() {
		Game game = service.startGame(9);
		
		assertEquals(game.getBoard().getCases().size(), 81);
		for (int i=1; i<=9; i++) {
			final int abscisse = i;
			Stream<Case> streamCases = game.getBoard().getCases().stream();
			assertEquals(streamCases.filter((Case c) -> c.getAbscisse() == abscisse).count(), 9);
		}
		

		for (int i=1; i<=9; i++) {
			final int ordonnee = i;
			Stream<Case> streamCases = game.getBoard().getCases().stream();
			assertEquals(streamCases.filter((Case c) -> c.getOrdonnee() == ordonnee).count(), 9);
		}
	}
}

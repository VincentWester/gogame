package com.thibaultdupuy.gogame.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "game")
public class Game {
	
	public Game(Integer size) {
		turn = new Turn();
		board = new Board(size);
	}
    
    @Column(name="turn")
    @ManyToOne
    private Turn turn;
    
    @Column(name="board")
    @OneToMany    
    private Board board;

	public Turn getTurn() {
		return turn;
	}

	public void setTurn(Turn turn) {
		this.turn = turn;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}
    
    

}

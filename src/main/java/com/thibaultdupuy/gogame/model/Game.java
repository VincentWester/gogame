package com.thibaultdupuy.gogame.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name = "game")
public class Game {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
        
    @Column(name = "turnColor")
    private Integer turnColor;
    
    @Column(name = "turnNumber")
    private Integer turnNumber;
	  
	@OneToMany(targetEntity = Case.class)
	@JoinColumn(name = "board_pk", referencedColumnName = "id")
    private Set<Case> board;

	public Game(Integer size) {		
		this.board = new HashSet<Case>();
		// A voir, si pas meilleur solution avec les streams.
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				board.add(new Case(i, j));
			}						
		}

		this.turnColor = 2;
		this.turnNumber = 1;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Set<Case> getBoard() {
		return board;
	}

	public void setBoard(Set<Case> cases) {
		this.board = cases;
	}

	public Integer getTurnColor() {
		return turnColor;
	}

	public void setTurnColor(Integer turnColor) {
		this.turnColor = turnColor;
	}

	public Integer getTurnNumber() {
		return turnNumber;
	}

	public void setTurnNumber(Integer turnNumber) {
		this.turnNumber = turnNumber;
	}
    
    

}

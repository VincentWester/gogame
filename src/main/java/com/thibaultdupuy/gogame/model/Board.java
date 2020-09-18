package com.thibaultdupuy.gogame.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Board {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private long id;
	  
	@OneToMany
	@JoinColumn(name="board_id", referencedColumnName="id")
    private Set<Case> cases;

	public Board(Integer size) {
		this.cases = new HashSet<Case>(); 
		
		// A voir, si pas meilleur solution avec les streams.
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
			    cases.add(new Case(i, j));
			}						
		}
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Set<Case> getCases() {
		return cases;
	}

	public void setCases(Set<Case> cases) {
		this.cases = cases;
	}
	
	
}

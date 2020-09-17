package com.thibaultdupuy.gogame.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Turn {
	
	public Turn() {
		this.color = 0;
		this.numero = 1;
	}
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @Column(name="color", columnDefinition = "INTEGER DEFAULT 0")
    private Integer color;
    
    @Column(name="numero", columnDefinition = "INTEGER DEFAULT 1")
    private Integer numero;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getColor() {
		return color;
	}

	public void setColor(Integer color) {
		this.color = color;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
    
    
    
}

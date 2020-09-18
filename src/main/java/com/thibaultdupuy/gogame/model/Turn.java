package com.thibaultdupuy.gogame.model;

import javax.persistence.Column;

public class Turn {
	
	public Turn() {
		this.color = 2;
		this.numero = 1;
	}
    
    @Column(name="color", columnDefinition = "INTEGER DEFAULT 0")
    private Integer color;
    
    @Column(name="numero", columnDefinition = "INTEGER DEFAULT 1")
    private Integer numero;

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

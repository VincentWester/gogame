package com.thibaultdupuy.gogame.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "case_table")
public class Case {
  
      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      @Column(name = "id")
      private long id;
      
      @ManyToOne(targetEntity = Game.class)
      @JoinColumn(name = "game_id")
      private Game game;
	  
	  @Column(name = "abscisse")
	  private Integer abscisse;
	  
	  @Column(name = "ordonnee")
	  private Integer ordonnee;
	  
	  @Column(name = "color")
	  private Integer color;

	  public Case(Integer abscisse, Integer ordonnee) {
		  this.abscisse = abscisse;
		  this.ordonnee = ordonnee;
		  this.color = 0;
	  }

	  public Integer getAbscisse() {
		  return abscisse;
	  }

	  public void setAbscisse(Integer abscisse) {
		  this.abscisse = abscisse;
	  }

	  public Integer getOrdonnee() {
		  return ordonnee;
	  }

	  public void setOrdonnee(Integer ordonnee) {
		  this.ordonnee = ordonnee;
	  }

	  public Integer getColor() {
		  return color;
	  }

	  public void setColor(Integer color) {
	  	  this.color = color;
	  }	  
	  
}

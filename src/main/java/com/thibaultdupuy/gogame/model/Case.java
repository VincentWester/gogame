package com.thibaultdupuy.gogame.model;

import javax.persistence.Column;

public class Case {
  
	  public Case(Integer abscisse, Integer ordonnee) {
		  this.abscisse = abscisse;
		  this.ordonnee = ordonnee;
		  this.color = 0;
	  }
	
	  @Column(name="board_id")
	  private Long boardId;
	  
	  @Column(name="abscisse")
	  private Integer abscisse;
	  
	  @Column(name="ordonnee")
	  private Integer ordonnee;
	  
	  @Column(name="color")
	  private Integer color;

	  public Long getBoardId() {
		  return boardId;
	  }

	  public void setBoardId(Long boardId) {
	      this.boardId = boardId;
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

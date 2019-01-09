package com.stock.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table
public class LigneVente implements Serializable{
	@Id
	@GeneratedValue
	private long idLigneVente;

	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	@ManyToOne
	@JoinColumn(name="idVente")
	private Vente vente;
	
	
	public long getIdLigneVente() {
		return idLigneVente;
	}
	public void setIdLigneVente(long idLigneVente) {
		this.idLigneVente = idLigneVente;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public Vente getVente() {
		return vente;
	}
	public void setVente(Vente vente) {
		this.vente = vente;
	}
	

	

}

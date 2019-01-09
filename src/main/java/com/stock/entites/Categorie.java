package com.stock.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Categorie implements Serializable {
	@Id
	@GeneratedValue
	private long idCategorie;
	private String codeCategorie;
	private String designationArticle;
	@OneToMany (mappedBy= "categorie")
	private List <Article> listeArticles;
	
	
	
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdCategorie() {
		return idCategorie;
	}
	public void setIdCategorie(long idCategorie) {
		this.idCategorie = idCategorie;
	}
	public String getCodeCategorie() {
		return codeCategorie;
	}
	public void setCodeCategorie(String codeCategorie) {
		this.codeCategorie = codeCategorie;
	}
	public String getDesignationArticle() {
		return designationArticle;
	}
	public void setDesignationArticle(String designationArticle) {
		this.designationArticle = designationArticle;
	}
	public List<Article> getListeArticles() {
		return listeArticles;
	}
	public void setListeArticles(List<Article> listeArticles) {
		this.listeArticles = listeArticles;
	}
	
	
	
	

}

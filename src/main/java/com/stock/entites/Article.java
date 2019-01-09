package com.stock.entites;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;
import org.springframework.beans.factory.annotation.Autowired;
@Entity
@Table
public class Article implements Serializable{
	@Id
	@GeneratedValue
	private long idArticle;
	private String codeArticle;
	private String designationArticle;
	private BigDecimal prixUnitaireHT;
	private BigDecimal tauxTVA;
	private BigDecimal prixTTC;
	@ManyToOne
	@JoinColumn(name="idCategorie")
	private Categorie categorie;
	

	public Article() {
		super();
	}

	public long getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(long idArticle) {
		this.idArticle = idArticle;
	}
	

	public String getCodeArticle() {
		return codeArticle;
	}

	public void setCodeArticle(String codeArticle) {
		this.codeArticle = codeArticle;
	}

	public String getDesignationArticle() {
		return designationArticle;
	}

	public void setDesignationArticle(String designationArticle) {
		this.designationArticle = designationArticle;
	}

	public BigDecimal getPrixUnitaireHT() {
		return prixUnitaireHT;
	}

	public void setPrixUnitaireHT(BigDecimal prixUnitaireHT) {
		this.prixUnitaireHT = prixUnitaireHT;
	}

	public BigDecimal getTauxTVA() {
		return tauxTVA;
	}

	public void setTauxTVA(BigDecimal tauxTVA) {
		this.tauxTVA = tauxTVA;
	}

	public BigDecimal getPrixTTC() {
		return prixTTC;
	}

	public void setPrixTTC(BigDecimal prixTTC) {
		this.prixTTC = prixTTC;
	}

	

}

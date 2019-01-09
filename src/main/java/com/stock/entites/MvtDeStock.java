package com.stock.entites;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ManyToAny;
import org.springframework.beans.factory.annotation.Autowired;
@Entity
@Table
public class MvtDeStock implements Serializable{
	public static final int ENTREE=1;
	public static final int SORTIE=2;
	@Id
	@GeneratedValue
	private long idMvtDeStock;
	private BigDecimal quantite;
	private int typeMvt;
	@Temporal(TemporalType.TIMESTAMP) 
	private Date dateMvt;
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	public long getIdMvtDeStock() {
		return idMvtDeStock;
	}
	public void setIdMvtDeStock(long idMvtDeStock) {
		this.idMvtDeStock = idMvtDeStock;
	}
	public BigDecimal getQuantite() {
		return quantite;
	}
	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}
	public int getTypeMvt() {
		return typeMvt;
	}
	public void setTypeMvt(int typeMvt) {
		this.typeMvt = typeMvt;
	}
	public Date getDateMvt() {
		return dateMvt;
	}
	public void setDateMvt(Date dateMvt) {
		this.dateMvt = dateMvt;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public static int getEntree() {
		return ENTREE;
	}
	public static int getSortie() {
		return SORTIE;
	}
	
	
	
	

	

	

}

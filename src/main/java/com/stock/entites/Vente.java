package com.stock.entites;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ManyToAny;
import org.springframework.beans.factory.annotation.Autowired;
@Entity
@Table
public class Vente implements Serializable{
	@Id
	@GeneratedValue
	private long idVente;
	private String code;
	@Temporal(TemporalType.TIMESTAMP) 
	private Date dateVente;
	@OneToMany (mappedBy= "vente")
	private List <LigneVente> listeDeLignesDeVente;
	public long getIdVente() {
		return idVente;
	}
	public void setIdVente(long idVente) {
		this.idVente = idVente;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Date getDateVente() {
		return dateVente;
	}
	public void setDateVente(Date dateVente) {
		this.dateVente = dateVente;
	}
	public List<LigneVente> getListeDeLignesDeVente() {
		return listeDeLignesDeVente;
	}
	public void setListeDeLignesDeVente(List<LigneVente> listeDeLignesDeVente) {
		this.listeDeLignesDeVente = listeDeLignesDeVente;
	}
	
	
	

	
	

}

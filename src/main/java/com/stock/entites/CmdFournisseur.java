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
public class CmdFournisseur implements Serializable{
	
	
	@Id
	@GeneratedValue
	private long idCmdFournisseur;
	private String code;
	@Temporal(TemporalType.TIMESTAMP) 
	private Date dateCmd;
	@ManyToOne
	@JoinColumn(name="idFournisseur")
	private Fournisseur fournisseur;
	
	@OneToMany (mappedBy= "cmdFournisseur")
	private List <LigneCmdFournisseur> LignesCmdFournisseur;
	
	

	public long getIdCmdFournisseur() {
		return idCmdFournisseur;
	}

	public void setIdCmdFournisseur(long idCmdFournisseur) {
		this.idCmdFournisseur = idCmdFournisseur;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDateCmd() {
		return dateCmd;
	}

	public void setDateCmd(Date dateCmd) {
		this.dateCmd = dateCmd;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public List<LigneCmdFournisseur> getLignesCmdFournisseur() {
		return LignesCmdFournisseur;
	}

	public void setLignesCmdFournisseur(List<LigneCmdFournisseur> lignesCmdFournisseur) {
		LignesCmdFournisseur = lignesCmdFournisseur;
	}


	

}

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
public class LigneCmdFournisseur implements Serializable{
	@Id
	@GeneratedValue
	private long idLigneCmdFournisseur;

	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	@ManyToOne
	@JoinColumn(name="idCmdFournisseur")
	private CmdFournisseur cmdFournisseur;
	
	
	public long getIdLigneCmdFournisseur() {
		return idLigneCmdFournisseur;
	}
	public void setIdLigneCmdFournisseur(long idLigneCmdFournisseur) {
		this.idLigneCmdFournisseur = idLigneCmdFournisseur;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public CmdFournisseur getCmdFournisseur() {
		return cmdFournisseur;
	}
	public void setCmdFournisseur(CmdFournisseur cmdFournisseur) {
		this.cmdFournisseur = cmdFournisseur;
	}
	
	
}

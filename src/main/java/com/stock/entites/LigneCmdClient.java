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
public class LigneCmdClient implements Serializable{
	@Id
	@GeneratedValue
	private long idLigneCmdClient;

	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	@ManyToOne
	@JoinColumn(name="idCmdClient")
	private CmdClient cmdClient;
	
	
	public long getIdLigneCmdClient() {
		return idLigneCmdClient;
	}
	public void setIdLigneCmdClient(long idLigneCmdClient) {
		this.idLigneCmdClient = idLigneCmdClient;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public CmdClient getCmdClient() {
		return cmdClient;
	}
	public void setCmdClient(CmdClient cmdClient) {
		this.cmdClient = cmdClient;
	}
	


	

}

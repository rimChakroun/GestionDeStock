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
public class CmdClient implements Serializable{
	@Id
	@GeneratedValue
	private long idCmdClient;
	private String code;
	@Temporal(TemporalType.TIMESTAMP) 
	private Date dateCmd;
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client client;
	
	@OneToMany (mappedBy= "cmdClient")
	private List <LigneCmdClient> LignesCmdClient;
	
	public long getIdCmdClient() {
		return idCmdClient;
	}
	public void setIdCmdClient(long idCmdClient) {
		this.idCmdClient = idCmdClient;
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
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<LigneCmdClient> getLignesCmdClient() {
		return LignesCmdClient;
	}
	public void setLignesCmdClient(List<LigneCmdClient> lignesCmdClient) {
		LignesCmdClient = lignesCmdClient;
	}
	
	
	
	

	
	

}

package com.stock.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Utilisateur implements Serializable {
	@Id
	@GeneratedValue
	private long idUsr;
	private String nomUsr;
	private String prenomUsr;
	private String emailUsr;
	private String motDePasseUsr;
	private String photo;
	public long getIdUsr() {
		return idUsr;
	}
	public void setIdUsr(long idUsr) {
		this.idUsr = idUsr;
	}
	public String getNomUsr() {
		return nomUsr;
	}
	public void setNomUsr(String nomUsr) {
		this.nomUsr = nomUsr;
	}
	public String getPrenomUsr() {
		return prenomUsr;
	}
	public void setPrenomUsr(String prenomUsr) {
		this.prenomUsr = prenomUsr;
	}
	public String getEmailUsr() {
		return emailUsr;
	}
	public void setEmailUsr(String emailUsr) {
		this.emailUsr = emailUsr;
	}
	public String getMotDePasseUsr() {
		return motDePasseUsr;
	}
	public void setMotDePasseUsr(String motDePasseUsr) {
		this.motDePasseUsr = motDePasseUsr;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	

}

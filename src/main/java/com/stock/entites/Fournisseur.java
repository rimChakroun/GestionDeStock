package com.stock.entites;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
@Entity
@Table
public class Fournisseur implements Serializable{
	@Id
	@GeneratedValue
	private long idFournisseur;
	private String nom;
	private String prenom;
	private String adresse;
	private String email;
	private String photo;
	@OneToMany (mappedBy= "fournisseur")
	private List <CmdFournisseur>ListeDesCmdFournisseur;
	
	
	public long getIdFournisseur() {
		return idFournisseur;
	}
	public void setIdFournisseur(long idFournisseur) {
		this.idFournisseur = idFournisseur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public List<CmdFournisseur> getListeDesCmdFournisseur() {
		return ListeDesCmdFournisseur;
	}
	public void setListeDesCmdFournisseur(List<CmdFournisseur> listeDesCmdFournisseur) {
		ListeDesCmdFournisseur = listeDesCmdFournisseur;
	}

	
	
	


	

	
	
	

	
	

}

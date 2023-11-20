package com.teachers.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
public class Vacataire extends Utilisateur {
	
	private int cnv;
	private String photo;
	private Boolean ensajiste;
	@Temporal(TemporalType.DATE)
	private Date dateRecrutement;
	private String domainRecherche;
	private String directeur;
	@ManyToOne
	private Etablissement etablissement;
	@ManyToOne
	private Specialite specialite;
	@OneToMany(mappedBy = "vacataire",fetch = FetchType.EAGER)
	private List<Candidature>candidatures;
	
	public Etablissement getEtablissement() {
		return etablissement;
	}
	public void setEtablissement(Etablissement etablissement) {
		this.etablissement = etablissement;
	}
	public Specialite getSpecialite() {
		return specialite;
	}
	public void setSpecialite(Specialite specialite) {
		this.specialite = specialite;
	}
	public Vacataire() {
		super();
	}
	public int getCnv() {
		return cnv;
	}
	public void setCnv(int cnv) {
		this.cnv = cnv;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Boolean getEnsajiste() {
		return ensajiste;
	}
	public void setEnsajiste(Boolean ensajiste) {
		this.ensajiste = ensajiste;
	}
	public Date getDateRecrutement() {
		return dateRecrutement;
	}
	public void setDateRecrutement(Date dateRecrutement) {
		this.dateRecrutement = dateRecrutement;
	}
	public String getDomainRecherche() {
		return domainRecherche;
	}
	public void setDomainRecherche(String domainRecherche) {
		this.domainRecherche = domainRecherche;
	}
	public String getDirecteur() {
		return directeur;
	}
	public void setDirecteur(String directeur) {
		this.directeur = directeur;
	}
	

}

package com.teachers.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Candidature {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String etat;
	private Date datePostulation;
	private String causeRefus;
	@ManyToOne
	private Semestre semestre;
	@OneToMany(mappedBy = "candidature",orphanRemoval = false,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Dossier>dossiers;
	@ManyToOne
	private Vacataire vacataire;
	public Candidature() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Date getDatePostulation() {
		return datePostulation;
	}
	public void setDatePostulation(Date datePostulation) {
		this.datePostulation = datePostulation;
	}
	public String getCauseRefus() {
		return causeRefus;
	}
	public void setCauseRefus(String causeRefus) {
		this.causeRefus = causeRefus;
	}
	public Semestre getSemestre() {
		return semestre;
	}
	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}
	public List<Dossier> getDossiers() {
		return dossiers;
	}
	public void setDossiers(List<Dossier> dossiers) {
		this.dossiers = dossiers;
	}
	
}

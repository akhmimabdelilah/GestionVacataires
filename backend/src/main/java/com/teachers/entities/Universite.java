package com.teachers.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Universite {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	@OneToMany(mappedBy = "universite",orphanRemoval = false,cascade = CascadeType.ALL)
	private List<Etablissement>etablissements;
	public Universite() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Etablissement> getEtablissements() {
		return etablissements;
	}
	public void setEtablissements(List<Etablissement> etablissements) {
		this.etablissements = etablissements;
	}

}

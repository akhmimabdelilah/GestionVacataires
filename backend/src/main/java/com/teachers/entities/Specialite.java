package com.teachers.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Specialite {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int id;
	private String nom;
	@OneToMany(mappedBy = "specialite",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	List<Vacataire>vacataires;
	public Specialite() {
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
	public List<Vacataire> getVacataires() {
		return vacataires;
	}
	public void setVacataires(List<Vacataire> vacataires) {
		this.vacataires = vacataires;
	}
	

}

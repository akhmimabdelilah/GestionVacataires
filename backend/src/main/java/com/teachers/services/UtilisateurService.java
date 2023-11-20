package com.teachers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teachers.dao.IDao;
import com.teachers.entities.Utilisateur;
import com.teachers.repositories.UtilisateurRepository;
@Service
public class UtilisateurService implements IDao<Utilisateur> {
	@Autowired
	private UtilisateurRepository utilisateurRepository;

	@Override
	public Utilisateur create(Utilisateur o) {
		return utilisateurRepository.save(o);
	}

	@Override
	public List<Utilisateur> findAll() {
		return utilisateurRepository.findAll();
	}

	@Override
	public Utilisateur update(Utilisateur o) {
		return utilisateurRepository.save(o);
	}

	@Override
	public boolean delete(Utilisateur o) {
		try {
			utilisateurRepository.delete(o);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Utilisateur findById(int id) {
		return utilisateurRepository.findById(id).orElse(null);

	}

}

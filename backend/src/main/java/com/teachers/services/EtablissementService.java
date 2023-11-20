package com.teachers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teachers.dao.IDao;
import com.teachers.entities.Etablissement;
import com.teachers.repositories.EtablissementRepository;
@Service
public class EtablissementService implements IDao<Etablissement> {
	@Autowired
	private EtablissementRepository etablissementRepository;

	@Override
	public Etablissement create(Etablissement o) {
		return etablissementRepository.save(o);
	}

	@Override
	public List<Etablissement> findAll() {
		return etablissementRepository.findAll();
	}

	@Override
	public Etablissement update(Etablissement o) {
		return etablissementRepository.save(o);
	}

	@Override
	public boolean delete(Etablissement o) {
		try {
			etablissementRepository.delete(o);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Etablissement findById(int id) {
		return etablissementRepository.findById(id).orElse(null);

	}
}

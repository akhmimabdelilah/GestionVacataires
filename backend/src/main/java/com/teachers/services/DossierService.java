package com.teachers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teachers.dao.IDao;
import com.teachers.entities.Dossier;
import com.teachers.repositories.DossierRepository;
@Service
public class DossierService implements IDao<Dossier> {
	@Autowired
	private DossierRepository dossierRepository;

	@Override
	public Dossier create(Dossier o) {
		return dossierRepository.save(o);
	}

	@Override
	public List<Dossier> findAll() {
		return dossierRepository.findAll();
	}

	@Override
	public Dossier update(Dossier o) {
		return dossierRepository.save(o);
	}

	@Override
	public boolean delete(Dossier o) {
		try {
			dossierRepository.delete(o);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Dossier findById(int id) {
		return dossierRepository.findById(id).orElse(null);

	}
}

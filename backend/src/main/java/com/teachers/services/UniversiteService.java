package com.teachers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teachers.dao.IDao;
import com.teachers.entities.Universite;
import com.teachers.repositories.UniversiteRepository;

@Service
public class UniversiteService implements IDao<Universite>{
	@Autowired
	private UniversiteRepository universiteRepository;

	@Override
	public Universite create(Universite o) {
		return universiteRepository.save(o);
	}

	@Override
	public List<Universite> findAll() {
		return universiteRepository.findAll();
	}

	@Override
	public Universite update(Universite o) {
		return universiteRepository.save(o);
	}

	@Override
	public boolean delete(Universite o) {
		try {
			universiteRepository.delete(o);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Universite findById(int id) {
		return universiteRepository.findById(id).orElse(null);

	}
}

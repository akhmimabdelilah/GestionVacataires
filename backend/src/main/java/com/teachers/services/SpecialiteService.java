package com.teachers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teachers.dao.IDao;
import com.teachers.entities.Specialite;
import com.teachers.repositories.SpecialiteRepository;
@Service
public class SpecialiteService implements IDao<Specialite>{
	@Autowired
	private SpecialiteRepository specialiteRepository;

	@Override
	public Specialite create(Specialite o) {
		return specialiteRepository.save(o);
	}

	@Override
	public List<Specialite> findAll() {
		return specialiteRepository.findAll();
	}

	@Override
	public Specialite update(Specialite o) {
		return specialiteRepository.save(o);
	}

	@Override
	public boolean delete(Specialite o) {
		try {
			specialiteRepository.delete(o);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Specialite findById(int id) {
		return specialiteRepository.findById(id).orElse(null);

	}
}

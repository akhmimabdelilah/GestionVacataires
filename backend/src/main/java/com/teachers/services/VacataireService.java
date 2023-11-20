package com.teachers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teachers.dao.IDao;
import com.teachers.entities.Vacataire;
import com.teachers.repositories.VacataireRepository;
@Service
public class VacataireService implements IDao<Vacataire>{
	@Autowired
	private VacataireRepository vacataireRepository;

	@Override
	public Vacataire create(Vacataire o) {
		return vacataireRepository.save(o);
	}

	@Override
	public List<Vacataire> findAll() {
		return vacataireRepository.findAll();
	}

	@Override
	public Vacataire update(Vacataire o) {
		return vacataireRepository.save(o);
	}

	@Override
	public boolean delete(Vacataire o) {
		try {
			vacataireRepository.delete(o);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Vacataire findById(int id) {
		return vacataireRepository.findById(id).orElse(null);

	}

}

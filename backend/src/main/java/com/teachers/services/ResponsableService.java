package com.teachers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teachers.dao.IDao;
import com.teachers.entities.Responsable;
import com.teachers.repositories.ResponsableRepository;

@Service
public class ResponsableService implements IDao<Responsable>{
	@Autowired
	private ResponsableRepository responsableRepository;

	@Override
	public Responsable create(Responsable o) {
		return responsableRepository.save(o);
	}

	@Override
	public List<Responsable> findAll() {
		return responsableRepository.findAll();
	}

	@Override
	public Responsable update(Responsable o) {
		return responsableRepository.save(o);
	}

	@Override
	public boolean delete(Responsable o) {
		try {
			responsableRepository.delete(o);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Responsable findById(int id) {
		return responsableRepository.findById(id).orElse(null);

	}

}

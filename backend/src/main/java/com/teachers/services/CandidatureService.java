package com.teachers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teachers.dao.IDao;
import com.teachers.entities.Candidature;
import com.teachers.repositories.CandidatureRepository;

@Service
public class CandidatureService implements IDao<Candidature> {

	@Autowired
	private CandidatureRepository candidatureRepository;

	@Override
	public Candidature create(Candidature o) {
		// TODO Auto-generated method stub
		return candidatureRepository.save(o);
	}

	@Override
	public List<Candidature> findAll() {

		return candidatureRepository.findAll();
	}

	@Override
	public Candidature update(Candidature o) {

		return candidatureRepository.save(o);
	}

	@Override
	public boolean delete(Candidature o) {
		try {
            candidatureRepository.delete(o);
            return true;
        } catch (Exception e) {
            return false;
        }
	}

	@Override
	public Candidature findById(int id) {
		return candidatureRepository.findById(id).orElse(null);
	}

}

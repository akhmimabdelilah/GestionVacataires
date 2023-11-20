package com.teachers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teachers.dao.IDao;
import com.teachers.entities.Semestre;
import com.teachers.repositories.SemestreRepository;
@Service
public class SemestreService implements IDao<Semestre>{
	@Autowired
	 private SemestreRepository semestreRepository;
	
	    @Override
	    public Semestre create(Semestre o) {
	       return semestreRepository.save(o);
	    }

	    @Override
	    public List<Semestre> findAll() {
	        return semestreRepository.findAll();
	    }

	    @Override
	    public Semestre update(Semestre o) {
	        return semestreRepository.save(o);
	    }

	    @Override
	    public boolean delete(Semestre o) {
	        try {
	            semestreRepository.delete(o);
	            return true;
	        } catch (Exception e) {
	            return false;
	        }
	    }
	    
	    @Override
	    public Semestre findById(int id) {
	        return semestreRepository.findById(id).orElse(null);
	        		
	    }

}

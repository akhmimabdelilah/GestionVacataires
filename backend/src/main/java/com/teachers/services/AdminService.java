package com.teachers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teachers.dao.IDao;
import com.teachers.entities.Admin;
import com.teachers.repositories.AdminRepository;

@Service
public class AdminService implements IDao<Admin> {
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public Admin create(Admin o) {
		return adminRepository.save(o);
	}

	@Override
	public List<Admin> findAll() {
		return adminRepository.findAll();
	}

	@Override
	public Admin update(Admin o) {
		return adminRepository.save(o);
	}

	@Override
	public boolean delete(Admin o) {
		try {
			adminRepository.delete(o);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Admin findById(int id) {
		return adminRepository.findById(id).orElse(null);

	}
}

package com.teachers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teachers.entities.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{

}

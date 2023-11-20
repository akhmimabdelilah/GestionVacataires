package com.teachers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teachers.entities.Semestre;

@Repository
public interface SemestreRepository extends JpaRepository<Semestre, Integer>{

}

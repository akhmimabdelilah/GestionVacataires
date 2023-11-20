package com.teachers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teachers.entities.Candidature;

@Repository
public interface CandidatureRepository extends JpaRepository<Candidature, Integer>{

}

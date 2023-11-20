package com.teachers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teachers.entities.Dossier;

@Repository
public interface DossierRepository extends JpaRepository<Dossier, Integer>{

}

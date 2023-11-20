package com.teachers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teachers.entities.Etablissement;

@Repository
public interface EtablissementRepository extends JpaRepository<Etablissement, Integer> {

}

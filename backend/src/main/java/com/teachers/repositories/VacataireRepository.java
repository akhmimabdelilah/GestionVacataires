package com.teachers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teachers.entities.Vacataire;

@Repository
public interface VacataireRepository extends JpaRepository<Vacataire, Integer> {

}

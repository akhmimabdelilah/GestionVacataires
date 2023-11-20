package com.teachers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teachers.entities.Specialite;

@Repository
public interface SpecialiteRepository extends JpaRepository<Specialite, Integer> {

}

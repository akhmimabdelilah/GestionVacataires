package com.teachers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teachers.entities.Responsable;

@Repository
public interface ResponsableRepository extends JpaRepository<Responsable, Integer>{

}

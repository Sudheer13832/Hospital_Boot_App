package com.ty.hospitalbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.hospitalbootapp.dto.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}

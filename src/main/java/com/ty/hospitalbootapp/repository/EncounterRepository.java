package com.ty.hospitalbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.hospitalbootapp.dto.Encounter;

public interface EncounterRepository extends JpaRepository<Encounter, Integer> {

}

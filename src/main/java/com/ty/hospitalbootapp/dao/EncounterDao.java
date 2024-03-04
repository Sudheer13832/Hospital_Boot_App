package com.ty.hospitalbootapp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.hospitalbootapp.dto.Encounter;
import com.ty.hospitalbootapp.repository.EncounterRepository;

@Repository
public class EncounterDao {
	@Autowired
	EncounterRepository repository;

	public Encounter saveEncounter(Encounter encounter) {
		return repository.save(encounter);
	}

	public Encounter updateEncounter(Encounter encounter) {
		return repository.save(encounter);
	}

	public Optional<Encounter> findEncounterById(int id) {
		return repository.findById(id);
	}

	public void delete(Encounter encounter) {
		repository.delete(encounter);
	}

	public List<Encounter> getAllEncounters() {
		return repository.findAll();
	}
}

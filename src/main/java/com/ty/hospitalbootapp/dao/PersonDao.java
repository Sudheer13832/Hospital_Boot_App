package com.ty.hospitalbootapp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.hospitalbootapp.dto.Person;
import com.ty.hospitalbootapp.repository.PersonRepository;

@Repository
public class PersonDao {
	@Autowired
	PersonRepository repository;

	public Person savePerson(Person person) {
		return repository.save(person);
	}

	public Person updatePerson(Person person) {
		return repository.save(person);
	}

	public Optional<Person> findPersonById(int id) {
		return repository.findById(id);
	}

	public void delete(Person person) {
		repository.delete(person);
	}

	public List<Person> getAllPersons() {
		return repository.findAll();
	}
}

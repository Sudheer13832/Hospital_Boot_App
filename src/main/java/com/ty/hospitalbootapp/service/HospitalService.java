package com.ty.hospitalbootapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ty.hospitalbootapp.dao.HospitalDao;
import com.ty.hospitalbootapp.dto.Hospital;
import com.ty.hospitalbootapp.dto.ResponseStructure;
import com.ty.hospitalbootapp.exception.IdNotFoundException;

@Service
public class HospitalService {
	@Autowired
	HospitalDao hospitalDao;

	public ResponseEntity<ResponseStructure<Hospital>> saveHospital(Hospital hospital) {
		ResponseStructure<Hospital> structure = new ResponseStructure<Hospital>();
		hospital = hospitalDao.saveHospital(hospital);
		structure.setBody(hospital);
		structure.setCode(HttpStatus.CREATED.value());
		structure.setMessage("Saved Succesfully");
		return new ResponseEntity<ResponseStructure<Hospital>>(structure, HttpStatus.CREATED);
	}

	public ResponseEntity<ResponseStructure<Hospital>> updateHospital(Hospital hospital) {
		ResponseStructure<Hospital> structure = new ResponseStructure<Hospital>();
		hospital = hospitalDao.updateHospital(hospital);
		structure.setBody(hospital);
		structure.setCode(HttpStatus.CREATED.value());
		structure.setMessage("Saved Succesfully");
		return new ResponseEntity<ResponseStructure<Hospital>>(structure, HttpStatus.CREATED);
	}

	public ResponseEntity<ResponseStructure<Hospital>> findHospitalById(int id) {
		ResponseStructure<Hospital> structure = new ResponseStructure<Hospital>();
		Optional<Hospital> hospital = hospitalDao.findHospitalById(id);
		if (hospital.isEmpty()) {
			throw new IdNotFoundException();
		} else {
			structure.setBody(hospital.get());
			structure.setCode(HttpStatus.FOUND.value());
			structure.setMessage("Hospital Found");
		}
		return new ResponseEntity<ResponseStructure<Hospital>>(structure, HttpStatus.FOUND);
	}
}

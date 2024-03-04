package com.ty.hospitalbootapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.hospitalbootapp.dto.Hospital;
import com.ty.hospitalbootapp.dto.ResponseStructure;
import com.ty.hospitalbootapp.service.HospitalService;

@RestController
public class HospitalController {
	@Autowired
	HospitalService hospitalService;

	@PostMapping("/hospital")
	public ResponseEntity<ResponseStructure<Hospital>> saveHospital(@RequestBody Hospital hospital) {
		return hospitalService.saveHospital(hospital);
	}

	@GetMapping("/get")
	public Hospital getHospital() {
		return new Hospital();
	}

	@GetMapping("/hospital")
	public ResponseEntity<ResponseStructure<Hospital>> getHospital(@RequestParam int id) {
		return hospitalService.findHospitalById(id);
	}

	@PutMapping("/hospital")
	public ResponseEntity<ResponseStructure<Hospital>> updateHospital(@RequestBody Hospital hospital) {
		return hospitalService.updateHospital(hospital);
	}
}

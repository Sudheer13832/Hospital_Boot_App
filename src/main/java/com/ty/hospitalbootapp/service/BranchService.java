package com.ty.hospitalbootapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ty.hospitalbootapp.dao.BranchDao;
import com.ty.hospitalbootapp.dao.HospitalDao;
import com.ty.hospitalbootapp.dto.Branch;
import com.ty.hospitalbootapp.dto.Hospital;
import com.ty.hospitalbootapp.dto.ResponseStructure;

@Service
public class BranchService {
	@Autowired
	BranchDao branchDao;
	@Autowired
	HospitalDao hospitalDao;

	public ResponseEntity<ResponseStructure<Branch>> saveBranch(Branch branch, int hospital_id) {
		ResponseStructure<Branch> structure = new ResponseStructure<Branch>();
		Optional<Hospital> recHospital = hospitalDao.findHospitalById(hospital_id);
		if (!recHospital.isEmpty()) {
			Hospital hospital = recHospital.get();
			hospital.getBranches().add(branch);
			branch.setHospital(hospital);
			branchDao.saveBranch(branch);
			structure.setBody(branch);
			structure.setCode(HttpStatus.CREATED.value());
			structure.setMessage("Branch Saved Succefully");
		} else {
			structure.setBody(null);
			structure.setCode(HttpStatus.NOT_FOUND.value());
			structure.setMessage("Hospital ID NOT FOUND");
		}
		return new ResponseEntity<ResponseStructure<Branch>>(structure, HttpStatus.NOT_FOUND);
	}
}

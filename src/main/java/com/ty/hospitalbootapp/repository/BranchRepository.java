package com.ty.hospitalbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.hospitalbootapp.dto.Branch;

public interface BranchRepository extends JpaRepository<Branch, Integer> {

}

package com.ty.hospitalbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.hospitalbootapp.dto.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}

package com.ty.hospitalbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.hospitalbootapp.dto.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}

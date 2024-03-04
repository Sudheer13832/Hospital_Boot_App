package com.ty.hospitalbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.hospitalbootapp.dto.MedOrder;

public interface MedOrderRepository extends JpaRepository<MedOrder, Integer> {

}

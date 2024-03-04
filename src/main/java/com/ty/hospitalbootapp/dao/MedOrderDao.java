package com.ty.hospitalbootapp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.hospitalbootapp.dto.MedOrder;
import com.ty.hospitalbootapp.repository.MedOrderRepository;

@Repository
public class MedOrderDao {
	@Autowired
	MedOrderRepository repository;

	public MedOrder saveMedOrder(MedOrder medOrder) {
		return repository.save(medOrder);
	}

	public MedOrder updateMedOrder(MedOrder medOrder) {
		return repository.save(medOrder);
	}

	public Optional<MedOrder> findMedOrderById(int id) {
		return repository.findById(id);
	}

	public void delete(MedOrder medOrder) {
		repository.delete(medOrder);
	}

	public List<MedOrder> getAllMedOrders() {
		return repository.findAll();
	}
}

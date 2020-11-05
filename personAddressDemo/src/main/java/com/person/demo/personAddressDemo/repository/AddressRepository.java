package com.person.demo.personAddressDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.person.demo.personAddressDemo.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
	List<Address> findByPersonId(Long personId);	
}

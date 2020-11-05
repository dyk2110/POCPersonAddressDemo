package com.person.demo.personAddressDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.person.demo.personAddressDemo.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
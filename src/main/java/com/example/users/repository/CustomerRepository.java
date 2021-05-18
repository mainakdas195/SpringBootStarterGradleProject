package com.example.users.repository;

import org.springframework.stereotype.Repository;

import com.example.users.model.Customer;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{

}

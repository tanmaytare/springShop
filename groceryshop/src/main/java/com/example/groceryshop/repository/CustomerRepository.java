package com.example.groceryshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.groceryshop.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

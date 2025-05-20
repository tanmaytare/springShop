package com.example.groceryshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.groceryshop.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findByCustomerCustomerId(Long customerId);
}

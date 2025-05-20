package com.example.groceryshop.repository;

import com.example.groceryshop.model.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsumerRepository extends JpaRepository<Consumer, Long> {
    Consumer findByEmail(String email);
}

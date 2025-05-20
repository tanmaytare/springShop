package com.example.groceryshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.groceryshop.model.Consumer;
import com.example.groceryshop.model.Item;
import com.example.groceryshop.repository.ConsumerRepository;
import com.example.groceryshop.repository.ItemRepository;

@RestController
@CrossOrigin(origins = "*") // Allow frontend access
public class MainController {

    @Autowired
    private ConsumerRepository consumerRepo;

    @Autowired
    private ItemRepository itemRepo;

    @PostMapping("/register")
    public String register(@RequestBody Consumer consumer) {
        if (consumerRepo.findByEmail(consumer.getEmail()) != null) {
            return "Email already exists";
        }
        consumerRepo.save(consumer);
        return "Registration successful";
    }

    @PostMapping("/login")
    public String login(@RequestBody Consumer consumer) {
        Consumer existing = consumerRepo.findByEmail(consumer.getEmail());
        if (existing != null && existing.getPassword().equals(consumer.getPassword())) {
            return "Login successful";
        } else {
            return "Invalid email or password";
        }
    }

    @GetMapping("/items")
    public List<Item> getItems() {
        return itemRepo.findAll();
    }

    @PostMapping("/items")
    public Item addItem(@RequestBody Item item) {
        return itemRepo.save(item);
    }
}

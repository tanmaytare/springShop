package com.example.groceryshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.groceryshop.model.Customer;
import com.example.groceryshop.model.Item;
import com.example.groceryshop.repository.CustomerRepository;
import com.example.groceryshop.repository.ItemRepository;

@RestController
@CrossOrigin(origins = "*")
public class MainController {

    @Autowired
    private CustomerRepository customerRepo;

    @Autowired
    private ItemRepository itemRepo;

    @PostMapping("/register")
    public String register(@RequestBody Customer customer) {
        customerRepo.save(customer);
        return "Customer registered successfully";
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    @PostMapping("/items")
    public Item addItem(@RequestBody Item item) {
        return itemRepo.save(item);
    }

    @GetMapping("/items")
    public List<Item> getAllItems() {
        return itemRepo.findAll();
    }

    @GetMapping("/items/customer/{id}")
    public List<Item> getItemsByCustomer(@PathVariable Long id) {
        return itemRepo.findByCustomerCustomerId(id);
    }
}

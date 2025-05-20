package com.example.groceryshop.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    private String itemName;
    private double itemPrice;
    private LocalDate mnfDate;
    private LocalDate expriyDate;

    @ManyToOne
    @JoinColumn(name = "customer_id") // foreign key
    private Customer customer;

    // Getters and Setters
    public Long getItemId() { return itemId; }
    public void setItemId(Long itemId) { this.itemId = itemId; }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public double getItemPrice() { return itemPrice; }
    public void setItemPrice(double itemPrice) { this.itemPrice = itemPrice; }

    public LocalDate getMnfDate() { return mnfDate; }
    public void setMnfDate(LocalDate mnfDate) { this.mnfDate = mnfDate; }

    public LocalDate getExpriyDate() { return expriyDate; }
    public void setExpriyDate(LocalDate expriyDate) { this.expriyDate = expriyDate; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }
}

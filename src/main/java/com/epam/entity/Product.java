package com.epam.entity;

import java.util.UUID;

public class Product {
    private UUID id;
    private String name;
    private double cost;

    public Product() {
    }

    public Product(UUID id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}

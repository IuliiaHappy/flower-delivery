package com.epam.dto;

import com.epam.entity.Product;

import java.io.Serializable;

public class ProductDTO implements Serializable {
    private Long id;
    private String name;
    private double cost;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public ProductDTO(Product product) {
        if (product == null) {
            throw new IllegalArgumentException();
        }
        this.id = product.getId();
        this.name = product.getName();
        this.cost = product.getCost();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

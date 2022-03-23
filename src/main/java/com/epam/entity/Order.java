package com.epam.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {
    private UUID id;
    private Client client;
    private List<Product> products;
    private double cost;
    private String address;

    public Order() {
    }

    public Order(UUID id, Client client, List<Product> products, double cost, String address) {
        this.id = id;
        this.client = client;
        this.products = products;
        this.cost = cost;
        this.address = address;
    }

    public UUID getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        if (this.products == null) {
            this.products = new ArrayList<>();
        }
        this.products.add(product);
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

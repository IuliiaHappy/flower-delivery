package com.epam.dto;

import com.epam.entity.Order;

import java.io.Serializable;
import java.util.Set;
import java.util.stream.Collectors;

public class OrderDTO implements Serializable {
    private Long id;
    private ClientDTO client;
    private Set<ProductDTO> products;
    private double cost;
    private String address;

    public OrderDTO() {
    }

    public OrderDTO(Long id, ClientDTO client, Set<ProductDTO> products, double cost, String address) {
        this.id = id;
        this.client = client;
        this.products = products;
        this.cost = cost;
        this.address = address;
    }

    public OrderDTO(Order order) {
        this.id = order.getId();
        this.client = new ClientDTO(order.getClient());
        this.products = order.getProducts().stream().map(ProductDTO::new).collect(Collectors.toSet());
        this.cost = order.getCost();
        this.address = order.getAddress();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClientDTO getClient() {
        return client;
    }

    public void setClient(ClientDTO client) {
        this.client = client;
    }

    public Set<ProductDTO> getProducts() {
        return products;
    }

    public void setProducts(Set<ProductDTO> products) {
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

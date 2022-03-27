package com.epam.dto;

import java.io.Serializable;
import java.util.Set;

public class NewOrderDTO implements Serializable {
    private Long id;
    private Long clientId;
    private Set<Long> productIds;
    private double cost;
    private String address;

    public NewOrderDTO() {
    }

    public NewOrderDTO(Long id, Long clientId, Set<Long> productIds, double cost, String address) {
        this.id = id;
        this.clientId = clientId;
        this.productIds = productIds;
        this.cost = cost;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Set<Long> getProductIds() {
        return productIds;
    }

    public void setProductIds(Set<Long> productIds) {
        this.productIds = productIds;
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

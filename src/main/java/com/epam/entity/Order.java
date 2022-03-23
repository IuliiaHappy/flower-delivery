package com.epam.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "_Order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private Client client;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "Part_Order",
            joinColumns = @JoinColumn(name = "order_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"))
    private Set<Product> products;
    private double cost;
    private String address;

    public Order() {
    }

    public Order(Long id, Client client, Set<Product> products, double cost, String address) {
        this.id = id;
        this.client = client;
        this.products = products;
        this.cost = cost;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        if (this.products == null) {
            this.products = new HashSet<>();
        }
        this.products.add(product);
    }

    public void setProducts(Set<Product> products) {
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

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", client=" + client +
                ", products=" + products +
                ", cost=" + cost +
                ", address='" + address + '\'' +
                '}';
    }
}

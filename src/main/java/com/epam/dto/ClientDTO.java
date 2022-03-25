package com.epam.dto;

import com.epam.entity.Client;

import java.io.Serializable;

public class ClientDTO implements Serializable {
    private Long id;
    private String fullName;
    private String email;
    private String phone;

    public ClientDTO() {
    }

    public ClientDTO(Long id, String fullName, String email, String phone) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
    }

    public ClientDTO(Client client) {
        if (client == null) {
            throw new RuntimeException();
        }
        this.id = client.getId();
        this.fullName = client.getName() + " " + client.getSurname();
        this.email = client.getEmail();
        this.phone = client.getPhone();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

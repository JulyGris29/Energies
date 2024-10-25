package com.Energies.Energies.Entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int documentId;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 100)
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false, length =  100)
    private String address;

    /*@OneToMany(targetEntity = EnergyType.class, fetch = FetchType.LAZY, mappedBy = "user")
    private List<EnergyDetail> energyDetails;*/


    public User(int document_id, String name, String lastName, String email, String address) {
        this.documentId = document_id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }

    public User() {
    }

    public int getDocument_id() {
        return documentId;
    }

    public void setDocument_id(int document_id) {
        this.documentId = document_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "document_id=" + documentId +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

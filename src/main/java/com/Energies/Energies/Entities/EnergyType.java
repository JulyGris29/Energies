package com.Energies.Energies.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class EnergyType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int energyTypeId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private float price;

    /*@OneToMany(targetEntity = EnergyDetail.class)
    private List<EnergyDetail> energyDetails;*/

    /*@OneToMany(mappedBy = "energyType",  fetch = FetchType.LAZY)
    private List<EnergyDetail>energyDetails;*/

    /*@OneToMany(targetEntity = EnergyDetail.class, fetch = FetchType.LAZY, mappedBy = "energyType");
    private List<EnergyDetail> energyDetail;*/

    public EnergyType() {
    }

    public EnergyType(int energyTypeId, String name, String type, float price) {
        this.energyTypeId = energyTypeId;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public int getEnergyTypeId() {
        return energyTypeId;
    }

    public void setEnergyTypeId(int energyTypeId) {
        this.energyTypeId = energyTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "EnergyType{" +
                "energyTypeId=" + energyTypeId +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}

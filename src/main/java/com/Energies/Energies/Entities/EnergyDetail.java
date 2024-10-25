package com.Energies.Energies.Entities;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class EnergyDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int energyDetailId;

    @ManyToOne(targetEntity = EnergyType.class)
    @JoinColumn(name = "EnergyTypeId")
    private EnergyType energyType;

    @Column(columnDefinition = "DATE")
    private LocalDate buyDate;

    @Column(columnDefinition = "DATE")
    private LocalDate installationDate;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "documentId")
    private User user;


    public EnergyDetail() {
    }

    public EnergyDetail(int energyDetailId, LocalDate buyDate, LocalDate installationDate) {
        this.energyDetailId = energyDetailId;
        this.buyDate = buyDate;
        this.installationDate = installationDate;
    }

    public int getEnergyDetailId() {
        return energyDetailId;
    }

    public void setEnergyDetailId(int energyDetailId) {
        this.energyDetailId = energyDetailId;
    }

    public LocalDate getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(LocalDate buyDate) {
        this.buyDate = buyDate;
    }

    public LocalDate getInstallationDate() {
        return installationDate;
    }

    public void setInstallationDate(LocalDate installationDate) {
        this.installationDate = installationDate;
    }

    @Override
    public String toString() {
        return "EnergyDetail{" +
                "energyDetailId=" + energyDetailId +
                ", buyDate=" + buyDate +
                ", installationDate=" + installationDate +
                '}';
    }
}
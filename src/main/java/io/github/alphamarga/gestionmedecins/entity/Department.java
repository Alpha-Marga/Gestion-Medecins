package io.github.alphamarga.gestionmedecins.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Department {
    @Id
    private Long number;
    @ManyToOne
    private Country country;
    @OneToMany(mappedBy = "department")
    private Set<Medecin> medecins;

    public Department(Long number, Country country, Set<Medecin> medecins) {
        this.number = number;
        this.country = country;
        this.medecins = medecins;
    }

    public Department() {
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Set<Medecin> getMedecins() {
        return medecins;
    }

    public void setMedecins(Set<Medecin> medecins) {
        this.medecins = medecins;
    }

    @Override
    public String toString() {
        return "Department{" +
                "number='" + number + '\'' +
                ", country=" + country +
                '}';
    }
}

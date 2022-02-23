package io.github.alphamarga.gestionmedecins.entity;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table
public class Speciality {
    @Id
    private String id;
    @NotNull
    private String specialityName;
    @OneToMany (mappedBy = "speciality")
    private Set<Medecin> medecins;

    public Speciality(String id, String specialityName) {
        this.id = id;
        this.specialityName = specialityName;
    }

    public Speciality() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSpecialityName() {
        return specialityName;
    }

    public void setSpecialityName(String specialityName) {
        this.specialityName = specialityName;
    }

    public Set<Medecin> getMedecins() {
        return medecins;
    }

    public void setMedecins(Set<Medecin> medecins) {
        this.medecins = medecins;
    }

    @Override
    public String toString() {
        return "Speciality{" +
                "id='" + id + '\'' +
                ", specialityName='" + specialityName + '\'' +
                '}';
    }

}

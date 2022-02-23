package io.github.alphamarga.gestionmedecins.entity;

import javax.persistence.*;

@Entity
@Table

public class Medecin {
    @Id
    private Long id;
    //    @Column(name = "prenom");
    private String firstName;
    private String name;
    private String adress;
    private String tel;
    @ManyToOne
    private Speciality speciality;
    @ManyToOne
    private Department department;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Medecin{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", tel='" + tel + '\'' +
                ", speciality=" + speciality +
                ", department=" + department +
                '}';
    }
}

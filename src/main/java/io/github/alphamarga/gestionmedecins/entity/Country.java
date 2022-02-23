package io.github.alphamarga.gestionmedecins.entity;

import javax.persistence.*;
import com.sun.istack.NotNull;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Country {
    @Id
    private String code;
    @NotNull
    private String countryName;
    @OneToMany(mappedBy = "country")
    private Set<Department> departments;

    public Country(String code, String countryName) {
        this.code = code;
        this.countryName = countryName;
    }

    public Country() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Set<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}
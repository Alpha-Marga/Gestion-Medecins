package io.github.alphamarga.gestionmedecins.service;

import io.github.alphamarga.gestionmedecins.entity.Department;
import io.github.alphamarga.gestionmedecins.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> getDepartmentByCountry(String country_code){
        return this.departmentRepository.findDepartmentByCountry_Code(country_code);
    }

    public Optional<Department> getDepartmentById(Long number){
        return this.departmentRepository.findById(number);
    }
}

package io.github.alphamarga.gestionmedecins.repository;

import io.github.alphamarga.gestionmedecins.entity.Country;
import io.github.alphamarga.gestionmedecins.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    List<Department> findDepartmentByCountry_Code(String country_code);
}

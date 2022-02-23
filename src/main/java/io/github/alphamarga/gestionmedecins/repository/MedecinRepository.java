package io.github.alphamarga.gestionmedecins.repository;

import io.github.alphamarga.gestionmedecins.entity.Department;
import io.github.alphamarga.gestionmedecins.entity.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedecinRepository extends JpaRepository<Medecin, Long>{
    List<Medecin> findMedecinsByDepartment(Department department);
}

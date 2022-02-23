package io.github.alphamarga.gestionmedecins.repository;

import io.github.alphamarga.gestionmedecins.entity.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialityRepository extends JpaRepository<Speciality, String> {
}

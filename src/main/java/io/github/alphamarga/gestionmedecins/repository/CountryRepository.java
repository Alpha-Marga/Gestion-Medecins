package io.github.alphamarga.gestionmedecins.repository;

import io.github.alphamarga.gestionmedecins.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, String> {
}

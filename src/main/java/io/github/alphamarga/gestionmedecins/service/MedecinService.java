package io.github.alphamarga.gestionmedecins.service;

import io.github.alphamarga.gestionmedecins.entity.Department;
import io.github.alphamarga.gestionmedecins.entity.Medecin;
import io.github.alphamarga.gestionmedecins.repository.MedecinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedecinService {
    private final MedecinRepository medecinRepository;

    @Autowired
    public MedecinService(MedecinRepository medecinRepository) {
        this.medecinRepository = medecinRepository;
    }

    public List<Medecin> getMedecinsDepartment(Department department){
        return medecinRepository.findMedecinsByDepartment(department);
    }
}

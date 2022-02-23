package io.github.alphamarga.gestionmedecins.service;

import io.github.alphamarga.gestionmedecins.entity.Country;
import io.github.alphamarga.gestionmedecins.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    private final CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> getAllCountry(){
        return countryRepository.findAll();
    }
}

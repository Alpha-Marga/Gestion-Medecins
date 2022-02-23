package io.github.alphamarga.gestionmedecins.controller;

import io.github.alphamarga.gestionmedecins.entity.Country;
import io.github.alphamarga.gestionmedecins.entity.Department;
import io.github.alphamarga.gestionmedecins.entity.Medecin;
import io.github.alphamarga.gestionmedecins.service.CountryService;
import io.github.alphamarga.gestionmedecins.service.DepartmentService;
import io.github.alphamarga.gestionmedecins.service.MedecinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/pays")
public class CountryController {
    private final CountryService countryService;
    private final DepartmentService departmentService;
    private final MedecinService medecinService;

    @Autowired
    public CountryController(CountryService countryService, DepartmentService departmentService, MedecinService medecinService) {
        this.countryService = countryService;
        this.departmentService = departmentService;
        this.medecinService = medecinService;
    }

    @GetMapping(path="")
    public String country(Model model) {

        List<Country> pays= countryService.getAllCountry();

        model.addAttribute("pays", pays);
        return "pays";
    }

    @GetMapping("/{id}")
    public String getDepartments(Model model, @PathVariable("id") String id){
        List<Department> departments = departmentService.getDepartmentByCountry(id);

        model.addAttribute("departments", departments);
        return "departements";
    }

    @GetMapping("/medecins/{id}")
    public String getMedecinsDepartement(Model model, @PathVariable("id") Long number){
        Optional<Department> departement = departmentService.getDepartmentById(number);
        Department leDepartement = departement.get();
        List<Medecin> medecins = medecinService.getMedecinsDepartment(leDepartement);

        model.addAttribute("medecins", medecins);

        return "medecins";
    }
}

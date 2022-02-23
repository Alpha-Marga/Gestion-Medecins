package io.github.alphamarga.gestionmedecins.controller;

import io.github.alphamarga.gestionmedecins.entity.Country;
import io.github.alphamarga.gestionmedecins.entity.Visitor;
import io.github.alphamarga.gestionmedecins.service.CountryService;
import io.github.alphamarga.gestionmedecins.service.MyUserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class HomeController {
    private final CountryService countryService;

    @Autowired
    public HomeController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping(path = "")
    public String index(Model model, Authentication authentication){
        MyUserPrincipal myUserPrincipal = (MyUserPrincipal) authentication.getPrincipal();
        Visitor visitor = myUserPrincipal.getVisitor();
        List<Country> pays= countryService.getAllCountry();

        model.addAttribute("pays", pays);
        model.addAttribute("visiteur", visitor.getName());
        model.addAttribute("title", "Accueil");
        return "index";
    }

   @GetMapping(path = "/login")
    public String login(@RequestParam(name = "error", required = false) String error, Model model) {
        // Set the "error" attribute to true if the request parameter "error" is present
        if (error != null) {
            model.addAttribute("error", true);
        } else {
            model.addAttribute("error", false);
        }

        model.addAttribute("title", "Connexion");
        return "login";
    }

}

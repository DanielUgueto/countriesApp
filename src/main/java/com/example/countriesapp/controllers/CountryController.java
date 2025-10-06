package com.example.countriesapp.controllers;

import com.example.countriesapp.models.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @GetMapping("/countries")
    public List<Country> getCountries() {
        return List.of(
                new Country(1, "Norway"),
                new Country(2, "Sweden"),
                new Country(3, "Denmark")
        );
    }
}

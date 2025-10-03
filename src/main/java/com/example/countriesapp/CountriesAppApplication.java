package com.example.countriesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class})
public class CountriesAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CountriesAppApplication.class, args);
    }

}

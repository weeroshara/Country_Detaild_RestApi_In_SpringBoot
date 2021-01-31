package com.example.demo.services;

import com.example.demo.entity.CountryEntity;

import java.util.List;

public interface CountryServices {
    List<CountryEntity> findAllCountries();

    String saveCountry(CountryEntity countryData);


    String updateCountry(CountryEntity CountryEntity);

    CountryEntity findCountryById(Integer id);

    void deleteCountryById(Integer id);
}

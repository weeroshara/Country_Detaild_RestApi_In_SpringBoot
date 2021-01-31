package com.example.demo.controler;

import com.example.demo.entity.CountryEntity;
import com.example.demo.services.CountryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/rest/v2")
public class Country {

    @Autowired
    private CountryServices countryService;

    @GetMapping("/allcountries")
    public List<CountryEntity> allCountries(){
        return countryService.findAllCountries();
    }

    @PostMapping("/addcountry")
    public String addCountry(@RequestBody CountryEntity countryEntity){
        return  countryService.saveCountry(countryEntity);
    }

    @PutMapping("/updatecountry")
    public String updateCountry(@RequestBody CountryEntity countryEntity){
        return  countryService.updateCountry(countryEntity);
    }

    // @GetMapping("/findcountrybyid/{id}")
    // public CountryEntity getCountryById(@PathVariable Integer id){
    //     return  countryService.findCountryById(id);
    // }

    @DeleteMapping("/deletecountry/{id}")
    public void deleteCountry(@PathVariable Integer id){
        countryService.deleteCountryById(id);
    }
}

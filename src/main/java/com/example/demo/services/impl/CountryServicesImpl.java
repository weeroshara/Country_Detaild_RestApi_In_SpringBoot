package com.example.demo.services.impl;

import com.example.demo.entity.CountryEntity;
import com.example.demo.repository.CountryRepository;
import com.example.demo.services.CountryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServicesImpl implements CountryServices {


    @Autowired
    private CountryRepository countryRepository;


    @Override
    public List<CountryEntity> findAllCountries() {
        List<CountryEntity> allCountries = countryRepository.findAll();
        return allCountries;
    }

    @Override
    public String saveCountry(CountryEntity countryData) {
        countryRepository.save(countryData);
        return "data is saved";
    }

    @Override
    public String updateCountry(CountryEntity CountryEntity) {
        String msg=null;

        if(CountryEntity.getCountryId() != null){
            countryRepository.save(CountryEntity);
            msg="success to update";
        }else {
            msg="Error";
        }

        return msg;
    }

    @Override
    public CountryEntity findCountryById(Integer id) {
        return countryRepository.findAll().get(id);
    }


    @Override
    public void deleteCountryById(Integer id) {
        countryRepository.deleteById(id);
    }



}

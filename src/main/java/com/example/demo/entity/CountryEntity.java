package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name ="country")
public class CountryEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer countryId;
    private String countryName;
    private String countryLocation;
    private String countryCategory;

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryLocation() {
        return countryLocation;
    }

    public void setCountryLocation(String countryLocation) {
        this.countryLocation = countryLocation;
    }

    public String getCountryCategory() {
        return countryCategory;
    }

    public void setCountryCategory(String countryCategory) {
        this.countryCategory = countryCategory;
    }



}

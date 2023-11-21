package com.aurionpro.model;

public class Country {

//public class Country {
    private String countryCode;
    private String countryName;
    private int regionCode;

    public Country(String countryCode, String countryName, int regionCode) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.regionCode = regionCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getRegionCode() {
        return regionCode;
    }
}

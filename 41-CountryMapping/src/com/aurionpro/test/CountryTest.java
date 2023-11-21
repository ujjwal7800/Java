package com.aurionpro.test;

import java.util.*;

import com.aurionpro.model.Country;

public class CountryTest {
 public static void main(String[] args) {
  List<Country> countries = new ArrayList<>();
  countries.add(new Country("IT", "Italy", 1));
  countries.add(new Country("JP", "Japan", 3));
  countries.add(new Country("US", "United States of America", 2));
  countries.add(new Country("CA", "Canada", 2));
  countries.add(new Country("CN", "China", 3));
  countries.add(new Country("IN", "India", 3));
  countries.add(new Country("AU", "Australia", 3));
  countries.add(new Country("ZW", "Zimbabwe", 4));
  countries.add(new Country("SG", "Singapore", 3));
  countries.add(new Country("UK", "United Kingdom", 1));
  countries.add(new Country("FR", "France", 1));
  countries.add(new Country("DE", "Germany", 1));	
  countries.add(new Country("ZM", "Zambia", 4));
  countries.add(new Country("EG", "Egypt", 4));
  countries.add(new Country("BR", "Brazil", 2));
  countries.add(new Country("CH", "Switzerland", 1));
  countries.add(new Country("NL", "Netherlands", 1));
  countries.add(new Country("MX", "Mexico", 2));
  countries.add(new Country("KW", "Kuwait", 4));
  countries.add(new Country("IL", "Israel", 4));
  countries.add(new Country("DK", "Denmark", 1));
  countries.add(new Country("HK", "HongKong", 3));
  countries.add(new Country("NG", "Nigeria", 4));
  countries.add(new Country("AR", "Argentina", 2));
  countries.add(new Country("BE", "Belgium", 1));

  Map<Integer, String> regions = new HashMap<>();
  regions.put(1, "Europe");
  regions.put(2, "Americas");
  regions.put(3, "Asia");
  regions.put(4, "Middle East and Africa");

  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter a country code or region code: ");
  String input = scanner.nextLine();
  boolean foundCountry = false;
  if ( input.length() == 2 && input.matches("[a-zA-Z]{2}")) {
   for (Country country : countries) {
    if (country.getCountryCode().equalsIgnoreCase(input)) {
     System.out.println("Country: " + country.getCountryName());
     System.out.println("Region: " + regions.get(country.getRegionCode()));
      foundCountry = true;
     break; 
    }  
   }
   if (!foundCountry) {
                 System.out.println("Invalid country code.");
             }
  }
  else if (input.matches("[1-4]")) {
   int regionCode = Integer.parseInt(input);
   System.out.println("Countries in the " + regions.get(regionCode) + " region:");
   for (Country country : countries) {
    if (country.getRegionCode() == regionCode) {
     System.out.println(country.getCountryName());
    }
   }
  } 
  else {
   System.out.println("Invalid input.");
  }
 }
}

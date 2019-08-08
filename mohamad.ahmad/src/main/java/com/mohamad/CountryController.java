package com.mohamad;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
	
	@Autowired
	private CountryService countryService ;
	
	@RequestMapping("/countries")
	public List<Country> getAllCountries(){
		return countryService.getAllCountries() ;
	}
	
	@RequestMapping("/countries/{code}")
	public Country getCountryByCode(@PathVariable String code) {
		return countryService.getCountryByCode(code) ;
	}
}

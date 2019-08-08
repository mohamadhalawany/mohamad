package com.mohamad;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {
	@Id
	private String code  ;
	private int population , life_expectancy;
	private String name , continent  ;
	
	
	
	public Country(String code, int population, int life_expectancy, String name, String continent,
			String country_language) {
		super();
		this.code = code;
		this.population = population;
		this.life_expectancy = life_expectancy;
		this.name = name;
		this.continent = continent;
	}
	
	
	
	public Country() {
		super();
	}



	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public int getLife_expectancy() {
		return life_expectancy;
	}
	public void setLife_expectancy(int life_expectancy) {
		this.life_expectancy = life_expectancy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	
	
	

}

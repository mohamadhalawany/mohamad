package com.mohamad;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {

	public Country getCountryByCode(String code);

}

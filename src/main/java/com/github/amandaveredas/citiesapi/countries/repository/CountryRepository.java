package com.github.amandaveredas.citiesapi.countries.repository;

import com.github.amandaveredas.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}

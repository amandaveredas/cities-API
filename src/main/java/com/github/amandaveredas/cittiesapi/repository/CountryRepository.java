package com.github.amandaveredas.cittiesapi.repository;

import com.github.amandaveredas.cittiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}

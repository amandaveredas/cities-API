package com.github.amandaveredas.cittiesapi;

import com.github.amandaveredas.cittiesapi.countries.Country;
import com.github.amandaveredas.cittiesapi.repository.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    private CountryRepository repository;

    public CountryResource(CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    //Page: faz a paginação dos dados
    public Page<Country> countries(Pageable page){
        return repository.findAll(page);

    }

    @GetMapping("/{id}")
    public Country getOne(@PathVariable Long id) {
        //refatorei como optional pois o id pode não existir
        Optional<Country> optional = repository.findById(id);
        return optional.get();
    }
}

package com.github.amandaveredas.cittiesapi.states;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/staties")
public class StateRessource {

    private final StateRepository repository;

    public StateRessource(final StateRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<State> staties() {
        return repository.findAll();
    }
}

package com.alxnderq.pokeapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {

    @GetMapping(path = "/pokemon")
    public String home() {
        return "hola";
    }
}
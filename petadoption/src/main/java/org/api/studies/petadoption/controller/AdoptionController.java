package org.api.studies.petadoption.controller;

import jakarta.validation.Valid;
import org.api.studies.petadoption.domain.dto.CreateAdoptionRequest;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AdoptionController {
    @GetMapping(value = "api/petadoptions")
    public List<String> Listar() {
        List<String> petList = new ArrayList<String>();
        petList.add("Firu");
        petList.add("Nerón");
        return petList;
    }

    @GetMapping(value = "api/petadoptions/{id}")
    public String searchById(@PathVariable Integer id){
        return "Princesa " + id;
    }

    @GetMapping(value = "api/petadoptions/{name}")
    public String searchByName(@PathVariable String name){
        return "Chatram " + name;
    }

    @PostMapping(value = "api/petadoptions")
    public void createPetRegistration(@RequestBody @Valid CreateAdoptionRequest petRegistration) {
        return;
    }

}

package mz.co.vm.petshop.controller;

import mz.co.vm.petshop.domain.model.Pet;
import mz.co.vm.petshop.domain.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Sidónio Goenha on 11/22/20
 **/
@RestController()
@RequestMapping("/petshop/pets")
public class PetController {
    @Autowired
    private PetService petService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pet> findAllPets() {
        return petService.findAll();
    }

    @GetMapping(value = "/{petId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Pet findPetById(@PathVariable Long petId) {
        return petService.findById(petId);
    }
}

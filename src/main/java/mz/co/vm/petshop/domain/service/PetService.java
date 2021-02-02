package mz.co.vm.petshop.domain.service;

import mz.co.vm.petshop.domain.model.Pet;
import mz.co.vm.petshop.domain.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Sidónio Goenha on 11/22/20
 **/
@Service
public class PetService implements PetRepository {
    Pet pet1 = new Pet(1L, "Rex", "Dog", "Beagle");
    Pet pet2 = new Pet(2L, "Rust", "Dog", "German Shepherd");
    List<Pet> pets = Arrays.asList(pet1, pet2);

    @Override
    public Pet create(Pet pet) {
        return null;
    }

    @Override
    public List<Pet> findAll() {
        return pets;
    }

    @Override
    public Pet findById(Long id) {
        for (Pet pet: pets) {
            if (pet.getId().equals(id))
                return pet;
        }
        return null;
    }
}

package mz.co.vm.petshop.domain.repository;

import mz.co.vm.petshop.domain.model.Pet;

import java.util.List;

/**
 * Created by Sidónio Goenha on 11/22/20
 **/
public interface PetRepository {
    public Pet create(Pet pet);
    public List<Pet> findAll();
    public Pet findById(Long id);
}

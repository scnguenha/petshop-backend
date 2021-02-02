package mz.co.vm.petshop.domain.model;

/**
 * Created by Sidónio Goenha on 11/22/20
 **/
public class Pet {
    private Long id;
    private String name;
    private String type;
    private String breed;

    public Pet() {
    }

    public Pet(Long id, String name, String type, String breed) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.breed = breed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

package loclt.sfp.sfqpetclinicpractice.model;

public class PetType extends BaseEntity {
    private String name;

    public PetType() {
    }

    public PetType(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

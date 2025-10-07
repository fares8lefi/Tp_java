package tn.esprit.gestionzoo.entites;

public class Aqua extends Animal{
    private String habitat;

    public Aqua(){};
    public Aqua(String habitat ,String family, String name, int age, boolean isMammal){
        super(family,name,age,isMammal);
        this.habitat=habitat;
    }
    @Override
    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

}
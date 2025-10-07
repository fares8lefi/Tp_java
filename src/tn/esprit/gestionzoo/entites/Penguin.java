package tn.esprit.gestionzoo.entites;

public class Penguin extends Aqua {
    protected float swimmingDepth;

    // Constructeur par défaut
    public Penguin() {
    }

    // Constructeur paramétré
    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + ", Swimming Depth: " + swimmingDepth + " meters";
    }
}
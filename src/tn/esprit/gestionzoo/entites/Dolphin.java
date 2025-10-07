package tn.esprit.gestionzoo.entites;

public class Dolphin  extends Aqua {

    public Dolphin() {
    }
        protected   float swimmingSpeed ;
    // Constructeur paramétré
    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family ,name,age,isMammal ,habitat,swimmingSpeed);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", Swimming Speed: " + swimmingSpeed + " km/h";
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}

package tn.esprit.gestionzoo.entites;

import java.lang.ref.PhantomReference;

public class Terres extends Animal {
private  int nbrLegs ;
    public Terres() {
    }

    // Constructeur paramétré
    public Terres(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of Legs: " + nbrLegs;
    }

}

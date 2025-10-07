package tn.esprit.gestionzoo.entites;

public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
    public Animal(){}
    // Constructeur paramétré
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    // getters
    public String getName() {
        return name;
    }
    public String getFamily() {
        return family;
    }
    public int getAge() {
        return  age ;
    }
    public boolean isMammal() {
        return isMammal;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setFamily(String family) {
        this.name = family;
    }

    public void setAge(int age) {
        if(age <=0){
            System.out.println("Invalid Age");
        }
        this.age = age;
    }

    public void setIsMammal(boolean isMammal) {
        this.isMammal =  isMammal ;
    }


    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entites.Animal [Famille=" + family + ", Nom=" + name + ", Âge=" + age + ", Mammifère=" + isMammal + "]";
    }

}
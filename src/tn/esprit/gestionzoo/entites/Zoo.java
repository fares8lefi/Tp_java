package tn.esprit.gestionzoo.entites;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    private int animalCount = 0;

    public Zoo() {
        this.animals = new Animal[25]; // valeur par défaut
        this.nbrCages = 25;
    }

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages]; // capacité selon nbrCages
    }

    public void displayZoo() {
        System.out.println("tn.esprit.gestionzoo.entites.Zoo : " + name + ", Ville : " + city + ", Cages : " + nbrCages);
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entites.Zoo [Nom=" + name + ", Ville=" + city + ", Cages=" + nbrCages + "]";
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Impossible d'ajouter, tableau plein.");
            return false;
        }
        if (searchAnimal(animal) != -1) {
            System.out.println("Cet animal existe déjà.");
            return false;
        }
        animals[animalCount] = animal;
        animalCount++;
        return true;
    }

    public void displayAnimals() {
        System.out.println("Liste des animaux dans le zoo " + name + " :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("tn.esprit.gestionzoo.entites.Animal introuvable.");
            return false;
        }
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;
        return true;
    }

    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) return z1;
        else if (z2.animalCount > z1.animalCount) return z2;
        else return null;
    }
    // getters
    public String getName() {
        return  name ;
    }

    public String getCity() {
        return  city ;
    }
    public int getNbrCages() {
        return  nbrCages ;
    }
    public int getAnimalCount() {
        return  animalCount ;
    }

    //setters
    public void setCity(String city) {
        this.city =  city ;
    }

    public void setName(String name) {
        this.name =  name ;
    }
    public void setIsMammal(int nbrCages) {
        this.nbrCages =  nbrCages ;
    }
    public void setAnimalCount(int animalCount) {
        this.animalCount =  animalCount ;
    }
}

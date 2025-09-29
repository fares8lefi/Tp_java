import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        String zooName = sc.nextLine();

        int nbrCages;
        do {
            System.out.print("Entrez le nombre de cages (entier positif) : ");
            nbrCages = sc.nextInt();
        } while (nbrCages <= 0);

        System.out.println(zooName + " comporte " + nbrCages + " cages.");
        //Prosit 2
        Animal lion = new Animal();
        lion.family = "Félidé";
        lion.name = "Lion";
        lion.age = 5;
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "Parc Animalier";
        myZoo.city = "Tunis";



        System.out.println("Animal : " + lion.name + " (" + lion.family + ")");

        Animal lion1 = new Animal("Félidé", "Lion", 5, true);


        System.out.println("Animal créé : " + lion1.name);


        myZoo.displayZoo();
        System.out.println(myZoo);

        Zoo zoo1 = new Zoo("Zoo ", "Tunis",7);
        Zoo zoo2 = new Zoo("Zoo gafsa", "Sousse",5);
        Animal tigre = new Animal("Félidé", "Shere Khan", 7, true);
        Animal lion2 = new Animal("Félidé", "Lion", 5, true);
        zoo1.addAnimal(lion);
        zoo1.addAnimal(tigre);
        zoo1.addAnimal(lion2);
        zoo1.displayAnimals();
        System.out.println("Indice : " + zoo1.searchAnimal(lion));
        System.out.println("Indice : " + zoo1.searchAnimal(tigre));
        zoo1.removeAnimal(tigre);
        zoo1.displayAnimals();
        for (int i = 0; i < 30; i++) {
            zoo1.addAnimal(new Animal("TestFamily", "Animal" + i, 2, false));
        }
        System.out.println("Zoo plein " + zoo1.isZooFull());
        zoo2.addAnimal(new Animal("Canidés", "Wolf", 4, true));
        Zoo plusGrand = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("Zoo avec le plus d'animaux : " + plusGrand);
    }
}
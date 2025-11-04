package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entites.Animal;
import tn.esprit.gestionzoo.entites.Zoo;

import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {



        try {
            myZoo.addAnimal(new Animal("Lion", 5));
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        try {
            myZoo.addAnimal(new Animal("Serpent", -2));
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        try {
            myZoo.addAnimal(new Animal("Tigre", 3));
            myZoo.addAnimal(new Animal("Girafe", 7));
            myZoo.addAnimal(new Animal("Zèbre", 4)); // Dépassement ici
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
package com.example.libjeu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Donner un nom a votre heros");
        String nameHero = read.nextLine();
        System.out.println("Donner un genre au heros [ Homme - Femme ]");
        String genderHero = read.nextLine();

        Heros Gerald = new Heros(nameHero, 4, 20, 1, true, genderHero);

        Monstre Skeleton = new Monstre("Ske01", 1, 1, 1, true,  "Skeleton", false);
        Monstre Zombie = new Monstre("Zom02", 1, 1, 1, true, "Zombie", false);
        Monstre Wizard = new Monstre("Wiz03", 1, 1, 1, true, "Wizard", false);

        Gerald.afficherEtat();
        Skeleton.afficherEtat();
        Zombie.afficherEtat();
        Wizard.afficherEtat();

        Gerald.attaquer(Skeleton);
        Skeleton.afficherEtat();

        Zombie.attaquer(Gerald);
        Wizard.attaquer(Gerald);
        Gerald.afficherEtat();

        Gerald.attaquer(Zombie);
        Zombie.afficherEtat();

        Wizard.attaquer(Gerald);
        Gerald.afficherEtat();

        Gerald.attaquer(Wizard);
        Wizard.afficherEtat();

    }
}

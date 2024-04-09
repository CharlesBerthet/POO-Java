package fr.cpe.zoo.exercice2;
import fr.cpe.zoo.base.*;
import fr.cpe.zoo.exercice1.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AppExo2 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int menu = -1;
        String animal;
        String ordre;

        Zoo zoo = new Zoo();

        ArrayList<Animal> ListeAnimaux = new ArrayList<Animal>();

        Elephant elephant1 = new Elephant("Djumbo", 1995, 1500, 2.50, SexeAnimal.FEMININ, Continent.ASIE);
        ListeAnimaux.add(elephant1);

        Girafe girafe1 = new Girafe("Sophie", 2003, 670, 4.15, SexeAnimal.FEMININ);
        ListeAnimaux.add(girafe1);

        Serpent serpent1 = new Serpent("Sonny", 2022, 1.1, 2, SexeAnimal.FEMININ, EspeceSerpent.A_SONNETTE);
        ListeAnimaux.add(serpent1);

        Ours ours1 = new Ours("Teddy", 2018, 767, 1.5, SexeAnimal.FEMININ, EspeceOurs.POLAIRE);
        ListeAnimaux.add(ours1);


        try {
            do {
                System.out.println("\r\n-----------");
                System.out.println("MENU ZOO CPE");
                System.out.println("-----------");
                System.out.println("0.Quitter");
                System.out.println("1. Afficher les animaux");
                System.out.println("2. Cri des animaux");
                System.out.println("3. Repas d'un animal");
                System.out.println("4. Tuerie d'un animal");
                System.out.println("5. Suppression d'un animal");
                System.out.println("6. Trier les animaux par age");
                System.out.println("7. Trier les animaux par nom");
                System.out.println("8. Trier les animaux par taille");
                System.out.println("9. Trier les animaux par poids");
                System.out.println("10. Création d'un animal");

                menu = sc.nextInt();

                switch(menu) {
                    case 0:
                        System.out.println("Au revoir !");
                        break;

                    case 1:
                        System.out.println("===========");
                        System.out.println("LES HABITANTS DU ZOO");
                        System.out.println("===========");
                        System.out.println(zoo.afficherAnimaux(ListeAnimaux));
                        break;

                    case 2:
                        System.out.println("===========");
                        System.out.println("LES CRIS");
                        System.out.println("===========");
                        System.out.println(zoo.faitCrierSesAnimaux(ListeAnimaux));
                        break;

                    case 3:
                        System.out.println("===========");
                        System.out.println("REPAS");
                        System.out.println("===========");
                        try {
                            System.out.println("Quel Animal ?");
                            animal = sc.next();
                            System.out.println(zoo.rechercherAnimal(ListeAnimaux, animal));
                        }
                        catch (InputMismatchException e) {
                            System.out.println("Erreur de saisie");
                        }
                        break;

                    case 4:
                        System.out.println("===========");
                        System.out.println("TUERIE DE CARNIVORE");
                        System.out.println("===========");
                        System.out.println(zoo.tueriCarnivore(ListeAnimaux));
                        break;

                    case 5:
                        System.out.println("===========");
                        System.out.println("SUPPRESSION");
                        System.out.println("===========");
                        try {
                            System.out.println("Quel animal ?");
                            animal = sc.next();
                            System.out.println(zoo.supprimerAnimal(ListeAnimaux, animal));
                        }
                        catch (InputMismatchException e){
                            System.out.println("Erreur de saisie");
                        }
                        break;

                    case 6:
                        System.out.println("===========");
                        System.out.println("TRI PAR ORDRE ALPHABÉTIQUE");
                        System.out.println("===========");
                        break;

                    case 7:
                        System.out.println("===========");
                        System.out.println("TRI PAR AGE");
                        System.out.println("===========");
                        try {
                            System.out.println("Croissant (C) ou Décroissant (D) ?");
                            ordre = sc.next();
                            zoo.trierAnimauxParDateNaissance(ListeAnimaux, ordre);
                        }
                        catch (InputMismatchException e) {
                            System.out.println("Erreur de saisie");
                        }
                        break;

                    case 8:
                        System.out.println("===========");
                        System.out.println("TRI PAR TAILLE");
                        System.out.println("===========");
                        try {
                            System.out.println("Croissant (C) ou Décroissant (D) ?");
                            ordre = sc.next();
                            zoo.trierAnimauxParTaille(ListeAnimaux, ordre);
                        }
                        catch (InputMismatchException e) {
                            System.out.println("Erreur de saisie");
                        }
                        break;

                    case 9:
                        System.out.println("===========");
                        System.out.println("TRI PAR POIDS");
                        System.out.println("===========");
                        try {
                            System.out.println("Croissant (C) ou Décroissant (D) ?");
                            ordre = sc.next();
                            zoo.trierAnimauxParPoids(ListeAnimaux, ordre);
                        }
                        catch (InputMismatchException e) {
                            System.out.println("Erreur de saisie");
                        }
                        break;

                    case 10:
                        System.out.println("===========");
                        System.out.println("Création d'un animal");
                        System.out.println("===========");
                        try {
                            System.out.println("Quel animal voulez-vous créer ?");
                            System.out.println("1. Elephant");
                            System.out.println("2. Girafe");
                            System.out.println("3. Serpent");
                            System.out.println("4. Ours");

                            int choix = sc.nextInt();

                            switch (choix) {
                                case 1:
                                    try {
                                        System.out.println("Entrez le nom de l'éléphant :");
                                        String nomElephant = sc.next();
                                        System.out.println("Entrez l'année de naissance de l'éléphant :");
                                        int anneeNaissanceElephant = sc.nextInt();
                                        System.out.println("Entrez le poids de l'éléphant :");
                                        double poidsElephant = sc.nextDouble();
                                        System.out.println("Entrez la taille de l'éléphant :");
                                        double tailleElephant = sc.nextDouble();
                                        System.out.println("Entrez le sexe de l'éléphant (MASCULIN, FEMININ, HERMAPHRODITE : ");
                                        SexeAnimal sexeElephant = SexeAnimal.valueOf(sc.next().toUpperCase());
                                        System.out.println("Entrez le continent d'origine de l'éléphant :");
                                        Continent continentElephant = Continent.valueOf(sc.next().toUpperCase());
                                        ListeAnimaux.add(new Elephant(nomElephant, anneeNaissanceElephant, poidsElephant, tailleElephant, sexeElephant, continentElephant));
                                    }
                                    catch (InputMismatchException e) {
                                        System.out.println("Erreur de saisie");
                                    }
                                    break;

                                case 2:
                                    try {
                                        System.out.println("Entrez le nom de la girafe :");
                                        String nomGirafe = sc.next();
                                        System.out.println("Entrez l'année de naissance de la girafe :");
                                        int anneeNaissanceGirafe = sc.nextInt();
                                        System.out.println("Entrez le poids de la girafe :");
                                        double poidsGirafe = sc.nextDouble();
                                        System.out.println("Entrez la taille de la girafe :");
                                        double tailleGirafe = sc.nextDouble();
                                        System.out.println("Entrez le sexe de la girafe (MASCULIN, FEMININ, HERMAPHRODITE : ");
                                        SexeAnimal sexeGirafe = SexeAnimal.valueOf(sc.next().toUpperCase());
                                        ListeAnimaux.add(new Girafe(nomGirafe, anneeNaissanceGirafe, poidsGirafe, tailleGirafe, sexeGirafe));
                                    }
                                    catch (InputMismatchException e) {
                                        System.out.println("Erreur de saisie");
                                    }
                                    break;

                                case 3:
                                    try {
                                        System.out.println("Entrez le nom du serpent :");
                                        String nomSerpent = sc.next();
                                        System.out.println("Entrez l'année de naissance du serpent :");
                                        int anneeNaissanceSerpent = sc.nextInt();
                                        System.out.println("Entrez le poids du serpent :");
                                        double poidsSerpent = sc.nextDouble();
                                        System.out.println("Entrez la taille du serpent :");
                                        double tailleSerpent = sc.nextDouble();
                                        System.out.println("Entrez le sexe du serpent (MASCULIN, FEMININ, HERMAPHRODITE : ");
                                        SexeAnimal sexeSerpent = SexeAnimal.valueOf(sc.next().toUpperCase());
                                        System.out.println("Entrez l'espèce du serpent (BOA, COULEUVRE, CROTALE, A_SONNETTE, CORNU, ECHIDE) :");
                                        EspeceSerpent especeSerpent = EspeceSerpent.valueOf(sc.next().toUpperCase());
                                        ListeAnimaux.add(new Serpent(nomSerpent, anneeNaissanceSerpent, poidsSerpent, tailleSerpent, sexeSerpent, especeSerpent));
                                    }
                                    catch (InputMismatchException e) {
                                        System.out.println("Erreur de saisie");
                                    }
                                    break;

                                case 4:
                                    try {
                                        System.out.println("Entrez le nom de l'ours :");
                                        String nomOurs = sc.next();
                                        System.out.println("Entrez l'année de naissance de l'ours :");
                                        int anneeNaissanceOurs = sc.nextInt();
                                        System.out.println("Entrez le poids de l'ours :");
                                        double poidsOurs = sc.nextDouble();
                                        System.out.println("Entrez la taille de l'ours :");
                                        double tailleOurs = sc.nextDouble();
                                        System.out.println("Entrez le sexe de l'ours (MASCULIN, FEMININ, HERMAPHRODITE : ");
                                        SexeAnimal sexeOurs = SexeAnimal.valueOf(sc.next().toUpperCase());
                                        System.out.println("Entrez l'espèce de l'ours (BRUN, NOIR, POLAIRE) :");
                                        EspeceOurs especeOurs = EspeceOurs.valueOf(sc.next().toUpperCase());
                                        ListeAnimaux.add(new Ours(nomOurs, anneeNaissanceOurs, poidsOurs, tailleOurs, sexeOurs, especeOurs));
                                    }
                                    catch (InputMismatchException e) {
                                        System.out.println("Erreur de saisie");
                                    }
                                    break;
                            }
                        }
                        catch (InputMismatchException e) {
                            System.out.println("Erreur de saisie.");
                        }
                        break;
                }
            }
            while (menu != 0);
        }
        catch (InputMismatchException e) {
            System.out.println("Erreur de saisie.");
        }
        finally {
            sc.close();
        }
    }
}

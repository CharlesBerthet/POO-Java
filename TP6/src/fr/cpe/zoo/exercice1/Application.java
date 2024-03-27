package fr.cpe.zoo.exercice1;
import fr.cpe.zoo.base.*;

import java.util.ArrayList;
import java.util.Scanner; 

public class Application {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int menu = -1;
        String animal;
        String info;

        ArrayList<Animal> ListeAnimaux = new ArrayList<Animal>();

        Elephant elephant1 = new Elephant("DJUMBO", 1995, 1500, 2.50, SexeAnimal.MASCULIN, Continent.ASIE);
        Elephant elephant2 = new Elephant("Anna", 2011, 798, 1.75, SexeAnimal.FEMININ, Continent.AFRIQUE);
        ListeAnimaux.add(elephant1);
        ListeAnimaux.add(elephant2);

        Girafe girafe1 = new Girafe("Sophie", 2003, 670, 4.15, SexeAnimal.FEMININ);
        Girafe girafe2 = new Girafe("Daniel", 2022, 341, 1.75, SexeAnimal.MASCULIN);
        ListeAnimaux.add(girafe1);
        ListeAnimaux.add(girafe2);

        Serpent serpent1 = new Serpent("Sonny", 2022, 1.1, 2, SexeAnimal.FEMININ, EspeceSerpent.A_SONNETTE);
        Serpent serpent2 = new Serpent("Roger", 2023, 2.5, 3.5, SexeAnimal.MASCULIN, EspeceSerpent.BOA);
        ListeAnimaux.add(serpent1);
        ListeAnimaux.add(serpent2);

        Ours ours1 = new Ours("Teddy", 2018, 767, 1.5, SexeAnimal.FEMININ, EspeceOurs.POLAIRE);
        Ours ours2 = new Ours("Elmer", 2020, 655, 1.75, SexeAnimal.MASCULIN, EspeceOurs.BRUN);
        ListeAnimaux.add(ours1);
        ListeAnimaux.add(ours2);

        Zoo zoo = new Zoo();
        
        do 
        {
            System.out.println("\r\n-----------");
            System.out.println("MENU ZOO CPE");
            System.out.println("-----------");
            System.out.println("0.Quitter");
            System.out.println("1. Afficher des animaux");
            System.out.println("2. Cri des animaux");
            System.out.println("3. Repas d'un animal");
            System.out.println("4. Tuerie d'un animal");
            System.out.println("5. Suppression d'un animal");
            System.out.println("6. Trier les animaux par age");
            System.out.println("7. Trier les animaux par nom");
            System.out.println("8. Trier les animaux par taille");
            System.out.println("9. Trier les animaux par poids");

            menu = sc.nextInt();
            switch (menu) {
                case 0:
                    System.out.println("Au revoir");
                    break;
                
                case 1:
                    System.out.println("-----------");
                    System.out.println("LES HABITANTS DU ZOO");
                    System.out.println("-----------");
                    System.out.println(zoo.afficherAnimaux(ListeAnimaux));
                    break;

                case 2:
                    System.out.println("-----------");
                    System.out.println("CRIS");
                    System.out.println("-----------");
                    System.out.println(zoo.faitCrierSesAnimaux(ListeAnimaux));
                    break;

                case 3:
                    System.out.println("-----------");
                    System.out.println("REPAS");
                    System.out.println("-----------");
                    System.out.println("Quels animal ?");
                    animal = sc.next();
                    System.out.println(zoo.rechercherAnimal(ListeAnimaux, animal));
                    break;

                case 4:
                    System.out.println("-----------");
                    System.out.println("TUERIE DE CARNIVORE");
                    System.out.println("-----------");
                    System.out.println(zoo.tueriCarnivore(ListeAnimaux));
                    break;

                case 5:
                    System.out.println("-----------");
                    System.out.println("SUPPRESSION");
                    System.out.println("-----------");
                    System.out.println("Quels animal ?");
                    animal = sc.next();
                    System.out.println(zoo.supprimerAnimal(ListeAnimaux, animal));
                    break;

                case 6:
                    System.out.println("-----------");
                    System.out.println("DU PLUS JEUNE AU PLUS VIEUX");
                    System.out.println("-----------");
                    System.out.println("Croissant (C) ou Décroissant (D) ?");
                    info = sc.next();
                    zoo.trierAnimauxParDateNaissance(ListeAnimaux, info);
                    break;

                case 7:
                    System.out.println("-----------");
                    System.out.println("PAR ORDRE ALPHABETIQUE");
                    System.out.println("-----------");
                    break;
                
                case 8:
                    System.out.println("-----------");
                    System.out.println("DU PLUS PETIT AU PLUS GRAND");
                    System.out.println("-----------");
                    System.out.println("Croissant (C) ou Décroissant (D) ?");
                    info = sc.next();
                    zoo.trierAnimauxParTaille(ListeAnimaux, info);
                    break;
                
                case 9:
                    System.out.println("-----------");
                    System.out.println("DU PLUS MAIGRE AU PLUS GROS");
                    System.out.println("-----------");
                    System.out.println("Croissant (C) ou Décroissant (D) ?");
                    info = sc.next();
                    zoo.trierAnimauxParPoids(ListeAnimaux, info);
                    break;
            }
        } while (menu != 0);
    }
    
}

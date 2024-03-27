import java.util.ArrayList;
import java.util.Scanner; 

public class AppExo2 {
    
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int menu = -1;
        String animal;
        String info;

        ArrayList<Animal> ListeAnimaux = new ArrayList<Animal>();

        Humain humain1 = new Humain("Jack", 2003, 75, 1.80, SexeAnimal.MASCULIN, Continent.AMERIQUE);
        Humain humain2 = new Humain("Ying", 2020, 40, 1.30, SexeAnimal.FEMININ, Continent.ASIE);

        ListeAnimaux.add(humain1);
        ListeAnimaux.add(humain2);

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

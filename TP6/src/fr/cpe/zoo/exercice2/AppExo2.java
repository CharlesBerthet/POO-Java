package fr.cpe.zoo.exercice2;
import fr.cpe.zoo.base.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AppExo2 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int menu = -1;

        Zoo zoo = new Zoo();

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

                menu = sc.nextInt();

                switch(menu) {
                    case 0:
                        System.out.println("Au revoir !");
                        break;
                    
                }
            }
            while (menu != 0);
        }
        catch (InputMismatchException e) {
            System.out.println("Erreur de saisie. Merci de mettre un nombre valide");
        }
        finally {
            sc.close();
        }
    }
}

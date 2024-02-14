// Devinette d'un nombre

import java.util.Scanner;
import java.util.Random;

public class Exercice4 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int nombre = random.nextInt(100);
        int essai = 0;
        int proposition;
        Scanner scanner = new Scanner(System.in);
        
        // Jeu avec l'utilisateur
        System.out.println("Devinez le nombre entre 0 et 100");
        do {
            proposition = scanner.nextInt();
            essai++;
            if (proposition < nombre) {
                System.out.println("C'est plus !");
            } else if (proposition > nombre) {
                System.out.println("C'est moins !");
            }
        } while (proposition != nombre);
        
        // Affichage du résultat
        System.out.println(String.format("Bravo, vous avez trouvé en %d essai(s)", essai));
        scanner.close();
    }
}

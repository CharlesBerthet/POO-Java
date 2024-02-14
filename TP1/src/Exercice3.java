// Pair / pair / impair

import java.util.Random;

public class Exercice3 {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int nb1, nb2, nb3;
        int nbEssais = 0;
        
        // Génération de nombres aléatoires
        do {
            nb1 = random.nextInt(1000);
            nb2 = random.nextInt(1000);
            nb3 = random.nextInt(1000);
            nbEssais++;

            // Affichage des nombres générés
            System.out.println(String.format("Nombre 1 : %d, Nombre 2 : %d, Nombre 3 : %d", nb1, nb2, nb3));
        } while (!(nb1 % 2 == 0 && nb2 % 2 == 0 && nb3 % 2 != 0));

        // Affichage du résultat
        System.out.println(String.format("Combinaison pair/pair/impair obtenue après %d essai(s)", nbEssais));
    }
}


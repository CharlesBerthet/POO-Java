// Devinette d'un nombre avec un temps limité

import java.util.Scanner;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Exercice5 {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int nombre = random.nextInt(100);
        int essai = 0;
        int proposition;
        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();
        
        // Jeu avec l'utilisateur
        System.out.println("Devinez le nombre entre 0 et 100");
        timer.schedule(new TimerTask() {
            public void run() {
                System.out.println("Temps écoulé !");
                System.exit(0);
            }
        }, 30000);
        
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
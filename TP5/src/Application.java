import java.util.ArrayList;
import java.util.Scanner; 

public class Application {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int menu = -1;

        ArrayList<Animal> ListeAnimaux = new ArrayList<Animal>();
        
        do 
        {
            System.out.println("-----------");
            System.out.println("MENU ZOO CPE");
            System.out.println("-----------");
            System.out.println("0.Quitter");
            System.out.println("1. Afficher des animaux");
            System.out.println("2. Cri des animaux");
            System.out.println("3. Repas d'un animal");
            System.out.println("4. Tuerie d'un animal");
            System.out.println("5. Suppression d'un animal");
            System.out.println("6. Trier les animaux par age");

            menu = sc.nextInt();
            switch (menu) {
                case 0:
                    System.out.println("Au revoir");
                    break;
            
                default:
                    System.out.println("Erreur");
                    break;
            }
        } while (menu != 0);
    }
    
}

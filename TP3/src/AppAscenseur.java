import java.util.Scanner;

public class AppAscenseur {

    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int t;
        
        Ascenseur monAscenseur = new Ascenseur(-2, 10, 7);
        Ascenseur PetitAscenseur = new Ascenseur(0, 20, 5);
        Ascenseur grandAscenseur = new Ascenseur(-2, 11, 0);
        
        System.out.println("Etage min : " + monAscenseur.getEtageMin());
        System.out.println("Etage max : " + monAscenseur.getEtageMax());
        System.out.println("Etage courant : " + monAscenseur.getEtageCourant());

        System.out.println("\r\n ============ \r\n");

        System.out.println(PetitAscenseur.toString());

        System.out.println("\r\n ============ \r\n");

        System.out.println("Description de l'ascenseur : \r");
        System.out.println(grandAscenseur.toString());

        while (true) {
            System.out.println("Entrez l'étage d'appel : ");
            t = scanner.nextInt();
            System.out.println("============");
            grandAscenseur.va(t);
        }
    }

}

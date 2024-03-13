import java.util.Scanner;

public class AppCompte {
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int menu = -1;
        int argent;

        Compte compte = new Compte(5000.0);

        System.out.println("Numéro de compte :");
        System.out.println("Solde : " + compte.getSolde());

        while (menu != 0) {
            System.out.println(compte.toString());
            menu = scanner.nextInt();

            switch (menu) {
                case 0:
                    System.out.println("Au revoir");
                    scanner.close();
                    break;
                case 1:
                    System.out.println("Entrez le montant");
                    argent = scanner.nextInt();
                    compte.debiter(argent);
                case 2:
                    System.out.println("Entrez le montant");
                    argent = scanner.nextInt();
                    compte.crediter(argent);
                case 3:
                    compte.resume();
            }
        }

    }    
} 

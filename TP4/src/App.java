
import java.util.Scanner; 

public class App {
    public static void main (String args[]) {
        int rep;
		int menu =-1;

		int annee;
		int argent;
        Scanner sc=new Scanner(System.in);

		Compte compte = null;

		while (menu == -1) {
			System.out.println("1. Compte");
			System.out.println("2. Compte bloqué");
			System.out.println("3. Compte epargne");
			menu = sc.nextInt();

			switch (menu) {
				case 1:
					compte = new Compte(1000);
					break;
				case 2:
					compte = new CompteBloque(1000, -150);
					break;
				case 3:
					compte = new CompteEpargne(1000, -150, 5000, 0.03);
				default:
					break;
			}
		}

		do
		{
		    System.out.println("0.Quitter");
			System.out.println("1.Afficher infos");
			System.out.println("2.Afficher solde");
			System.out.println("3.Crediter");
			System.out.println("4.Debiter");
			rep = sc.nextInt();
			switch (rep)
			{
				case 0 : System.out.println("bye"); break;
				case 1 : 
					System.out.println(compte.toString());
					break;
				case 2 :
					System.out.println(compte.getSolde());
					break;
				case 3 :
					System.out.println("Entrez le montant");
					argent = sc.nextInt();
					compte.crediter(argent);
					break;
				case 4 :
					System.out.println("Entrez le montant");
					argent = sc.nextInt();
					compte.debiter(argent);
					break;
				case 5 :
					annee = sc.nextInt();
					compte.calculFuturMontant(annee);
					compte.calculInteret(annee);
					break;
				default : System.out.println("erreur");
			}
		} 
		while ( rep!=0);
        sc.close();
    }
}


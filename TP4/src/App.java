
import java.util.Scanner; 

public class App {
    public static void main (String args[]) {
        int rep;
        Scanner sc=new Scanner(System.in);

		Compte compte = new Compte(200);
		int argent;

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
				default : System.out.println("erreur");
			}
		} 
		while ( rep!=0);
        sc.close();
    }
}


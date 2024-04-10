import fr.cpe.enseignant.*;
import fr.cpe.salaire.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        EnseignantPermanent e1 = new EnseignantPermanent("DUPONT", "Jean", SpecialitesEnseignement.Informatique, 300);

        Vacataire e2 = new Vacataire("DURAND", "Pierre", SpecialitesEnseignement.Chimie, 50);

        Doctorant e3 = new Doctorant("DUPUIS", "Marie", SpecialitesEnseignement.Electronique, 120);


        System.out.println(e1);
        System.out.println("Salaire: " + e1.salaire());
        System.out.println("Charge: " + e1.charge());
        System.out.println("Total: " + e1.getTotal());
    }
}

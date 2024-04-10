import fr.cpe.CPE;
import fr.cpe.enseignant.*;
import fr.cpe.salaire.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        CPE cpe = new CPE();

        ArrayList<Enseignant> ListeEnseignant = new ArrayList<Enseignant>();

        EnseignantPermanent e1 = new EnseignantPermanent("DUPONT", "Jean", SpecialitesEnseignement.Informatique, 300);

        ListeEnseignant.add(new EnseignantPermanent("DUPONT", "Jean", SpecialitesEnseignement.Informatique, 300));
        ListeEnseignant.add(new Vacataire("DURAND", "Pierre", SpecialitesEnseignement.Chimie, 20));
        ListeEnseignant.add(new Doctorant("DUPUIS", "Marie", SpecialitesEnseignement.Electronique, 120));

        System.out.println(cpe.afficherEnseignant(ListeEnseignant));
    }
}

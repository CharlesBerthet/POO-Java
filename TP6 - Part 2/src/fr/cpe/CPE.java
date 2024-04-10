package fr.cpe;

import fr.cpe.enseignant.Enseignant;
import fr.cpe.enseignant.EnseignantPermanent;

import java.util.ArrayList;
import java.util.Collections;

public class CPE {

        public String afficherEnseignant(ArrayList<Enseignant> enseignants) {
            StringBuilder result = new StringBuilder();

            for (Enseignant enseignant : enseignants) {
                result.append(enseignant.toString()).append("\n");
            }

            return result.toString();
        }
}

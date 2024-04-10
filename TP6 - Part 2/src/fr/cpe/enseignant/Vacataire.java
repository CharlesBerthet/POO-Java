package fr.cpe.enseignant;

import fr.cpe.salaire.ISalaire;

public class Vacataire extends Enseignant implements ISalaire {

    public static final int SALAIRE_BRUT = 60;
    public static final String INFO = "Organisme externe à CPE";

    public Vacataire(String nom, String prenom, SpecialitesEnseignement specialite, int nbrHeures) {
        super(nom, prenom, specialite, nbrHeures);
    }


    @Override
    public double salaire() {
        return getNbrHeures() * SALAIRE_BRUT;
    }

    @Override
    public double charge() {
        return salaire() * CHARGE_PATRONAL;
    }

    @Override
    public double getTotal() {
        return salaire() + charge();
    }
}

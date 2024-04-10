package fr.cpe.enseignant;

import fr.cpe.salaire.ISalaire;

public class Doctorant extends Enseignant implements ISalaire {

    public static final int NBR_HEURES = 100;
    public static final int SALAIRE_BRUT = 40;

    public Doctorant(String nom, String prenom, SpecialitesEnseignement specialite, int nbrHeures) {
        super(nom, prenom, specialite, nbrHeures);
    }


    @Override
    public String toString()
    {
        return super.toString() + " - Doctorant";
    }


    @Override
    public double salaire() {
        if (getNbrHeures() <= NBR_HEURES) {
            return getNbrHeures() * SALAIRE_BRUT;
        }
        return NBR_HEURES * SALAIRE_BRUT;
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

package fr.cpe.enseignant;

import fr.cpe.salaire.ISalaire;

public class EnseignantPermanent extends Enseignant implements ISalaire {

    public static final int NBR_HEURES = 200;
    public static final int SALAIRE_BRUT = 3000;
    public static final int HEURE_COMP = 80;


    public EnseignantPermanent(String nom, String prenom, SpecialitesEnseignement specialite, int nbrHeures) {
        super(nom, prenom, specialite, nbrHeures);
    }

    @Override
    public double salaire() {
        if (getNbrHeures() <= NBR_HEURES) {
            return getNbrHeures() * SALAIRE_BRUT;
        }
        return NBR_HEURES * SALAIRE_BRUT + (getNbrHeures() - NBR_HEURES) * HEURE_COMP;
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
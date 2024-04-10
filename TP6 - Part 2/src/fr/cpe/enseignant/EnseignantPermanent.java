package fr.cpe.enseignant;

public class EnseignantPermanent extends Enseignant {

    public static final int SALAIRE_BRUT = 3000;
    public static final int HEURE_COMP = 80;

    public EnseignantPermanent(String nom, String prenom, SpecialitesEnseignement specialite, int nbrHeures) {
        super(nom, prenom, specialite, nbrHeures);

    }
}
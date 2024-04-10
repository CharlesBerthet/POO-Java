package fr.cpe.enseignant;

public class Doctorant extends Enseignant{

    public static final int NBR_HEURES = 100;
    public static final int SALAIRE_BRUT = 40;

    public Doctorant(String nom, String prenom, SpecialitesEnseignement specialite, int nbrHeures) {
        super(nom, prenom, specialite, nbrHeures);
    }
}

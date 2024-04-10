package fr.cpe.enseignant;

public class Vacataire extends Enseignant{

    public static final int SALAIRE_BRUT = 60;
    public static final String INFO = "Organisme externe à CPE";

    public Vacataire(String nom, String prenom, SpecialitesEnseignement specialite, int nbrHeures) {
        super(nom, prenom, specialite, nbrHeures);
    }
}

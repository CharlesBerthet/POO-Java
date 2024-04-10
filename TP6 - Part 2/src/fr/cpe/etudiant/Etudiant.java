package fr.cpe.etudiant;

import fr.cpe.enseignant.SpecialitesEnseignement;


public class Etudiant {

    private String nom;
    private String prenom;
    private Formation formation;
    private SpecialitesEnseignement specialite;
    private int nbrHeures;

    public static final int NBR_MAX = 50;
    public static final int SALAIRE_BRUT = 20;

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        if (nom != null && !nom.isEmpty()) {
            this.nom = nom.toUpperCase();
        } else {
            this.nom = "N/A";
            System.out.println("Erreur nom");
        }
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        if (prenom != null && !prenom.isEmpty()) {
            this.prenom = prenom.toUpperCase();
        } else {
            this.prenom = "N/A";
            System.out.println("Erreur prenom");
        }
    }

    public SpecialitesEnseignement getSpecialite() {
        return specialite;
    }
    public void setSpecialite(SpecialitesEnseignement specialite) {
        this.specialite = specialite;
    }

    public Formation getFormation() {
        return formation;
    }
    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public int getNbrHeures() {
        return nbrHeures;
    }
    public void setNbrHeures(int nbrHeures) {
        if (nbrHeures <= NBR_MAX) {
            this.nbrHeures = nbrHeures;
        } else {
            this.nbrHeures = NBR_MAX;
            System.out.println("Erreur nombre d'heures");
        }
    }


    public Etudiant(String nom, String prenom, SpecialitesEnseignement specialite, Formation formation, int nbrHeures) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setSpecialite(specialite);
        this.setFormation(formation);
        this.setNbrHeures(nbrHeures);
    }


    public double coutTotal() {
        return this.nbrHeures * SALAIRE_BRUT;
    }


    @Override
    public String toString()
    {
        return
            "\nNom : " + this.nom +
            "\nPrenom : " + this.prenom +
            "\nSpécialité d'enseignement : " + this.specialite +
            "\nNombre d'heures de cours : " + this.nbrHeures;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Etudiant etudiant) {
            return this.nom.equals(etudiant.nom) && this.prenom.equals(etudiant.prenom);
        }
        return false;
    }
}

package fr.cpe.enseignant;

public abstract class Enseignant {

    private String nom;
    private String prenom;
    private SpecialitesEnseignement specialite;
    private int nbrHeures;

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

    public int getNbrHeures() {
        return nbrHeures;
    }
    public void setNbrHeures(int nbrHeures) {
        this.nbrHeures = nbrHeures;
    }


    public Enseignant(String nom, String prenom, SpecialitesEnseignement specialite, int nbrHeures) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setSpecialite(specialite);
        this.setNbrHeures(nbrHeures);
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
        if (obj instanceof Enseignant enseignant) {
            return this.nom.equals(enseignant.nom) && this.prenom.equals(enseignant.prenom);
        }
        return false;
    }

}

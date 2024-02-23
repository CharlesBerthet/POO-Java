public class Entreprise {
    private String nom;
    private String taille;
    private int secteur;

    public String getNom() {
        return this.nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTaille() {
        return this.taille;
    }
    public void setTaille(String taille) {
        this.taille = "";
        if (taille != null){
            taille = taille.toUpperCase();
            if (taille.equals("TPE") || taille.equals("PME") || taille.equals("ETI") || taille.equals("GE")){
                this.taille = taille;
            }
        }
    }

    public int getSecteur() {
        return this.secteur;
    }
    public void setSecteur(int secteur) {
        this.secteur = 0;
        if (secteur >= 1 && secteur <= 3){
            this.secteur = secteur;
        }
    }


    public Entreprise(){
    }

    public Entreprise(String nom){
        this();
        this.setNom(nom);
    }

    public Entreprise(String nom, String taille){
        this(nom);
        this.setTaille(taille);
    }

    public Entreprise(String nom, int secteur){
        this(nom);
        this.setSecteur(secteur);
    }

    public Entreprise(String nom, String taille, int secteur){
        this(nom, taille);
        this.setSecteur(secteur);
    }


    @Override
    public String toString() {
        return
            "Nom = " + this.getNom() + " / " +
            "Taille = " + this.getTaille() + " / " +
            "Secteur = " + this.getSecteur();
    }


     @Override
     public boolean equals(Object obj) {
         Entreprise e;
         if (obj == null || obj.getClass() != this.getClass()){
             return false;
         }
         else{
             e = (Entreprise) obj;
             if (e.getNom().equals(this.getNom()) && e.getTaille().equals(this.getTaille()) && e.getSecteur() == this.getSecteur()){
                 return true;
             }
             else{
                 return false;
             }
        }
    }
}
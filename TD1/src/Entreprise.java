public class Entreprise {
    private String nom;
    private String taille;
    private int secteur;

    private static final String TAILLE_TRES_PETIT = "TPE";
    private static final String TAILLE_PETITE = "PE";
    private static final String TAILLE_MOYENNE = "ME";
    private static final String TAILLE_GRANDE = "GE";
    private static final String TAILLE_INCONNU = "";

    private static final int SECTEUR_PRIMAIRE = 1;
    private static final int SECTEUR_SECONDAIRE = 2;
    private static final int SECTEUR_TERTIAIRE = 3;
    private static final int SECTEUR_INCONNU = 0;


    public static String getTAILLE_TRES_PETITE() {
        return Entreprise.TAILLE_TRES_PETIT;
    }

    public static String getTAILLE_PETITE() {
        return Entreprise.TAILLE_PETITE;
    }

    public static String getTAILLE_MOYENNE() {
        return Entreprise.TAILLE_MOYENNE;
    }

    public static String getTAILLE_GRANDE() {
        return Entreprise.TAILLE_GRANDE;
    }

    public static String getTAILLE_INCONNU() {
        return Entreprise.TAILLE_INCONNU;
    }


    public static int getSECTEUR_PRIMAIRE() {
        return Entreprise.SECTEUR_PRIMAIRE;
    }

    public static int getSECTEUR_SECONDAIRE() {
        return Entreprise.SECTEUR_SECONDAIRE;
    }

    public static int getSECTEUR_TERTIAIRE() {
        return Entreprise.SECTEUR_TERTIAIRE;
    }

    public static int getSECTEUR_INCONNU() {
        return Entreprise.SECTEUR_INCONNU;
    }


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
        this.taille = Entreprise.getTAILLE_INCONNU();
        if (taille != null) {
            taille = taille.toUpperCase();
            if (taille.equals(Entreprise.getTAILLE_TRES_PETITE()) || taille.equals(Entreprise.getTAILLE_PETITE()) || taille.equals(Entreprise.getTAILLE_MOYENNE()) || taille.equals(Entreprise.getTAILLE_GRANDE())){
                this.taille = taille;
            }
        }
    }

    public int getSecteur() {
        return this.secteur;
    }
    public void setSecteur(int secteur) {
        this.secteur = Entreprise.getSECTEUR_INCONNU();
        if (secteur == Entreprise.getSECTEUR_PRIMAIRE() || secteur == Entreprise.getSECTEUR_SECONDAIRE() || secteur == Entreprise.getSECTEUR_TERTIAIRE()){
            this.secteur = secteur;
        }
    }


    public static String definirTaille (int nbEmployes) {
        String taille = Entreprise.getTAILLE_INCONNU();
        if (nbEmployes >= 0)
        {
            if (nbEmployes < 10) {
                taille = Entreprise.getTAILLE_TRES_PETITE();
            }
            else {
                if (nbEmployes < 50) {
                    taille = Entreprise.getTAILLE_PETITE();
                }
                else {
                    if (nbEmployes < 250) {
                        taille = Entreprise.getTAILLE_MOYENNE();
                    }
                    else {
                        taille = Entreprise.getTAILLE_GRANDE();
                    }
                }
            }
        }
        return taille;
    }


    public int nbEmployeMin() {
        int nb=-1;
        if (this.taille.equals(Entreprise.getTAILLE_TRES_PETITE())) {
            nb = 1;
        }
        else {
            if (this.taille.equals(Entreprise.getTAILLE_PETITE())) {
                nb = 10;
            }
            else {
                if (this.taille.equals(Entreprise.getTAILLE_MOYENNE())) {
                    nb = 50;
                }
                else {
                    if (this.taille.equals(Entreprise.getTAILLE_GRANDE())) {
                        nb = 250;
                    }
                }
            }
        }
        return nb;
    }


    public static int nbEmployeMinParTaille (String taille) {
        int nb=-1;
        if (taille.equals(Entreprise.getTAILLE_TRES_PETITE())) {
            nb = 1;
        }
        else {
            if (taille.equals(Entreprise.getTAILLE_PETITE())) {
                nb = 10;
            }
            else {
                if (taille.equals(Entreprise.getTAILLE_MOYENNE())) {
                    nb = 50;
                }
                else {
                    if (taille.equals(Entreprise.getTAILLE_GRANDE())) {
                        nb = 250;
                    }
                }
            }
        }
        return nb;
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
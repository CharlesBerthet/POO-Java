public class Humain extends Animal implements IOmnivore{

    private Continent origine;
    public static final int AGE_ADULTE = 18;
    public static final String TYPE = "Humain";

    public Continent getOrigine(){
        return origine;
    }
    public void setOrigine(Continent origine) {
        this.origine = origine;
    }

    Humain(){
    }

    Humain(String nom, int anneeNaissance, double poids, double taille, SexeAnimal sexeAnimal, Continent origine) {
        super(nom, anneeNaissance, poids, taille, sexeAnimal);
        this.setOrigine(origine);
    }

    @Override
    public boolean estAdulte(){
        if (getAge() > AGE_ADULTE) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String cri(){
        if (estAdulte() == true) {
            return "AAAH";
        } else {
            return "HOUIIIIINNN";
        }
    }

    @Override
    public String toString()
    {
        return
        super.toString() +
        "\nType : " + TYPE;
    }

    @Override
    public String getNom(){
        return super.getNom();
    }

    @Override
    public String tue(){
        return "Le " + TYPE + " Amnène ses proies à l'abatoire";
    }

    @Override
    public String plantePreferee(){
        return "Soja";
    }

    @Override
    public String proiePreferees(){
        return "Boeuf";
    }

    @Override
    public double qtteViandeSemaine(){
        return getPoids() * 0.05;
    }

    @Override
    public double qttePlanteJour(){
        return getPoids() * 0.05;
    }

    @Override
    public String mangerAvec(){
        if (this.origine == Continent.ASIE) {
            return "Il mange avec des baguettes";
        } else {
            return "Il mange avec des couverts";
        }
    }
}

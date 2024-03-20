public class Elephant extends Animal implements IHerbivore{

    private Continent origine;
    public static final int AGE_ADULTE = 13;
    public static final String TYPE = "Elephant";

    public Continent getOrigine(){
        return origine;
    }
    public void setOrigine(Continent origine) {
        this.origine = origine;
    }


    Elephant(){

    }

    Elephant(String nom, int anneeNaissance, double poids, double taille, SexeAnimal sexeAnimal, Continent origine){
        super(nom, anneeNaissance, poids, taille, sexeAnimal);
        this.setOrigine(origine);
    }

    public String info(){
        if (this.origine == Continent.ASIE) {
            return "Elephant d'Asie avec des petites oreilles";
        } else if (this.origine == Continent.AFRIQUE) {
            return "Elephant d'Afrique avec de belles defences";
        } else {
            return "Elephant d'origine inconnue";
        }
    }

    @Override
    public String cri() {
        if (estAdulte() == true) {
            return "HUUUUUMMMM";
        } else {
            return "huuuuuummmm";
        }
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
    public String toString()
    {
        return 
        super.toString() +
        "\nType : " + TYPE +
        "\nOrigine : " + this.origine +
        "\nInfo sup : " + this.info() +
        "\nJe mange cette quantité : " + this.qttePlanteJour() +
        "\nJe mange ça :" + this.plantePreferee();
    }

    @Override
    public double qttePlanteJour() {
        double quantite;
        quantite = this.getPoids() / 4;

        return quantite;
    }

    @Override
    public String plantePreferee() {
        if (getAge() <= 5) {
            return "lait maternel";
        } else {
            if (this.origine == Continent.ASIE) {
                return "herbes";
            } else if (this.origine == Continent.AFRIQUE) {
                return "feuillages et arbustes";
            } else {
                return "Elephant d'origine inconnue";
            }
        }
    }
}

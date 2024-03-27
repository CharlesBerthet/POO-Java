public class Ours extends Animal implements IOmnivore {
    public EspeceOurs espece;

    public static final int AGE_ADULTE_BRUN = 4;
    public static final int AGE_ADULTE = 3;
    public static final String TYPE = "Ours";

    public double quantiteNourriture = this.getPoids() * 0.07; 
    
    public EspeceOurs getEspece(){
        return espece;
    }
    public void setEspece(EspeceOurs espece) {
        this.espece = espece;
    }

    Ours(){

    }

    Ours(String nom, int anneeNaissance, double poids, double taille, SexeAnimal sexeAnimal, EspeceOurs espece) {
        super(nom, anneeNaissance, poids, taille, sexeAnimal);
        this.setEspece(espece);
    }


    @Override
    public boolean estAdulte(){
        if (this.espece == EspeceOurs.BRUN && getAge() > AGE_ADULTE_BRUN) {
            return true;
        } else if (getAge() > AGE_ADULTE) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String cri(){
        if (this.espece == EspeceOurs.POLAIRE) {
            return "GRRRRRRRRRRRRRRR";
        } else {
            return "Grrrrrrrrrrrr";
        }
    }

    @Override
    public String toString()
    {
        return
        super.toString() +
        "\nType : " + TYPE +
        "\nEspece : " + this.espece;
    }

    @Override
    public String getNom(){
        return super.getNom();
    }

    @Override
    public String tue(){
        return "Le " + TYPE + " " + this.espece + " mort sa proie";
    }


    @Override
    public String plantePreferee(){
        return "Fruits et racines";
    }

    @Override
    public String proiePreferees(){
        if (this.espece == EspeceOurs.BRUN || this.espece == EspeceOurs.NOIR) {
            return "Insectes, oiseaux, petits mammifères, phoques et saumons";
        } else {
            return "Insectes, oiseaux, petits mammifères";
        }
    }


    @Override
    public double qtteViandeSemaine(){
        return quantiteNourriture / 2;
    }

    @Override
    public double qttePlanteJour(){
        return quantiteNourriture / 2;
    }

    @Override
    public String mangerAvec(){
        return "";
    }
}  

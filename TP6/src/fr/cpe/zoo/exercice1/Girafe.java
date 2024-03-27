package fr.cpe.zoo.exercice1;
import fr.cpe.zoo.base.*;

public class Girafe extends Animal implements IHerbivore{

        public static final int AGE_ADULTE = 4;
        public static final String TYPE = "Girafe";

    
        Girafe(String nom, int anneeNaissance, double poids, double taille, SexeAnimal sexeAnimal){
            super(nom, anneeNaissance, poids, taille, sexeAnimal);
        }
    
        @Override
        public String cri() {
            if (estAdulte() == true) {
                return "MUUUUUU";
            } else {
                return "muuuuuu";
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
            "\nType : " + TYPE;
        }

        @Override
    public double qttePlanteJour() {
        double quantite;
        quantite = this.getPoids() / 20;

        return quantite;
    }

    @Override
    public String plantePreferee() {
        if (getAge() <= 5) {
            return "lait maternel";
        } else {
            return "acacias";
        }
    }

    @Override
    public String getNom(){
        return super.getNom();
    }
}    

package fr.cpe.zoo.exercice1;
import fr.cpe.zoo.base.*;

public class Serpent extends Animal implements ICarnivore{
    public EspeceSerpent espece;
    private Boolean venimeux;

    public static final int AGE_ADULTE = 2;
    public static final String TYPE = "Serpent";

    public EspeceSerpent getEspece(){
        return espece;
    }
    public void setEspece(EspeceSerpent espece) {
        this.espece = espece;
    }

    public Boolean getVenimeux(){
        return venimeux;
    }
    public void setVenimeux(Boolean venimeux) {
        this.venimeux = venimeux;
    }

    public boolean estVenimeux(){
        if (this.espece == EspeceSerpent.BOA || this.espece == EspeceSerpent.COULEUVRE) {
            return false;
        } else {
            return true;
        }
    }


    public Serpent(String nom, int anneeNaissance, double poids, double taille, SexeAnimal sexeAnimal, EspeceSerpent espece) {
        super(nom, anneeNaissance, poids, taille, sexeAnimal);
        this.setEspece(espece);
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
    public String cri() {
        if (this.espece == EspeceSerpent.CROTALE || this.espece == EspeceSerpent.A_SONNETTE) {
            return "GUILING GUILING";
        } else if (this.espece == EspeceSerpent.CORNU || this.espece == EspeceSerpent.ECHIDE){
            return "CRRRRRRRRR";
        } else {
            return "SSSSSSSSSSSSSS";
        }


    } @Override
    public String toString()
    {
        return 
        super.toString() +
        "\nType : " + TYPE +
        "\nEspece : " + this.espece +
        "\nVenimeux : " + this.estVenimeux();
    }

    @Override
    public String getNom(){
        return super.getNom();
    }

    @Override
    public double qtteViandeSemaine() {
        if (getAge() < 1) {
            return 0.05;
        } else if (getAge() < 2) {
            return 0.1;
        } else {
            return 1.0;
        }
    }

    @Override
    public String tue(){
        if (estVenimeux() == true) {
            return "Le " + TYPE + " " + this.espece + " etouffe sa proie"; 
        } else if (estVenimeux() == true && this.espece != EspeceSerpent.COULEUVRE) {
            return "Le " + TYPE + this.espece + " mort sa proie"; 
        } else {
            return "Le " + TYPE + this.espece + " avale sa proie"; 
        }
    }

    @Override
    public String proiePreferees(){
        if (getAge() < 1) {
            return "souriceaux";
        } else if (getAge() < 2) {
            return "souris";
        } else {
            return "cochon d'inde";
        }
    }
}

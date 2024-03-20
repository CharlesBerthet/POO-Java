import java.time.Year;

public abstract class Animal {

    private int anneeNaissance;
    private String nom;
    private double poids;
    private double taille;
    private SexeAnimal sexeAnimal;

    public static final String UM_AGE = "an(s)";
    public static final String UM_POIDS = "kg";
    public static final String UM_TAILLE = "m";

    public int getAnneeNaissance() {
        return anneeNaissance;
    }
    public void setAnneeNaissance(int anneeNaissance) {
        if (anneeNaissance < Year.now().getValue()) {
            this.anneeNaissance = anneeNaissance;
        } else {
            this.anneeNaissance = -1;
            System.out.println("Erreur naissance");
        }
    }

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

    public double getPoids() {
        return poids;
    }
    public void setPoids(double poids) {
        if (poids > 0) {
            this.poids = poids;
        } else {
            this.poids = -1;
            System.out.println("Erreur poids");
        }
    }

    public double getTaille() {
        return taille;
    }
    public void setTaille(double taille) {
        if (taille > 0) {
            this.taille = taille;
        } else {
            this.taille = -1;
            System.out.println("Erreur taille");
        }
    }

    public SexeAnimal getSexeAnimal(){
        return sexeAnimal;
    }
    public void setSexeAnimal(SexeAnimal SexeAnimal) {
        this.sexeAnimal = SexeAnimal;
    }

    public int getAge(){
        int age = Year.now().getValue() - this.anneeNaissance;
        return age;
    }

    public abstract String cri();
    public abstract boolean estAdulte();
    

    Animal() {

    }

    Animal(String nom, int anneeNaissance, double poids, double taille) {
        this.setNom(nom);
        this.setAnneeNaissance(anneeNaissance);
        this.setPoids(poids);
        this.setTaille(taille);
    }

    Animal(String nom, int anneeNaissance, double poids, double taille, SexeAnimal sexeAnimal) {
        this.setNom(nom);
        this.setAnneeNaissance(anneeNaissance);
        this.setPoids(poids);
        this.setTaille(taille);
        this.setSexeAnimal(sexeAnimal);
    }
    

    @Override
    public String toString()
    {
        return 
        "\nNom : " + this.nom +
        "\nAnnée de naissance : " + this.anneeNaissance +
        "\nPoids : " + this.poids + UM_POIDS +
        "\nSexe : " +  this.sexeAnimal +
        "\nTaille : " + this.taille + UM_TAILLE +
        "\nAge : " + this.getAge() + UM_AGE +
        "\nAdulte : " + this.estAdulte() +
        "\nCri : " + cri();  
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            Animal a = (Animal) obj;
            return this.nom.equals(a.nom);
        }
        return false;
    }
}




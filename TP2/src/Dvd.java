import java.time.Duration;
import java.time.LocalDate;

public class Dvd extends Article{
    private Duration duree;
    private String prenomRealisateur;
    private String nomRealisateur;
    private LocalDate naissance;

    public Duration getDuree(){
        return this.duree;
    }
    public void setDuree(Duration duree){
        this.duree = duree;
    }

    public String getPrenomRealisateur(){
        return this.prenomRealisateur;
    }
    public void setPrenomRealisateur(String prenomRealisateur){
        this.prenomRealisateur = prenomRealisateur;
    }

    public String getNomRealisateur(){
        return this.nomRealisateur;
    }
    public void setNomRealisateur(String nomRealisateur){
        this.nomRealisateur = nomRealisateur;
    }

    public LocalDate getNaissance(){
        return this.naissance;
    }
    public void setNaissance(LocalDate naissance){
        this.naissance = naissance;
    }


    public Dvd(){
    }

    public Dvd(String reference, String designation, double prix, Duration duree, String prenomRealisateur, String nomRealisateur, LocalDate naissance){
        super(reference, designation, prix);
        this.setDuree(duree);
        this.setPrenomRealisateur(prenomRealisateur);
        this.setNomRealisateur(nomRealisateur);
        this.setNaissance(naissance);
    }


    public void affichageDvd(){
        System.out.println("DVD : \n\r");
        super.affichage();
        System.out.println("durée : " + duree.toMinutes() + " minutes");
        System.out.println("réalisateur : " + prenomRealisateur + " " + nomRealisateur);
    }


    @Override
    public String toString(){
        return
        super.toString() + " / Durée (min) : " + this.duree.toMinutes() +" / Réalisateur : " + prenomRealisateur + " " + nomRealisateur; 
    }
}

import java.time.LocalDate;

public class Livre extends Article {
    private int numISBN;
    private int numPage;
    private String prenomAuteur;
    private String nomAuteur;
    private LocalDate naissance;

    public int getNumISBN(){
        return this.numISBN;
    }
    public void setNumISBN(int numISBN){
        this.numISBN = numISBN;
    }

    public int getNumPage(){
        return this.numPage;
    }
    public void setNumPage(int numPage){
        this.numPage = numPage;
    }

    public String getPrenomAuteur(){
        return this.prenomAuteur;
    }
    public void setPrenomAuteur(String prenomAuteur){
        this.prenomAuteur = prenomAuteur;
    }

    public String getNomAuteur(){
        return this.nomAuteur;
    }
    public void setNomAuteur(String nomAuteur){
        this.nomAuteur = nomAuteur;
    }

    public LocalDate getNaissance(){
        return this.naissance;
    }
    public void setNaissance(LocalDate naissance){
        this.naissance = naissance;
    }


    public Livre(){
    }

    public Livre(String reference, String designation, double prix, int numISBN, int numPage, String prenomAuteur, String nomAuteur, LocalDate naissance){
        super(reference, designation, prix);
        this.setNumISBN(numISBN);
        this.setNumPage(numPage);
        this.setPrenomAuteur(prenomAuteur);
        this.setNomAuteur(nomAuteur);
        this.setNaissance(naissance);
    }


    public void affichageLivre(){
        System.out.println("Livre : \n\r");
        super.affichage();
        System.out.println("nombre de pages : " + numPage);
        System.out.println("auteur : " + prenomAuteur + " " + nomAuteur);
    }


    @Override
    public String toString(){
        return
        super.toString() + " / Nb pages : " + numPage + " / Auteur : " + prenomAuteur + " " + nomAuteur;
    }
}

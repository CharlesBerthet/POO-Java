public class Article {
    private static int numero;
    private String reference;
    private String designation;
    private double prix;

    public static int getNumero(){
        return numero;
    }

    public String getReference(){
        return reference;
    }
    public void setReference(String reference){
        this.reference = reference;
    }

    public String getDesignation(){
        return designation;
    }
    public void setDesignation(String designation){
        this.designation = designation;
    }

    public double getPrix(){
        return prix;
    }
    public void setPrix(double prix){
        this.prix = prix;
    }


    public Article(){
    }

    public Article(String reference){
        this.setReference(reference);
    }

    public Article(String reference, String designation){
        this(reference);
        this.setDesignation(designation);
    }

    public Article(String reference, String designation, double prix){
        this(reference, designation);
        this.setPrix(prix);
        numero++;
    }


    public void affichage(){
        System.out.println("\nnumero : " + numero);
        System.out.println("reference : " + reference);
        System.out.println("designation : " + designation);
        System.out.println("prix : "+ prix);
    }

    @Override
    public String toString(){
        return
        prix + " / " + reference + " / " + designation + " / " + prix + "€";
    }
}

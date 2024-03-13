public class Compte {
    private int numCpt;
    private double solde;
    private static int numeroEnCours;
    private static double totalDebit;
    private static double totalCredit;
    private static int nbCredit;
    private static int nbDebit;

    public int getNumCpt() {
        return this.numCpt;
    }
    public void setNumCpt(int numCpt) {
        this.numCpt = numCpt;
    }

    public double getSolde() {
        return this.solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }

    public static int getNumeroEnCours() {
        return numeroEnCours;
    }

    public static double getTotalDebit() {
        return totalDebit;
    }

    public static double getTotalCredit() {
        return totalCredit;
    }

    public static int getNbDebit() {
        return nbDebit;
    }

    public static int getNbCredit() {
        return nbCredit;
    }


    public Compte(){
    }

    public Compte(double solde) {
        this.setSolde(solde);
        numeroEnCours++;
        this.numCpt = numeroEnCours;
    }

    public void crediter(double montant) {
        solde = solde + montant;
        totalCredit =+ montant;
        nbCredit++;
        System.out.println("Solde : " + solde);
    }

    public void debiter(double montant) {
        if (montant > solde) {
            System.out.println("Fond insuffisant");
        } else {
            solde = solde - montant;
            totalDebit =+ montant;
            nbDebit++;
            System.out.println("Solde : " + solde);
        }
    }

    public void resume() {
        System.out.println("Resume");
        System.out.println("Nombre des debits effectues : " + nbDebit);
        System.out.println("Montant total des debits : " + totalDebit);
        System.out.println("Nombre des credits effectues :" + nbCredit);
        System.out.println("Montant total des credits : " + totalCredit);
        System.out.println("Solde actuel : " + solde);
    }    

    @Override
    public String toString(){
        return
        "\n0. Quitter \n1. Prelevements \n2. Versements \n3. Résumé";
    }

    @Override
    public boolean equals(Object obj) {
        Compte c;
        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        else {
            c = (Compte) obj;
            if (Integer.valueOf(c.getNumCpt()).equals(Integer.valueOf(this.getNumCpt()))) {
                return true;
            }
            else {
                return false;
            }
        }
    }

}




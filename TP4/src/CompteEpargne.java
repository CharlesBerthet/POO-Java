public class CompteEpargne extends CompteBloque{

    private double txEpargne;
    private double maxAutorise;

    public double getTxEpargne() {
        return this.txEpargne;
    }

    public double getMaxAutorise() {
        return this.maxAutorise;
    }

    CompteEpargne(){

    }

    CompteEpargne(double solde, double seuilMin, double maxAutorise, double txEpargne) {
        super(solde, seuilMin);
        this.maxAutorise = maxAutorise;
        this.txEpargne = txEpargne;
    }

    public boolean crediter(double montant)
    { 
        if (this.solde + montant > getMaxAutorise()) {
            this.solde = this.solde + montant;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString(){
        return
        super.toString() + "\nSeuil max : " + this.maxAutorise + "\nTaux Epargne : " + this.txEpargne;
    }

    public double calculFuturMontant(int nbAnnee) {
        double futurSolde = getSolde();
        for (int i = 0; i < nbAnnee; i++) {
            futurSolde *= (1 + getTxEpargne());
        }

        System.out.println("montant : " + futurSolde);
        return futurSolde;
    }

    public double calculInteret(int nbAnnee) {
        double futurSolde = getSolde();

        for (int i = 0; i < nbAnnee; i++) {
            futurSolde *= (1 + getTxEpargne());
        }
        double gain = futurSolde - getSolde();
        
        System.out.println("gain : " + gain);
        return gain;
    }
}


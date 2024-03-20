public class CompteBloque extends Compte {

    private double seuilMin;

    public double getSeuilMin() {
        return this.seuilMin;
    }
    
    CompteBloque() {

    }

    CompteBloque(double solde, double seuilMin) {
        super(solde);
        this.seuilMin = seuilMin;
    }

    public boolean debiter(double montant)
    { 
        if (this.solde - montant < getSeuilMin())
        {
            this.solde = this.solde - montant;
            return true;
        } else {
            return false;
        }
        
    }

    @Override
    public String toString(){
        return
        super.toString() + "\nSeuil min : " + this.seuilMin;
    }
}

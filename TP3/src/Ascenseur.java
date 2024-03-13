public class Ascenseur {
    private int etageMin;
    private int etageMax;
    private int etageCourant;
    private int etage;
    
    public static String avertisseur = "beep";

    public int getEtageMin() {
        return this.etageMin;
    }
    public void setEtageMin(int etageMin) {
        if (etageMin < -10)
            this.etageMin = -10;
        else
            this.etageMin = etageMin;
    }

    public int getEtageMax() {
        return this.etageMax;
    }
    public void setEtageMax(int etageMax) {
        if (etageMax > 50)
            this.etageMax = 50;
        else
            this.etageMax = etageMax;
    }

    public int getEtageCourant() {
        return this.etageCourant;
    }
    public void setEtageCourtant(int etageCourant) {
        this.etageCourant = etageCourant;
    }

    public int getEtage() {
        return this.etage;
    }
    public void setEtage(int etage) {
        this.etage = etage;
    }


    public Ascenseur() {
    }

    public Ascenseur(int etageMin, int etageMax, int etageCourant) {
        this.setEtageMin(etageMin);
        this.setEtageMax(etageMax);
        this.setEtageCourtant(etageCourant);
    }


    @Override
    public String toString() {
        return 
        "Etage min = " + this.getEtageMin() + " / " +
        "Etage max = " + this.getEtageMax() + " / " +
        "Etage courant = " + this.getEtageCourant();
    }

    public void avertit() {
        System.out.println(avertisseur);
    }

    public boolean etageValide(int etage) {
        if (etage >= etageMin && etage <= etageMax) {
            return true;
        }
        return false;
    }

    public void va(int etage) {
        if (etageValide(etage)) {
            while (etageCourant != etage) {
                System.out.println(etageCourant);
                if (etageCourant < etage) {
                    etageCourant++;
                }
                else{
                    etageCourant--;
                }
            }
            System.out.println(etageCourant);
            avertit();
        }else {
            System.out.println("Etage invalide");
        }
    }
}



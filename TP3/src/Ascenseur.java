public class Ascenseur {
    private int etageMin;
    private int etageMax;
    private int etageCourant;
    
    public static String avertisseur = "beep";

    public int getEtageMin() {
        return this.etageMin;
    }
    public void setEtageMin(int etageMin) {
        this.etageMin = etageMin;
    }

    public int getEtageMax() {
        return this.etageMax;
    }
    public void setEtageMax(int etageMax) {
        this.etageMax = etageMax;
    }

    public int getEtageCourant() {
        return this.etageCourant;
    }
    public void setEtageCourtant(int etageCourant) {
        this.etageCourant = etageCourant;
    }


    public Ascenseur(int etageMin, int etageMax, int etageCourant) {
        this.etageMin = etageMin;
        this.etageMax = etageMax;
        this.etageCourant = etageCourant;
    }
}



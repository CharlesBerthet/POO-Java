package fr.cpe.salaire;

public interface ISalaire {

    public static final double CHARGE_PATRONAL = 0.3;

    public double salaire();
    public double charge();
    public double getTotal();
}

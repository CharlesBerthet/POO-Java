public class AppliEntreprise {
    public static void main(String[] args) throws Exception {
        Entreprise myEntreprise = new Entreprise("myNet", "TPE", 3);
        System.out.println(myEntreprise.getNom());
    }
}


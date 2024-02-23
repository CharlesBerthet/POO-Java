public class AppliEntreprise {
    public static void main(String[] args) throws Exception
    {
        Entreprise myNetEntreprise = new Entreprise("myNet", Entreprise.getTAILLE_TRES_PETITE(), Entreprise.getSECTEUR_TERTIAIRE());
        System.out.println(myNetEntreprise);
    }
}


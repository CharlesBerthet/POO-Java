public class AppliEntreprise {
    public static void main(String[] args) throws Exception
    {
        Entreprise myNetEntreprise = new Entreprise("myNet", Entreprise.getTAILLE_TRES_PETITE(), Entreprise.getSECTEUR_TERTIAIRE());
        System.out.println(myNetEntreprise);
        System.out.println("Nb employés min : " + myNetEntreprise.nbEmployeMin());

        System.out.println("\r\n ----------------- \r\n");

        Entreprise mondeeEntreprise = new Entreprise("Mondee", Entreprise.definirTaille(500), Entreprise.getSECTEUR_PRIMAIRE());
        System.out.println(mondeeEntreprise);
        System.out.println("Nb employés min : " + mondeeEntreprise.nbEmployeMin());

        System.out.println("\r\n ----------------- \r\n");

        System.out.println("Nb employés minimum pour une TPE : " + Entreprise.nbEmployeMinParTaille(Entreprise.getTAILLE_TRES_PETITE()));
        System.out.println("Nb employés minimum pour une ME : " + Entreprise.nbEmployeMinParTaille(Entreprise.getTAILLE_MOYENNE()));
        System.out.println("Nb employés minimum pour une GE : " + Entreprise.nbEmployeMinParTaille(Entreprise.getTAILLE_GRANDE()));
    }
}


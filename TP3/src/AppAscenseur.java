public class AppAscenseur {

    public static void main(String[] args) throws Exception
    {
        Ascenseur monAscenseur = new Ascenseur(-2, 10, 7);
        
        System.out.println("Etage min : " + monAscenseur.getEtageMin());
        System.out.println("Etage max : " + monAscenseur.getEtageMax());
        System.out.println("Etage courant : " + monAscenseur.getEtageCourant());

        System.out.println("\r\n ============ \r\n");

        System.out.println(monAscenseur.toString());
    }

}

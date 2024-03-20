public class App {
    public static void main(String[] args) throws Exception {

        Elephant elephant1 = new Elephant("DJUMBO", 1995, 1500, 2.50, SexeAnimal.MASCULIN, Continent.ASIE);
        Elephant elephant2 = new Elephant("Anna", 2011, 798, 1.75, SexeAnimal.FEMININ, Continent.AFRIQUE);

        Girafe girafe1 = new Girafe("Sophie", 2003, 670, 4.15, SexeAnimal.FEMININ);
        Girafe girafe2 = new Girafe("Daniel", 2022, 341, 1.75, SexeAnimal.MASCULIN);
    
        System.out.println(elephant1);
        System.out.println("\n\r ==================\n\r");
        System.out.println(elephant2);

        System.out.println("\n\r ==================\n\r");
        System.out.println(girafe1);
        System.out.println("\n\r==================\n\r");
        System.out.println(girafe2);

    }

}

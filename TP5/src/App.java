import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<IHerbivore> ListeHerbivore = new ArrayList<IHerbivore>();

        Elephant elephant1 = new Elephant("DJUMBO", 1995, 1500, 2.50, SexeAnimal.MASCULIN, Continent.ASIE);
        ListeHerbivore.add(elephant1);
        Elephant elephant2 = new Elephant("Anna", 2011, 798, 1.75, SexeAnimal.FEMININ, Continent.AFRIQUE);
        ListeHerbivore.add(elephant2);

        Girafe girafe1 = new Girafe("Sophie", 2003, 670, 4.15, SexeAnimal.FEMININ);
        ListeHerbivore.add(girafe1);
        Girafe girafe2 = new Girafe("Daniel", 2022, 341, 1.75, SexeAnimal.MASCULIN);
        ListeHerbivore.add(girafe2);
    
        for (IHerbivore h : ListeHerbivore) {
            System.out.println(h);
            System.out.println(h.getNom() + " mange " + h.plantePreferee() + " en quantité " + h.qttePlanteJour() + " kg par jour");
        }

    }

}

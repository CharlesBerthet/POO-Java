import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<IHerbivore> ListeHerbivore = new ArrayList<IHerbivore>();
        ArrayList<ICarnivore> ListeCarnivore = new ArrayList<ICarnivore>();

        Elephant elephant1 = new Elephant("DJUMBO", 1995, 1500, 2.50, SexeAnimal.MASCULIN, Continent.ASIE);
        ListeHerbivore.add(elephant1);
        Elephant elephant2 = new Elephant("Anna", 2011, 798, 1.75, SexeAnimal.FEMININ, Continent.AFRIQUE);
        ListeHerbivore.add(elephant2);

        Girafe girafe1 = new Girafe("Sophie", 2003, 670, 4.15, SexeAnimal.FEMININ);
        ListeHerbivore.add(girafe1);
        Girafe girafe2 = new Girafe("Daniel", 2022, 341, 1.75, SexeAnimal.MASCULIN);
        ListeHerbivore.add(girafe2);

        Serpent serpent1 = new Serpent("Sonny", 2022, 1.1, 2, EspeceSerpent.A_SONNETTE);
        ListeCarnivore.add(serpent1);
        Serpent serpent2 = new Serpent("Roger", 2023, 2.5, 3.5, EspeceSerpent.BOA);
        ListeCarnivore.add(serpent2);
    
        for (IHerbivore h : ListeHerbivore) {
            System.out.println(h);
            System.out.println(h.getNom() + " mange " + h.plantePreferee() + " en quantité " + h.qttePlanteJour() + " kg par jour");
        }

        for (ICarnivore c : ListeCarnivore) {
            System.out.println(c);
            System.out.println(c.getNom() + " mange " + c.proiePreferees() + " en quantité " + c.qtteViandeSemaine() + "kg par semaine." + " " + c.tue());
        }

    }

}

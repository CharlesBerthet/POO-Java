import java.util.ArrayList;
import java.util.Scanner; 

public class Zoo {

    Scanner sc = new Scanner(System.in);

    public String afficherAnimaux(ArrayList<Animal> animaux) {
        StringBuilder resultat = new StringBuilder();

        System.out.println("-----------");
        System.out.println("LES HABITANTS DU ZOO");
        System.out.println("-----------");

        for (Animal a : animaux) {
            if (a instanceof IHerbivore) {      
                resultat.append(a.toString())
                    .append("\n")
                    .append(a.getNom()) .append(" mange ") .append(((IHerbivore) a).plantePreferee())
                    .append(" en quantité ") .append(((IHerbivore) a).qttePlanteJour() + " kg par jour")
                    .append("\n ----------- \n");
            } 
            else if (a instanceof ICarnivore) {

                resultat.append(a.toString())
                    .append("\n")
                    .append(a.getNom()) .append(" mange ") .append(((ICarnivore) a).proiePreferees())
                    .append(" en quantité ") .append(((ICarnivore) a).qtteViandeSemaine()) .append(" kg par semaine ")
                    .append(((ICarnivore) a).tue())
                    .append("\n ----------- \n");
            }
            else if (a instanceof IOmnivore) {
                resultat.append(a.toString())
                    .append("\n")
                    .append(a.getNom()) .append(" mange ") .append(((ICarnivore) a).proiePreferees())
                    .append(" en quantité ") .append(((ICarnivore) a).qtteViandeSemaine()) .append(" kg par semaine ")
                    .append(((ICarnivore) a).tue())
                    .append(" Son régime contient aussi ") .append(((IOmnivore) a).plantePreferee())
                    .append("en quantité ") .append(((IOmnivore) a).qttePlanteJour()) .append("kg par jour")
                    .append("\n ----------- \n");
            }
            else {
                resultat.append("Animal introuvable");
            }
        }
        return resultat.toString();
    }

    public String faitCrierSesAnimaux(ArrayList<Animal> animaux){
        StringBuilder resultat = new StringBuilder();

        System.out.println("-----------");
        System.out.println("CRIS");
        System.out.println("-----------");

        for (Animal a : animaux) {
            resultat.append(a.cri())
                .append("\n");
        }
        return resultat.toString();
    }

    public String rechercherAnimal(ArrayList<Animal> animaux){
        StringBuilder resultat = new StringBuilder();

        System.out.println("-----------");
        System.out.println("REPAS");
        System.out.println("-----------");
        System.out.println("Quels animal ?");
        String recherche = sc.next();

        resultat.append("Le repas de ");
        
        for (Animal a : animaux) {
            if (a.getNom().equalsIgnoreCase(recherche) && a instanceof ICarnivore) {
                resultat.append(a.getNom())
                    .append(" est ")
                    .append(((ICarnivore) a).proiePreferees());
            }
            else if (a.getNom().equalsIgnoreCase(recherche) && a instanceof IHerbivore) {
                resultat.append(a.getNom())
                    .append(" est ")
                    .append(((IHerbivore) a).plantePreferee());
            }
        }   

        
        return resultat.toString();
    }
}

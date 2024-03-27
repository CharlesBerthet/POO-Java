import java.util.ArrayList;

public class Zoo {

    public String afficherAnimaux(ArrayList<Animal> animaux) {
        StringBuilder resultat = new StringBuilder();

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

        for (Animal a : animaux) {
            resultat.append(a.cri())
                .append("\n");
        }
        return resultat.toString();
    }

    public String rechercherAnimal(ArrayList<Animal> animaux, String nom){
        StringBuilder resultat = new StringBuilder();
        
        boolean trouve = false;

        for (Animal a : animaux) {
            if (a.getNom().equalsIgnoreCase(nom) && a instanceof ICarnivore) {
                resultat.append("Le repas de ")
                    .append(a.getNom())
                    .append(" est ")
                    .append(((ICarnivore) a).proiePreferees());
                    trouve = true;
            }
            else if (a.getNom().equalsIgnoreCase(nom) && a instanceof IHerbivore) {
                resultat.append("Le repas de ")
                    .append(a.getNom())
                    .append(" est ")
                    .append(((IHerbivore) a).plantePreferee());
                    trouve = true;
            }
            else if (a.getNom().equalsIgnoreCase(nom) && a instanceof IOmnivore) {
                resultat.append("Le repas de ")
                    .append(a.getNom())
                    .append(" est ")
                    .append(((IOmnivore) a).plantePreferee())
                    .append(" et ")
                    .append(((IOmnivore) a).proiePreferees());
                    trouve = true;
            }
        }
        if (!trouve) {
            resultat.append("Cet animal n'existe pas");
        }   

        return resultat.toString();
    }


}

package fr.cpe.zoo.base;
import fr.cpe.zoo.exercice1.*;

import java.util.ArrayList;
import java.util.Collections;

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

    public boolean supprimerAnimal(ArrayList<Animal> animaux, String nom) {
        boolean trouve = false;
        int index = -1;

        for(Animal a : animaux){
            index++;
            if  (a.getNom().equalsIgnoreCase(nom)) {
                animaux.remove(index);
                System.out.println(afficherAnimaux(animaux));
                trouve = true;
            }
        }

        if (!trouve) {
            System.out.println(nom + " n'existe pas");
        }
       
        return trouve;
    }

    public String tueriCarnivore(ArrayList<Animal> animaux) {
        StringBuilder resultat = new StringBuilder();

        resultat.append("Les carnivores du zoo tuent :\n");

        for(Animal a : animaux){
            if (a instanceof ICarnivore) {
                resultat.append(a.getNom())
                    .append(" : ")
                    .append(((ICarnivore) a).proiePreferees())
                    .append("\n");
            }
        }

        return resultat.toString();
    }

    public void trierAnimauxParDateNaissance(ArrayList<Animal> animaux, String info){

        if (info.equalsIgnoreCase("C")) {
            Collections.sort(animaux, (a1, a2) -> Integer.valueOf(a2.getAnneeNaissance()).compareTo(a1.getAnneeNaissance()));
            System.out.println(afficherAnimaux(animaux));
        }
        else if (info.equalsIgnoreCase("D")) {
            Collections.sort(animaux, (a1, a2) -> Integer.valueOf(a1.getAnneeNaissance()).compareTo(a2.getAnneeNaissance()));
            System.out.println(afficherAnimaux(animaux));
        }
        else {
            System.out.println("Erreur");
        }
        

        
    }

    public void trierAnimauxParTaille(ArrayList<Animal> animaux, String info){

        if (info.equalsIgnoreCase("C")) {
            Collections.sort(animaux, (a1, a2) -> Double.valueOf(a1.getTaille()).compareTo(a2.getTaille()));
            System.out.println(afficherAnimaux(animaux));
        }
        else if (info.equalsIgnoreCase("D")) {
            Collections.sort(animaux, (a1, a2) -> Double.valueOf(a2.getTaille()).compareTo(a1.getTaille()));
            System.out.println(afficherAnimaux(animaux));
        }
        else {
            System.out.println("Erreur");
        }

    }

    public void trierAnimauxParPoids(ArrayList<Animal> animaux, String info) {
        if (info.equalsIgnoreCase("C")) {
            Collections.sort(animaux, (a1, a2) -> Double.valueOf(a1.getPoids()).compareTo(a2.getPoids()));
            System.out.println(afficherAnimaux(animaux));
        }
        else if (info.equalsIgnoreCase("D")) {
            Collections.sort(animaux, (a1, a2) -> Double.valueOf(a1.getPoids()).compareTo(a2.getPoids()));
            System.out.println(afficherAnimaux(animaux));
        }
        else {
            System.out.println("Erreur");
        }
    }
}

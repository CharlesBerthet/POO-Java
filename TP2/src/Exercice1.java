// Manipulation de tableaux et de chaines de caractères

import java.util.Arrays;

public class Exercice1 {
    // Création du tableau avec les adresses mails
    public static String[] emails = {"charles@cpe.fr","daniel@free.fr","ellie@gmail.com","hiro@cpe.fr","john@univ2.org","bob@free.fr","lennon@cpe.fr","sweat@gmail.com","john@cpe.fr","Ana@free.fr"};

    public static void main(String[] args) throws Exception {
        // Affichage du tableau
        System.out.println("Affichage brute des adresses mails :");
        for (String email : emails) {
            System.out.println(email);
        }

        // Liste des fournisseurs
        String[] fournisseurs = new String[10];
        int i = 0;
        for (String email : emails) {
            String[] parts = email.split("@");
            fournisseurs[i] = parts[1];
            i++;
        }

        // Affichage des fournisseurs
        System.out.println("\nAffichage brute des fournisseurs :");
        System.out.println(Arrays.toString(fournisseurs));

        // Tri des fournisseurs
        Arrays.sort(fournisseurs);

        // Affichage des fournisseurs triés
        System.out.println("\nAffichage des fournisseurs triés :");
        System.out.println(Arrays.toString(fournisseurs));

        // Distinction des fournisseurs
        String[] fournisseursDistincts = new String[4];
        int j = 0;
        for (String fournisseur : fournisseurs) {
            if (j == 0 || !fournisseursDistincts[j-1].equals(fournisseur)) {
                fournisseursDistincts[j] = fournisseur;
                j++;
            }
        }

        // Affichage des fournisseurs distincts
        System.out.println("\nAffichage des fournisseurs distincts :");
        System.out.println(Arrays.toString(fournisseursDistincts));

        // Nombre de clients
        int[] nbClients = new int[4];
        for (String fournisseur : fournisseurs) {
            if (fournisseur.equals(fournisseursDistincts[0])) {
                nbClients[0]++;
            } else if (fournisseur.equals(fournisseursDistincts[1])) {
                nbClients[1]++;
            } else if (fournisseur.equals(fournisseursDistincts[2])) {
                nbClients[2]++;
            } else if (fournisseur.equals(fournisseursDistincts[3])) {
                nbClients[3]++;
            }
        }

        // Affichage du nombre de clients
        System.out.println("\nAffichage du nombre de clients par fournisseur :");
        System.out.println(Arrays.toString(nbClients));

        // Affichage part de marché
        System.out.println("\nParts de marché :");
        for (int k = 0; k < fournisseursDistincts.length; k++) {
            System.out.println(String.format("=> %s\t: %d clients sur %d (%d)", fournisseursDistincts[k], nbClients[k], emails.length, (nbClients[k] * 100 / emails.length)));
        }
    }
}

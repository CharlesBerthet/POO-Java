import fr.cpe.CPE;
import fr.cpe.Exeptions;
import fr.cpe.enseignant.*;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int menu;
        String info;

        CPE cpe = new CPE();

        ArrayList<Enseignant> ListeEnseignant = new ArrayList<>();


        ListeEnseignant.add(new EnseignantPermanent("DUPONT", "Jean", SpecialitesEnseignement.Informatique, 300));
        ListeEnseignant.add(new Vacataire("DURAND", "Pierre", SpecialitesEnseignement.Chimie, 20));
        ListeEnseignant.add(new Doctorant("DUPUIS", "Marie", SpecialitesEnseignement.Electronique, 120));
        ListeEnseignant.add(new Vacataire("PATRICK", "Daniel", SpecialitesEnseignement.Chimie, 20));


        try {
            do {
                System.out.println("\r\n-----------");
                System.out.println("MENU CPE");
                System.out.println("-----------");
                System.out.println("0. Quitter");
                System.out.println("1. Afficher tous les enseignants");
                System.out.println("2. Afficher les enseignants permanents");
                System.out.println("3. Afficher les vacataires");
                System.out.println("4. Afficher les doctorants");
                System.out.println("5. Afficher le coût par type d'enseignant");
                System.out.println("6. Afficher le coût par spécialité");
                System.out.println("7. Afficher le coût total des enseignants");

                menu = sc.nextInt();

                switch(menu) {
                    case 0:
                        System.out.println("Au revoir !");
                        break;

                    case 1:
                        System.out.println("===========");
                        System.out.println("LES ENSEIGNANTS");
                        System.out.println("===========");
                        System.out.println(cpe.afficherEnseignant(ListeEnseignant));
                        break;

                    case 2:
                        System.out.println("===========");
                        System.out.println("ENSEIGNANTS PERMANENTS");
                        System.out.println("===========");
                        System.out.println(cpe.afficherEnseignantPermanent(ListeEnseignant));
                        break;

                    case 3:
                        System.out.println("===========");
                        System.out.println("VACATAIRES");
                        System.out.println("===========");
                        System.out.println(cpe.afficherVacataire(ListeEnseignant));
                        break;

                    case 4:
                        System.out.println("===========");
                        System.out.println("DOCTORANTS");
                        System.out.println("===========");
                        System.out.println(cpe.afficherDoctorant(ListeEnseignant));
                        break;

                    case 5:
                        try {
                            System.out.println("1. Enseignant permanent");
                            System.out.println("2. Vacataire");
                            System.out.println("3. Doctorant");

                            info = sc.next();

                            switch(info) {
                                case "1":
                                    System.out.println("===========");
                                    System.out.println("Cout total enseignants permanents");
                                    System.out.println("===========");
                                    System.out.println("Total de :" + cpe.coutTotalTypeEnseignant(ListeEnseignant, "EnseignantPermanent"));
                                    break;
                                case "2":
                                    System.out.println("===========");
                                    System.out.println("Cout total vacataires");
                                    System.out.println("===========");
                                    System.out.println("Total de :" + cpe.coutTotalTypeEnseignant(ListeEnseignant, "Vacataire"));
                                    break;
                                case "3":
                                    System.out.println("===========");
                                    System.out.println("Cout total doctorants");
                                    System.out.println("===========");
                                    System.out.println("Total de :" + cpe.coutTotalTypeEnseignant(ListeEnseignant, "Doctorant"));
                                    break;
                            }
                        } catch (Exception e) {
                            System.out.println("Erreur");
                        }
                        break;

                    case 6:
                        try {
                            System.out.println("1. Informatique");
                            System.out.println("2. Chimie");
                            System.out.println("3. Electronique");

                            info = sc.next();

                            switch(info) {
                                case "1":
                                    System.out.println("===========");
                                    System.out.println("Cout total informatique");
                                    System.out.println("===========");
                                    System.out.println("Total de :" + cpe.coutTotalSpecialite(ListeEnseignant, String.valueOf(SpecialitesEnseignement.Informatique)));
                                    break;
                                case "2":
                                    System.out.println("===========");
                                    System.out.println("Cout total Chimie");
                                    System.out.println("===========");
                                    System.out.println("Total de :" + cpe.coutTotalSpecialite(ListeEnseignant, String.valueOf(SpecialitesEnseignement.Chimie)));
                                    break;
                                case "3":
                                    System.out.println("===========");
                                    System.out.println("Cout total Electronique");
                                    System.out.println("===========");
                                    System.out.println("Total de :" + cpe.coutTotalSpecialite(ListeEnseignant, String.valueOf(SpecialitesEnseignement.Electronique)));
                                    break;
                            }
                        } catch (Exception e) {
                            System.out.println("Erreur");
                        }
                        break;

                    case 7:
                        System.out.println("===========");
                        System.out.println("Cout total enseignants");
                        System.out.println("===========");
                        System.out.println("Total de :" + cpe.coutTotal(ListeEnseignant));
                }

            } while (menu != 0);
        } catch (Exception e) {
            throw new Exeptions("Erreur de saisie",e);
        } finally {
            sc.close();
        }
    }
}

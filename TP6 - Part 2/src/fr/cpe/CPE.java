package fr.cpe;

import fr.cpe.enseignant.Doctorant;
import fr.cpe.enseignant.Enseignant;
import fr.cpe.enseignant.EnseignantPermanent;
import fr.cpe.enseignant.Vacataire;

import java.util.ArrayList;

public class CPE {

        public String afficherEnseignant(ArrayList<Enseignant> enseignants) {
            StringBuilder result = new StringBuilder();

            for (Enseignant enseignant : enseignants) {
                if (enseignant instanceof EnseignantPermanent) {
                    result.append(enseignant.toString());
                }
                else if (enseignant instanceof Vacataire) {
                    result.append(enseignant.toString());
                }
                else if (enseignant instanceof Doctorant) {
                    result.append(enseignant.toString());
                }
                else {
                    result.append("Erreur");
                }
            }
            return result.toString();
        }

        public String afficherEnseignantPermanent(ArrayList<Enseignant> enseignants) {
            StringBuilder result = new StringBuilder();

            for (Enseignant enseignant : enseignants) {
                if (enseignant instanceof EnseignantPermanent) {
                    result.append(enseignant.toString());
                }
            }
            return result.toString();
        }

        public String afficherVacataire(ArrayList<Enseignant> enseignants) {
            StringBuilder result = new StringBuilder();

            for (Enseignant enseignant : enseignants) {
                if (enseignant instanceof Vacataire) {
                    result.append(enseignant.toString());
                }
            }
            return result.toString();
        }

        public String afficherDoctorant(ArrayList<Enseignant> enseignants) {
            StringBuilder result = new StringBuilder();

            for (Enseignant enseignant : enseignants) {
                if (enseignant instanceof Doctorant) {
                    result.append(enseignant.toString());
                }
            }
            return result.toString();
        }

        public double coutTotal(ArrayList<Enseignant> enseignants) {
            double total = 0;
            for (Enseignant enseignant : enseignants) {
                if (enseignant instanceof EnseignantPermanent) {
                    total += ((EnseignantPermanent) enseignant).getTotal();
                }
                else if (enseignant instanceof Vacataire) {
                    total += ((Vacataire) enseignant).getTotal();
                }
                else if (enseignant instanceof Doctorant) {
                    total += ((Doctorant) enseignant).getTotal();
                }
            }
            return total;
        }

        public double coutTotalSpecialite(ArrayList<Enseignant> enseignants, String specialite) {
            double total = 0;
            for (Enseignant enseignant : enseignants) {
                if (enseignant.getSpecialite().toString().equals(specialite)) {
                    if (enseignant instanceof EnseignantPermanent) {
                        total += ((EnseignantPermanent) enseignant).getTotal();
                    }
                    else if (enseignant instanceof Vacataire) {
                        total += ((Vacataire) enseignant).getTotal();
                    }
                    else if (enseignant instanceof Doctorant) {
                        total += ((Doctorant) enseignant).getTotal();
                    }
                }
            }
            return total;
        }

        public double coutTotalTypeEnseignant(ArrayList<Enseignant> enseignants, String type) {
            double total = 0;
            for (Enseignant enseignant : enseignants) {
                if (enseignant.getClass().getSimpleName().equals(type)) {
                    if (enseignant instanceof EnseignantPermanent) {
                        total += ((EnseignantPermanent) enseignant).getTotal();
                    }
                    else if (enseignant instanceof Vacataire) {
                        total += ((Vacataire) enseignant).getTotal();
                    }
                    else if (enseignant instanceof Doctorant) {
                        total += ((Doctorant) enseignant).getTotal();
                    }
                }
            }
            return total;
        }
}

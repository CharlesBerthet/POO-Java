public class Girafe extends Animal{

        public static final int AGE_ADULTE = 4;
        public static final String TYPE = "Girafe";
    
    
        Girafe(){
    
        }
    
        Girafe(String nom, int anneeNaissance, double poids, double taille, SexeAnimal sexeAnimal){
            super(nom, anneeNaissance, poids, taille, sexeAnimal);
        }
    
        @Override
        public String cri() {
            if (estAdulte() == true) {
                return "MUUUUUU";
            } else {
                return "muuuuuu";
            }
        }
    
        @Override
        public boolean estAdulte(){
            if (getAge() > AGE_ADULTE) {
                return true;
            } else {
                return false;
            }
        }
    
        @Override
        public String toString()
        {
            return 
            super.toString() +
            "\nType : " + TYPE;
        }
    }    

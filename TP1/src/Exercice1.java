// Partie 1

// public class Exercice1 {
//     public static void main(String[] args) throws Exception {
//         int nb1 = 100;
//         int nb2 = 200;
//         int somme;
//         somme = nb1 + nb2;
//         System.out.println(String.format("Resultat de l'addition : %d", somme));
//     }
// }


// Partie 2

public class Exercice1 {
    public static void main(String[] args) throws Exception {
        System.out.println(String.format("Resultat de l'addition : %d", addition(100,200)));
    }

    public static int addition(int nb1, int nb2) {
        return nb1 + nb2;
    }
}
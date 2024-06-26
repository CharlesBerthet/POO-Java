import java.time.Duration;
import java.time.LocalDate;

public class ProgPrincipal {
    public static void main(String[] args) throws Exception
    {
        Article article1 = new Article("TINTIN01", "Tintin au Congo", 13.5);
        
        article1.affichage();
        System.out.println(article1.toString());

        Article article2 = new Article("TINTIN02", "Le Crabe aux pinces d'or", 15.5);

        article2.affichage();
        System.out.println(article2.toString());
    
        Livre livre1 = new Livre("TINTIN03", "Tintin au pays des soviets", 8.5, 78954612, 86, "Georges", "Hergé", LocalDate.of(1987, 06, 18));

        livre1.affichageLivre();
        System.out.println(livre1.toString());

        Dvd dvd1 = new Dvd("DVD01", "La soupe aux choux", 19.5, Duration.ofMinutes(98), "Jean", "Girault", LocalDate.of(1974, 11, 15));

        dvd1.affichageDvd();
        System.out.println(dvd1.toString());

        System.out.println("Nombre total d'articles en vente :" + Article.getNumero());

        Livre livre2 = new Livre("TINTIN03", "Tintin au pays des soviets", 8.5, 78954612, 86, "Georges", "jack", LocalDate.of(1987, 06, 18));

        livre1.equals(livre2);
    }
}

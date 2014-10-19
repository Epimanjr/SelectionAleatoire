package selection;

import java.util.Scanner;

/**
 *
 * @author Maxime BLAISE
 */
public class Lancement {

    /**
     * Méthode principale
     *
     * @param args les arguments
     */
    public static void main(String[] args) {
        // Pour la saisie au clavier
        Scanner sc = new Scanner(System.in);

        // Boucle infinie
        while (true) {
            // Génération
            House h = new House();
            h.generer();

            // Affichage du résultat
            System.out.println("Saison " + h.getSaison() + " Episode " + h.getEpisode());

            // Recommencer ?
            String s = sc.nextLine();
            if (s.equals("exit")) {
                System.exit(1);
            }
        }

    }
}

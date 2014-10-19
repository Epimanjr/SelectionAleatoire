package selection;

/**
 *
 * @author Maxime BLAISE
 */
public class House {
    
    /**
     * Numéro de la saison.
     */
    private int saison;
    
    /**
     * Numéro de l'épisode
     */
    private int episode;
    
    /**
     * Génération aléatoire des deux variables.
     */
    public void generer() {
        this.saison = (int) (Math.random() * 7) + 1;
        this.episode = (int) (Math.random() * 21) + 1;
    }

    /**
     * Permet de récupérer le numéro de la saison.
     * 
     * @return numéro de la saison
     */
    public int getSaison() {
        return saison;
    }

    /**
     * Permet de récupérer le numéro de l'épisode.
     * 
     * @return numéro de l'épisode
     */
    public int getEpisode() {
        return episode;
    }
    
}

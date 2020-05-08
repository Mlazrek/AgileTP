package testRunners;


/**
 * Décrivez votre classe Livraison ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Livraison
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    public int prixUnitaire;
    public int quantiteLivraison;
    public int quantiteStock;
    public Stock rayonBiscuit;

    /**
     * Constructeur d'objets de classe Livraison
     */
    public Livraison()
    {
        // initialisation de la variable d'instance prixUnitaire
        prixUnitaire = 3;
    }

    /**
     * @param  quantiteLivraison   le paramètre de la méthode montantLivraison
     * @return     le produit de prix unitaire et la quantité à livrer
     */
    public int montantLivraison(int quantiteLivraison)
    {
        return this.prixUnitaire * quantiteLivraison;
    }
}

package testRunners;

import .*;

/**
 * Décrivez votre classe Stock ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
    public class Stock{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    public boolean disponible;
    public boolean Substituable;
    public int quantite;
    public Product product1;
    public Product product2;

    /**
     * Constructeur d'objets de classe Stock
     */
    public Stock()
    {
        // initialisation des variables d'instance
    }
    
 

    public int getQuantite() {
        return quantite ;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    
         
    /**
     * un exemple methode alimentation de Stock
     *
     * @param  quantite dup Stock   le paramètre de la méthode
     * @return     quantite disponible dans le Stock
     */
    
      
       
    public int alimenterStock(int quantite)
    {
        // Insérez votre code ici
        this.quantite += quantite;
        if (this.quantite>0){ 
            this.disponible = true;
        }
        
        return quantite;
    }}


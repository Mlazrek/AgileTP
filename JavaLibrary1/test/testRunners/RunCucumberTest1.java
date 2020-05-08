package testRunners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features ="test/Features", 
        glue ="",
        tags= "@Substitution,@Alimentation,@DeliveryPrice"
)

public class RunCucumberTest1 {
    
    public void testSetCategory(){
        String categ = "Cat3";
        String oldCat ;
        Product p = new Product("prod1","Cat1", 10);
        oldCat= p.getCategory();
        p.setCategory(categ);
        assertEquals("produit non substituable", oldCat, p.getCategory(),0);
        
    }
    
    public void testSetQualtity(){
        int CurrentQuant;
        int NewQuant ;
        Stock rayonBiscuit = new Stock();
        rayonBiscuit.setQuantite(10);
        CurrentQuant= rayonBiscuit.getQuantite();
        rayonBiscuit.alimenterStock(5);
        NewQuant= rayonBiscuit.getQuantite();
        assertEquals("Stock est alimenté",CurrentQuant,NewQuant,0);
        
    }
    
    public void testStockDeliveryPrice(){
       System.out.println("montantLivraison");
        int StockDeliveryQuantity = 10;
        Livraison instance = new Livraison();
        int expResult = 30;
        int result = instance.montantLivraison(StockDeliveryQuantity);
        assertEquals("Stock est alimenté",expResult, result,0);
        
    }
    
    
    
    
    }
    
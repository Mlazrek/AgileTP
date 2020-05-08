/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class StockAlimentationTest {
    
    public StockAlimentationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getQuantite method, of class Stock.
     */
    @Test
    public void testGetQuantite() {
        Stock instance = new Stock();
        int expResult = 0;
        int result = instance.getQuantite();
        assertEquals(expResult, result);

    }

    /**
     * Test of setQuantite method, of class Stock.
     */
    @Test
    public void testSetQuantite() {
        int quantite = 50;
        Stock instance = new Stock(); 
        instance.setQuantite(quantite);
        int result;
        result = instance.getQuantite();
        System.out.println("quantité des produits dans le stock est:"+ result);
    }

    /**
     * Test of alimenterStock method, of class Stock.
     */
    @Test
    public void testAlimenterStock() {
        int quantite = 30;
        Stock instance = new Stock();
        int expResult = 30;
        int result = instance.alimenterStock(quantite);
        assertEquals(expResult, result);
       
        System.out.println("la quantité alimentée dans le stock est: "+result};
        
    }
    
}

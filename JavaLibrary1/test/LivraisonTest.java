/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import testRunners.Livraison;
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
public class LivraisonTest {
    
    public LivraisonTest() {
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
     * Test of montantLivraison method, of class Livraison.
     */
    @Test
    public void testMontantLivraison() {
        System.out.println("montantLivraison");
        int quantiteLivraison = 10;
        Livraison instance = new Livraison();
        int expResult = 30;
        int result = instance.montantLivraison(quantiteLivraison);
        assertEquals(expResult, result);
        System.out.println("le montant de livraison est :"+ result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

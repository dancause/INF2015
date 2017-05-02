/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team8.inf2015_t08maven;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author janindancause
 */
public class AgricoleTest {
    
    public AgricoleTest() {
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
     * Test of getValeurService method, of class Agricole.
     */
    @Test
    public void testGetValeurService() {
        System.out.println("getValeurService");
        Agricole instance = new Agricole();
        double expResult = 0.0;
        double result = instance.getValeurService();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getValeurDroitPassage method, of class Agricole.
     */
    @Test
    public void testGetValeurDroitPassage() {
        System.out.println("getValeurDroitPassage");
        Agricole instance = new Agricole();
        double expResult = 500.0;
        double result = instance.getValeurDroitPassage();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of getValeurLot method, of class Agricole.
     */
    @Test
    public void testGetValeurLot() {
        System.out.println("getValeurLot");
        Agricole instance = new Agricole();
        double expResult = 0.0;
        double result = instance.getValeurLot();
        assertEquals(expResult, result, 0.0);
  
    }
    
}

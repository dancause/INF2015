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
public class ResidentielTest {
    
    public ResidentielTest() {
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
     * Test of getValeurService method, of class Residentiel.
     */
    @Test
    public void testGetValeurService() {
        System.out.println("getValeurService");
        Residentiel instance = new Residentiel();
        double expResult = 0.0;
        double result = instance.getValeurService();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of getValeurLot method, of class Residentiel.
     */
    @Test
    public void testGetValeurLot() {
        System.out.println("getValeurLot");
        Residentiel instance = new Residentiel();
        double expResult = 0.0;
        double result = instance.getValeurLot();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getValeurDroitPassage method, of class Residentiel.
     */
    @Test
    public void testGetValeurDroitPassage() {
        System.out.println("getValeurDroitPassage");
        Residentiel instance = new Residentiel();
        double expResult = 500.0;
        double result = instance.getValeurDroitPassage();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of validSupercifieEntreLimite method, of class Residentiel.
     */
    @Test
    public void testValidSupercifieEntreLimite() {
        System.out.println("validSupercifieEntreLimite");
        Residentiel instance = new Residentiel();
        boolean expResult = false;
        boolean result = instance.validSupercifieEntreLimite();
        assertEquals(expResult, result);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team8.inf2015_t08maven;

import net.sf.json.JSONArray;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Celine
 */
public class LotissementTest {
    
    public LotissementTest() {
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
     * Test of calculerValeurLotsTotale method, of class Lotissement.
     */
    @Test
    public void testCalculerValeurLotsTotale() throws Exception {
        System.out.println("calculerValeurLotsTotale");
        Terrain terrain = null;
        JSONArray lot_json = null;
        Lotissement[] tab_lots = null;
        double expResult = 0.0;
        double result = Lotissement.calculerValeurLotsTotale(terrain, lot_json, tab_lots);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enleverSigneDollar method, of class Lotissement.
     */
    @Test
    public void testEnleverSigneDollar() {
        System.out.println("enleverSigneDollar");
        String nombre = "";
        double expResult = 0.0;
        double result = Lotissement.enleverSigneDollar(nombre);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifierStringPointVirgule method, of class Lotissement.
     */
    @Test
    public void testVerifierStringPointVirgule() {
        System.out.println("verifierStringPointVirgule");
        String nombre = "";
        String expResult = "";
        String result = Lotissement.verifierStringPointVirgule(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of creerTypeTerrain method, of class Lotissement.
     */
    @Test
    public void testCreerTypeTerrain() {
        System.out.println("creerTypeTerrain");
        int x = 0;
        TypeTerrain expResult = null;
        TypeTerrain result = Lotissement.creerTypeTerrain(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

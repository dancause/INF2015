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
 * @author Celine
 */
public class TerrainTest {
    
    public TerrainTest() {
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
     * Test of calculerValeurFonciere method, of class Terrain.
     */
    @Test
    public void testCalculerValeurFonciere() {
        System.out.println("calculerValeurFonciere");
        double valeur_fonciere_lots = 0.0;
        double expResult = 0.0;
        double result = Terrain.calculerValeurFonciere(valeur_fonciere_lots);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculerTaxeScolaire method, of class Terrain.
     */
    @Test
    public void testCalculerTaxeScolaire() {
        System.out.println("calculerTaxeScolaire");
        double valeur_fonciere_totale = 0.0;
        double expResult = 0.0;
        double result = Terrain.calculerTaxeScolaire(valeur_fonciere_totale);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculerTaxeMunicipale method, of class Terrain.
     */
    @Test
    public void testCalculerTaxeMunicipale() {
        System.out.println("calculerTaxeMunicipale");
        double valeur_fonciere_totale = 0.0;
        double expResult = 0.0;
        double result = Terrain.calculerTaxeMunicipale(valeur_fonciere_totale);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of arrondirMontant method, of class Terrain.
     */
    @Test
    public void testArrondirMontant() {
        System.out.println("arrondirMontant");
        double arrondir = 0.0;
        double expResult = 0.0;
        double result = Terrain.arrondirMontant(arrondir);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

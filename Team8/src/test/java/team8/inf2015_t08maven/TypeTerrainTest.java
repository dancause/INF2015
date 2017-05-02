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
public class TypeTerrainTest {
    
    public TypeTerrainTest() {
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
     * Test of setTerrain method, of class TypeTerrain.
     */
    @Test
    public void testSetTerrain() throws Exception {
        System.out.println("setTerrain");
        int type_terrain = 0;
        int superficie = 0;
        int nombre_services = 0;
        double prix_min = 0.0;
        double prix_max = 0.0;
        int nombre_droits_passage = 0;
        String date_mesure = "2015-12-01";
        TypeTerrain instance = new TypeTerrain();
        instance.setTerrain(type_terrain, superficie, nombre_services, prix_min, prix_max, nombre_droits_passage, date_mesure);
        
    }

    /**
     * Test of setPrixMax method, of class TypeTerrain.
     */
    @Test
    public void testSetPrixMax() throws Exception {
        System.out.println("setPrixMax");
        double prix_max = 0.0;
        TypeTerrain instance = new TypeTerrain();
        instance.setPrixMax(prix_max);
        
    }

    /**
     * Test of setPrixMin method, of class TypeTerrain.
     */
    @Test
    public void testSetPrixMin() throws Exception {
        System.out.println("setPrixMin");
        double prix_min = 0.0;
        TypeTerrain instance = new TypeTerrain();
        instance.setPrixMin(prix_min);
        
    }

    /**
     * Test of setSuperficie method, of class TypeTerrain.
     */
    @Test
    public void testSetSuperficie() throws Exception {
        System.out.println("setSuperficie");
        int superficie = 0;
        TypeTerrain instance = new TypeTerrain();
        instance.setSuperficie(superficie);
        
    }

    /**
     * Test of setTypeDeTerrain method, of class TypeTerrain.
     */
    @Test
    public void testSetTypeDeTerrain() throws Exception {
        System.out.println("setTypeDeTerrain");
        int type_terrain = 0;
        TypeTerrain instance = new TypeTerrain();
        instance.setTypeDeTerrain(type_terrain);
        
    }

    /**
     * Test of setNombreServices method, of class TypeTerrain.
     */
    @Test
    public void testSetNombreServices() throws Exception {
        System.out.println("setNombreServices");
        int nombre_services = 0;
        TypeTerrain instance = new TypeTerrain();
        instance.setNombreServices(nombre_services);
        
    }

    /**
     * Test of setNombreDroitsPassage method, of class TypeTerrain.
     */
    @Test
    public void testSetNombreDroitsPassage() throws Exception {
        System.out.println("setNombreDroitsPassage");
        int nombre_droits_passage = 0;
        TypeTerrain instance = new TypeTerrain();
        instance.setNombreDroitsPassage(nombre_droits_passage);
        
    }

    /**
     * Test of setDateMesure method, of class TypeTerrain.
     */
    @Test
    public void testSetDateMesure() throws Exception {
        System.out.println("setDateMesure");
        String date_mesure = "2015-12-01";
        TypeTerrain instance = new TypeTerrain();
        instance.setDateMesure(date_mesure);
       
    }

    /**
     * Test of getTypeTerrain method, of class TypeTerrain.
     */
    @Test
    public void testGetTypeTerrain() {
        System.out.println("getTypeTerrain");
        TypeTerrain instance = new TypeTerrain();
        int expResult = 0;
        int result = instance.getTypeTerrain();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getSuperficie method, of class TypeTerrain.
     */
    @Test
    public void testGetSuperficie() {
        System.out.println("getSuperficie");
        TypeTerrain instance = new TypeTerrain();
        int expResult = 0;
        int result = instance.getSuperficie();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getNombreServices method, of class TypeTerrain.
     */
    @Test
    public void testGetNombreServices() {
        System.out.println("getNombreServices");
        TypeTerrain instance = new TypeTerrain();
        int expResult = 0;
        int result = instance.getNombreServices();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getPrixMin method, of class TypeTerrain.
     */
    @Test
    public void testGetPrixMin() {
        System.out.println("getPrixMin");
        TypeTerrain instance = new TypeTerrain();
        double expResult = 0.0;
        double result = instance.getPrixMin();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getPrixMax method, of class TypeTerrain.
     */
    @Test
    public void testGetPrixMax() {
        System.out.println("getPrixMax");
        TypeTerrain instance = new TypeTerrain();
        double expResult = 0.0;
        double result = instance.getPrixMax();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getNombreDroitsPassage method, of class TypeTerrain.
     */
    @Test
    public void testGetNombreDroitsPassage() {
        System.out.println("getNombreDroitsPassage");
        TypeTerrain instance = new TypeTerrain();
        int expResult = 0;
        int result = instance.getNombreDroitsPassage();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getValeurService method, of class TypeTerrain.
     */
    @Test
    public void testGetValeurService() {
        System.out.println("getValeurService");
        TypeTerrain instance = new TypeTerrain();
        double expResult = 0.0;
        double result = instance.getValeurService();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getValeurLot method, of class TypeTerrain.
     */
    @Test
    public void testGetValeurLot() {
        System.out.println("getValeurLot");
        TypeTerrain instance = new TypeTerrain();
        double expResult = 0.0;
        double result = instance.getValeurLot();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getValeurDroitPassage method, of class TypeTerrain.
     */
    @Test
    public void testGetValeurDroitPassage() {
        System.out.println("getValeurDroitPassage");
        TypeTerrain instance = new TypeTerrain();
        double expResult = 0.0;
        double result = instance.getValeurDroitPassage();
        assertEquals(expResult, result, 0.0);
        
    }
    
}

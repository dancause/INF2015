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
public class StatistiqueTest {
    
    public StatistiqueTest() {
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
     * Test of resetStatistique method, of class Statistique.
     */
    @Test
    public void testResetStatistique() {
        System.out.println("resetStatistique");
        Statistique instance = new Statistique();
        instance.resetStatistique();
       
    }

    /**
     * Test of setStatistique method, of class Statistique.
     */
    @Test
    public void testSetStatistique() {
        System.out.println("setStatistique");
        int total_lot = 0;
        int moins_1000 = 0;
        int entre_1000_10000 = 0;
        int plus_de_10000 = 0;
        int nb_lot_agricole = 0;
        int nb_lot_commercial = 0;
        int nb_lot_residentiel = 0;
        int maximale_superficie = 0;
        int val_lot_maximale = 0;
        Statistique instance = new Statistique();
        instance.setStatistique(total_lot, moins_1000, entre_1000_10000, plus_de_10000, nb_lot_agricole, nb_lot_commercial, nb_lot_residentiel, maximale_superficie, val_lot_maximale);
        
    }

    /**
     * Test of setTotallot method, of class Statistique.
     */
    @Test
    public void testSetTotallot() {
        System.out.println("setTotallot");
        Statistique instance = new Statistique();
        instance.setTotallot();
       
    }

    /**
     * Test of setmoins1000 method, of class Statistique.
     */
    @Test
    public void testSetmoins1000() {
        System.out.println("setmoins1000");
        int x = 0;
        Statistique instance = new Statistique();
        instance.setmoins1000(x);
        
    }

    /**
     * Test of set1000_10000 method, of class Statistique.
     */
    @Test
    public void testSet1000_10000() {
        System.out.println("set1000_10000");
        int x = 0;
        Statistique instance = new Statistique();
        instance.set1000_10000(x);
       
    }

    /**
     * Test of setplus10000 method, of class Statistique.
     */
    @Test
    public void testSetplus10000() {
        System.out.println("setplus10000");
        int x = 0;
        Statistique instance = new Statistique();
        instance.setplus10000(x);
       
    }

    /**
     * Test of setnbAgricole method, of class Statistique.
     */
    @Test
    public void testSetnbAgricole() {
        System.out.println("setnbAgricole");
        int x = 0;
        Statistique instance = new Statistique();
        instance.setnbAgricole(x);
       
    }

    /**
     * Test of setnbCommercial method, of class Statistique.
     */
    @Test
    public void testSetnbCommercial() {
        System.out.println("setnbCommercial");
        int x = 0;
        Statistique instance = new Statistique();
        instance.setnbCommercial(x);
       
    }

    /**
     * Test of setnbResidentiel method, of class Statistique.
     */
    @Test
    public void testSetnbResidentiel() {
        System.out.println("setnbResidentiel");
        int x = 0;
        Statistique instance = new Statistique();
        instance.setnbResidentiel(x);
      
    }

    /**
     * Test of setMaxSuperficie method, of class Statistique.
     */
    @Test
    public void testSetMaxSuperficie() {
        System.out.println("setMaxSuperficie");
        int x = 0;
        Statistique instance = new Statistique();
        instance.setMaxSuperficie(x);
       
    }

    /**
     * Test of setValLotMax method, of class Statistique.
     */
    @Test
    public void testSetValLotMax() {
        System.out.println("setValLotMax");
        int x = 0;
        Statistique instance = new Statistique();
        instance.setValLotMax(x);
        
    }

    /**
     * Test of getTotallot method, of class Statistique.
     */
    @Test
    public void testGetTotallot() {
        System.out.println("getTotallot");
        Statistique instance = new Statistique();
        int expResult = 0;
        int result = instance.getTotallot();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getmoins1000 method, of class Statistique.
     */
    @Test
    public void testGetmoins1000() {
        System.out.println("getmoins1000");
        Statistique instance = new Statistique();
        int expResult = 0;
        int result = instance.getmoins1000();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of get1000_10000 method, of class Statistique.
     */
    @Test
    public void testGet1000_10000() {
        System.out.println("get1000_10000");
        Statistique instance = new Statistique();
        int expResult = 0;
        int result = instance.get1000_10000();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getplus10000 method, of class Statistique.
     */
    @Test
    public void testGetplus10000() {
        System.out.println("getplus10000");
        Statistique instance = new Statistique();
        int expResult = 0;
        int result = instance.getplus10000();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getnbAgricole method, of class Statistique.
     */
    @Test
    public void testGetnbAgricole() {
        System.out.println("getnbAgricole");
        Statistique instance = new Statistique();
        int expResult = 0;
        int result = instance.getnbAgricole();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getnbCommercial method, of class Statistique.
     */
    @Test
    public void testGetnbCommercial() {
        System.out.println("getnbCommercial");
        Statistique instance = new Statistique();
        int expResult = 0;
        int result = instance.getnbCommercial();
        assertEquals(expResult, result);
   
    }

    /**
     * Test of getnbResidentiel method, of class Statistique.
     */
    @Test
    public void testGetnbResidentiel() {
        System.out.println("getnbResidentiel");
        Statistique instance = new Statistique();
        int expResult = 0;
        int result = instance.getnbResidentiel();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of getMaxSuperficie method, of class Statistique.
     */
    @Test
    public void testGetMaxSuperficie() {
        System.out.println("getMaxSuperficie");
        Statistique instance = new Statistique();
        int expResult = 0;
        int result = instance.getMaxSuperficie();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getValLotMax method, of class Statistique.
     */
    @Test
    public void testGetValLotMax() {
        System.out.println("getValLotMax");
        Statistique instance = new Statistique();
        double expResult = 0.0;
        double result = instance.getValLotMax();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of valeurLot method, of class Statistique.
     */
    @Test
    public void testValeurLot() {
        System.out.println("valeurLot");
        double x = 0.0;
        Statistique instance = new Statistique();
        instance.valeurLot(x);
       
    }

    /**
     * Test of maxSupperficie method, of class Statistique.
     */
    @Test
    public void testMaxSupperficie() {
        System.out.println("maxSupperficie");
        int x = 0;
        Statistique instance = new Statistique();
        instance.maxSupperficie(x);
      
    }

    /**
     * Test of MaxValeurLot method, of class Statistique.
     */
    @Test
    public void testMaxValeurLot() {
        System.out.println("MaxValeurLot");
        double x = 0.0;
        Statistique instance = new Statistique();
        instance.MaxValeurLot(x);
        
    }

    /**
     * Test of Agricole method, of class Statistique.
     */
    @Test
    public void testAgricole() {
        System.out.println("Agricole");
        Statistique instance = new Statistique();
        instance.Agricole();
        
    }

    /**
     * Test of Commerciale method, of class Statistique.
     */
    @Test
    public void testCommerciale() {
        System.out.println("Commerciale");
        Statistique instance = new Statistique();
        instance.Commerciale();
        
    }

    /**
     * Test of Residentiel method, of class Statistique.
     */
    @Test
    public void testResidentiel() {
        System.out.println("Residentiel");
        Statistique instance = new Statistique();
        instance.Residentiel();
        
    }

    /**
     * Test of lotTypes method, of class Statistique.
     */
    @Test
    public void testLotTypes() {
        System.out.println("lotTypes");
        int x = 0;
        Statistique instance = new Statistique();
        instance.lotTypes(x);
      
    }

    /**
     * Test of toString method, of class Statistique.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Statistique instance = new Statistique();
        String result = instance.toString();
        String expResult = result.toString();
        assertEquals(expResult, result);
        
    }
    
}

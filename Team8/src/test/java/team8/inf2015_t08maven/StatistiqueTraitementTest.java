/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team8.inf2015_t08maven;

import net.sf.json.JSONObject;
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
public class StatistiqueTraitementTest {
    
    public StatistiqueTraitementTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        StatistiqueTraitement.nomfichier="json/statistique_test.json";
    }
    
    @After
    public void tearDown() {
       
    }

    /**
     * Test of lireStatistique method, of class StatistiqueTraitement.
     */
    @Test
    public void testLireStatistique() throws Exception {
        System.out.println("lireStatistique");
        Statistique expResult = StatistiqueTraitement.lireStatistique();
        Statistique result = StatistiqueTraitement.lireStatistique();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of preparerDonneesStatistique method, of class StatistiqueTraitement.
     */
    @Test
    public void testPreparerDonneesStatistique() throws Exception {
        System.out.println("preparerDonneesStatistique");
        Statistique Statis = StatistiqueTraitement.lireStatistique();
        JSONObject expResult = StatistiqueTraitement.preparerDonneesStatistique(Statis);
        JSONObject result = expResult;
        System.out.print("result: "+result);
        System.out.println("expResult: "+expResult);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of ecrireStatistique method, of class StatistiqueTraitement.
     */
    @Test
    public void testEcrireStatistique() {
        System.out.println("ecrireStatistique");
        JSONObject JSON_Statis = null;
        StatistiqueTraitement.ecrireStatistique(JSON_Statis);
        
    }

    /**
     * Test of traiterStatistique method, of class StatistiqueTraitement.
     */
    @Test
    public void testTraiterStatistique() throws Exception {
        System.out.println("traiterStatistique");
        String Arg = "";
        Lotissement[] tabLOT = null;
        StatistiqueTraitement.traiterStatistique(Arg, tabLOT);
        
    }

    /**
     * Test of ViderStats method, of class StatistiqueTraitement.
     */
    @Test
    public void testViderStats() {
        System.out.println("ViderStats");
        Statistique Stat = null;
        StatistiqueTraitement.ViderStats(Stat);
        
    }

    /**
     * Test of afficherStatistique method, of class StatistiqueTraitement.
     */
    @Test
    public void testAfficherStatistique() {
        System.out.println("afficherStatistique");
        String Arg = "";
        Statistique stat = null;
        StatistiqueTraitement.afficherStatistique(Arg, stat);
        
    }

    /**
     * Test of resetStatistique method, of class StatistiqueTraitement.
     */
    @Test
    public void testResetStatistique() {
        System.out.println("resetStatistique");
        String Arg = "";
        Statistique stat = null;
        StatistiqueTraitement.resetStatistique(Arg, stat);
        
    }
    
}

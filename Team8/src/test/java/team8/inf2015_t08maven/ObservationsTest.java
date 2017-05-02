
package team8.inf2015_t08maven;

import java.util.ArrayList;
import net.sf.json.JSONObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ObservationsTest {
    
    public ObservationsTest() {
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

    

    
    @Test
    public void testVerifValeurParLot45k() {
        System.out.println("verifValeurParLot45k");
        double valeur = 10000.0;
        boolean expResult = false;
        boolean result = Observations.verifValeurParLot45k(valeur);
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testVerifTaxeMunicipale1k() {
        System.out.println("verifTaxeMunicipale1k");
        double valeur = 45.0;
        boolean expResult = false;
        boolean result = Observations.verifTaxeMunicipale1k(valeur);
        assertEquals(expResult, result);
        
    }

     
    
    
    @Test
    public void testVerifTaxeScolaire() {
        System.out.println("verifTaxeScolaire");
        double valeur = 400.25;
        boolean expResult = false;
        boolean result = Observations.verifTaxeScolaire(valeur);
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testVerifValeurFonciereTotale() {
        System.out.println("verifValeurFonciereTotale");
        double valeur = 10000.0;
        boolean expResult = false;
        boolean result = Observations.verifValeurFonciereTotale(valeur);
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testVerifSuperficieParLot() {
        System.out.println("verifSuperficieParLot");
        double valeur = 10000;
        boolean expResult = false;
        boolean result = Observations.verifSuperficieParLot(valeur);
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testVerifPrixMaximumMetreCarre() {
        System.out.println("verifPrixMaximumMetreCarre");
        double prix_min = 50;
        double prix_max = 20;
        boolean expResult = false;
        boolean result = Observations.verifPrixMaximumMetreCarre(prix_min, prix_max);
        assertEquals(expResult, result);
        
    }
    
    
    @Test
    public void testAccumulerObservation() {
        System.out.println("accumulerObservation");
        String observations = "Le prix maximum du mètre carré dépasse de deux fois le prix minimum du mètre carré.";
        Observations observ = new Observations("Le prix maximum du mètre carré dépasse de deux fois le prix minimum du mètre carré.");
        ArrayList<Observations> liste_observations = new ArrayList();
        liste_observations.add(observ);
        ArrayList expResult = liste_observations;
        ArrayList result = Observations.accumulerObservation(observations, liste_observations);
        assertEquals(expResult, result);
        
    }

    
    
}

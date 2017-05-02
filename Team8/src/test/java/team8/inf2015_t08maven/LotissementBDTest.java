
package team8.inf2015_t08maven;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static team8.inf2015_t08maven.TerrainBD.ajouterSigneDollar;


public class LotissementBDTest {
    
    public LotissementBDTest() {
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
    public void testPreparerDonneesEcritureLots() throws Exception {
        System.out.println("preparerDonneesEcritureLots");
        String nom_fichier_sortie = "resultats.json";
        String valeur_par_lots;
        JSONArray lot_array = new JSONArray();
        
        Lotissement lot1 = new Lotissement("Lot 1", 500, 10, 20, 500);
        Lotissement lot2 = new Lotissement("Lot 2", 700, 60, 80, 400);
        Lotissement[] tab_lots = {lot1,lot2};
        
        for (int i = 0; i < tab_lots.length; i++) {

            JSONObject lot = new JSONObject();
            lot.accumulate("description", tab_lots[i].getDescription());
            valeur_par_lots = ajouterSigneDollar(tab_lots[i].getValeurFonciereLot());
            lot.accumulate("valeur_par_lot", valeur_par_lots);
            lot_array.add(lot);
        }
        
        JSONArray expResult = lot_array;
        JSONArray result = LotissementBD.preparerDonneesEcritureLots(nom_fichier_sortie, tab_lots);
        assertEquals(expResult, result);
        
    }
    
}


package team8.inf2015_t08maven;


import java.util.ArrayList;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static team8.inf2015_t08maven.TerrainBD.ajouterSigneDollar;


public class TerrainBDTest {
    
    public TerrainBDTest() {
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
    public void testPreparerDonneesEcritureTerrain() throws ExceptionValidation {
        
        
        
        Terrain terrain = new Terrain(1, 3.45, 7.00, 384.25, 184.45, 15370.20);
        JSONObject terrain_json = new JSONObject();
        terrain_json.accumulate("valeur_fonciere_totale", ajouterSigneDollar(terrain.getValeurFonciereTotale()));
        terrain_json.accumulate("taxe_scolaire", ajouterSigneDollar(terrain.getTaxeScolaire()));
        terrain_json.accumulate("taxe_municipale", ajouterSigneDollar(terrain.getTaxeMunicipale()));
        JSONObject expResult = terrain_json;
        JSONObject result = TerrainBD.preparerDonneesEcritureTerrain(terrain);
        assertEquals(expResult, result);
        
    }
    
    
    @Test
    public void testPreparerDonneesLectureTerrain() throws Exception {
        System.out.println("preparerDonneesLectureTerrain");
        String[] args = {"json\\lot.json"};           
        String json = FileReader.loadFileIntoString(args[0], "utf-8");
        JSONObject terrain_json = JSONObject.fromObject(json);       
        JSONObject expResult = terrain_json;
        JSONObject result = TerrainBD.preparerDonneesLectureTerrain(args);
        assertEquals(expResult, result);
        
    }


       
    @Test
    public void testEnleverSigneDollar() {
        System.out.println("enleverSigneDollar");
        String nombre = "4.0$";
        double expResult = 4.0;
        double result = TerrainBD.enleverSigneDollar(nombre);
        assertEquals(expResult, result, 4.0);
        
    }

    
    @Test
    public void testAjouterSigneDollar() {
        System.out.println("ajouterSigneDollar");
        double nombre = 5.00;
        String expResult = "5.00 $";
        String result = TerrainBD.ajouterSigneDollar(nombre);
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testVerifierStringPointVirgule() {
        System.out.println("verifierStringPointVirgule");
        String nombre = "5,6";
        String expResult = "5.6";
        String result = TerrainBD.verifierStringPointVirgule(nombre);
        assertEquals(expResult, result);
        
    }

    
    
}

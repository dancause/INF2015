package team8.inf2015_t08maven;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class INF2015_T08Test {
    
    public INF2015_T08Test() {
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
     * Test of main method, of class INF2015_T08.
     */
    @Test
    public void testMain() throws Exception {
        String[] args = null;
        
        // Test fichier lot ordinaire
        args = new String[2];
        args[0] = "json/lot.json";
        args[1] = "json/resultat.json";
        INF2015_T08.main(args);
        
        // Test fichier valeur manquante
        args = new String[2];
        args[0] = "json/lot-valeur-manquate.json";
        args[1] = "json/resultat-valeur-manquate.json";
        INF2015_T08.main(args);
        
        // Test mauvais fichier entree
        args = new String[2];
        args[0] = "json/lot-existe-pas.json";
        args[1] = "json/resultat-existe-pas.json";
        INF2015_T08.main(args);
        
        // Test mauvais fichier sortie
        args = new String[2];
        args[0] = "json/lot.json";
        args[1] = "json/////resultat-mauvais-fichier\\///\\.json";
        INF2015_T08.main(args);
        
        // Test mauvaise date
        args = new String[2];
        args[0] = "json/lot-mauvaise-date.json";
        args[1] = "json/resultat-mauvaise-date.json";
        INF2015_T08.main(args);
        
        // Test nombre droits de passage
        args = new String[2];
        args[0] = "json/lot-erreur-droit-passage.json";
        args[1] = "json/resultat-erreur-droit-passage.json";
        INF2015_T08.main(args);
        
         // Test affichage star
        args = new String[3];
        args[0] = "json/lot.json";
        args[1] = "json/resultat.json";
        args[2] =   "-s";
        StatistiqueTraitement.nomfichier="json/resultat_test.json";
        INF2015_T08.main(args);
        
         // Test reset stat
        args = new String[3];
        args[0] = "json/lot.json";
        args[1] = "json/resultat.json";
        args[2] ="-sr";
        StatistiqueTraitement.nomfichier="json/resultat_test.json";
        INF2015_T08.main(args);
    }
    
}

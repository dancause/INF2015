package team8.inf2015_t08maven;

import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONException;

public class INF2015_T08 {

public static DecimalFormat dec2 = new DecimalFormat("0.00");

    
    
    @SuppressWarnings("empty-statement")
public static void main(String[] args) throws Exception {

        Lotissement[] tab_lots = null;
        
        try {

            JSONObject terrain_json = TerrainBD.preparerDonneesLectureTerrain(args);

            JSONArray lot_Array = terrain_json.getJSONArray("lotissements");
            tab_lots = new Lotissement[lot_Array.size()];

                    Terrain terrain = new Terrain(terrain_json.getInt("type_terrain"),
                    Lotissement.enleverSigneDollar(terrain_json.getString("prix_m2_min")),
                    Lotissement.enleverSigneDollar(terrain_json.getString("prix_m2_max")));

            terrain.setValeurFonciereTotale(Terrain.calculerValeurFonciere(Lotissement.calculerValeurLotsTotale(terrain, lot_Array, tab_lots)));
            terrain.setTaxeScolaire(Terrain.calculerTaxeScolaire(terrain.getValeurFonciereTotale()));
            terrain.setTaxeMunicipale(Terrain.calculerTaxeMunicipale(terrain.getValeurFonciereTotale()));
           
            StatistiqueTraitement.traiterStatistique(args[2],tab_lots);
   
            TerrainBD.ecrireFichier(terrain, tab_lots, args[1],Observations.verifierLesLots(tab_lots, terrain));
            
            
        } catch (JSONException ex) {
            ecrireErreur(ex.getMessage(), args[1]);
        } catch (ExceptionValidation ex) {
            ecrireErreur(ex.getMessage(), args[1]);
        } catch (Exception ex) {
            ecrireErreur(ex.getMessage(), args[1]);
            System.out.print(ex.getMessage());
        }   
    }
public static void ecrireErreur(String message, String nom_fichier_sortie) {
        try {
            FileWriter fichier_resultat = new FileWriter(nom_fichier_sortie);
            System.out.print(message);
            fichier_resultat.write(message);
            fichier_resultat.close();
        }
        catch (IOException ex) {
            System.out.print("Impossible de créer le fichier de sortie");
        }
    } 

}

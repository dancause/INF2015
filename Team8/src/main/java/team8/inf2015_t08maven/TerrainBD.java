package team8.inf2015_t08maven;

import java.io.*;
import java.text.DecimalFormat;
import net.sf.json.JSONArray;
import java.util.ArrayList;
import net.sf.json.JSONObject;

public class TerrainBD {

    public static DecimalFormat dec2 = new DecimalFormat("0.00");

    public static JSONObject preparerDonneesLectureTerrain(String[] args) throws Exception {
        try {
            String json = FileReader.loadFileIntoString(args[0], "utf-8");
            JSONObject terrain_json = JSONObject.fromObject(json);
            return terrain_json;
        }
        catch (FileNotFoundException ex) {
            throw new Exception("Fichier non trouvé ou impossible à lire");
        }
    }

    public static JSONObject preparerDonneesEcritureTerrain(Terrain terrain) {
        JSONObject terrain_json = new JSONObject();
        terrain_json.accumulate("valeur_fonciere_totale", ajouterSigneDollar(terrain.getValeurFonciereTotale()));
        terrain_json.accumulate("taxe_scolaire", ajouterSigneDollar(terrain.getTaxeScolaire()));
        terrain_json.accumulate("taxe_municipale", ajouterSigneDollar(terrain.getTaxeMunicipale()));

        return terrain_json;
    }

    public static void ecrireFichier(Terrain terrain, Lotissement[] tab_lots, String nom_fichier_sortie, ArrayList<Observations> liste_observations) throws Exception {

        JSONObject terrain_json = new JSONObject();

        terrain_json = TerrainBD.preparerDonneesEcritureTerrain(terrain);

        try {
            FileWriter fichier_resultat = new FileWriter(nom_fichier_sortie);
            PrintWriter sortie = new PrintWriter(fichier_resultat);

            terrain_json.accumulate("lotissements", LotissementBD.preparerDonneesEcritureLots(nom_fichier_sortie, tab_lots));
            if (!liste_observations.isEmpty()) {
                Observations.preparerDonneesEcritureObservations(nom_fichier_sortie, liste_observations, terrain_json);
            }
            System.out.println(terrain_json);
            sortie.print(terrain_json);

            sortie.close();
        } catch (IOException e) {
            throw new Exception("Impossible de créer le fichier de sortie.");
        }

    }

    public static double enleverSigneDollar(String nombre) {
        return Double.valueOf(verifierStringPointVirgule(nombre).replaceAll("[ $,]", ""));
    }

    public static String ajouterSigneDollar(double nombre) {
        return dec2.format(nombre) + " $";
    }

    public static String verifierStringPointVirgule(String nombre) {

        if (nombre.contains(",")) {
            return (nombre.replace(",", "."));
        }
        return nombre;
    }
}

package team8.inf2015_t08maven;

import static team8.inf2015_t08maven.TerrainBD.ajouterSigneDollar;
import java.io.IOException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class LotissementBD {

    public static JSONArray preparerDonneesEcritureLots(String nom_fichier_sortie, Lotissement[] tab_lots) throws IOException {
        String valeur_par_lots;

        JSONArray lot_array = new JSONArray();

        for (int i = 0; i < tab_lots.length; i++) {

            JSONObject lot = new JSONObject();
            lot.accumulate("description", tab_lots[i].getDescription());
            valeur_par_lots = ajouterSigneDollar(tab_lots[i].getValeurFonciereLot());
            lot.accumulate("valeur_par_lot", valeur_par_lots);
            lot_array.add(lot);
        }

        return lot_array;

    }
}

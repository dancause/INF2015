//test
package team8.inf2015_t08maven;
import java.util.List;
import java.util.ArrayList;
import static team8.inf2015_t08maven.TerrainBD.ajouterSigneDollar;
import java.io.IOException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Observations {
    
    private String observation;
    
    
    
    public Observations(String observation){
        this.observation = observation;
    }
    
    public String getObservation(){
        return observation;
    }
    
    public void setObservation(String observation) {
        this.observation = observation;
    }
    
    public static boolean verifValeurParLot45k(double valeur) {           
        return valeur > 45000.00;        
    }
    
    public static boolean verifTaxeMunicipale1k(double valeur) {               
        return valeur > 1000.00;
    }
    
    public static boolean verifDatesMesurLots6Mois(Lotissement[] tab_lots){
        boolean verif = false;
        SimpleDateFormat format_date = new SimpleDateFormat("yyyy-mm-dd");
        Calendar date = Calendar.getInstance();
        Calendar date_min = Calendar.getInstance();
        Calendar date_max = Calendar.getInstance();
        try{
        
               
        for (int i = 0; i < tab_lots.length; i++) {
            date.setTime(format_date.parse(tab_lots[i].getDateMesure()));
            for (int j = 0; j < tab_lots.length; j++) {
                date_min.setTime(format_date.parse(tab_lots[j].getDateMesure()));
                date_max.setTime(format_date.parse(tab_lots[j].getDateMesure()));
                date_max.add(Calendar.MONTH, 6);
                date_min.add(Calendar.MONTH, -6);
                
                if(date.before(date_min) || date.after(date_max)){
                    verif = true;
                }
            }
            
        }
        }catch (ParseException e){
            
        }
        return verif;        
                
                
    }
    
    public static boolean verifTaxeScolaire(double valeur) {
        return valeur > 500.00;
    }
    
    public static boolean verifValeurFonciereTotale(double valeur) {
        return valeur > 300000.00;
    }
    
    public static boolean verifSuperficieParLot(double valeur) {
        return valeur > 45000.00;
    }
    
    public static boolean verifPrixMaximumMetreCarre(double prix_min, double prix_max) {
        return prix_max > prix_min * 2;
    }
    
    public static String messageValeurParLot45k(String lot) {
        return "La valeur par lot du " + lot + " est trop dispendieuse.";        
    }
    
    public static String messageTaxeMunicipale1k() {
        return "La taxe municipale payable par le propriétaire nécessite deux versements.";        
    }
    
    public static String messageDatesMesurLots6Mois() {
        return "Il y a un écart de 6 mois entre les dates de mesure des lots.";        
    }
    
    public static String messageTaxeScolaire() {
        return "La taxe scolaire payable par le propriétaire nécessite deux versements.";        
    }
    
    public static String messageValeurFonciereTotale() {
        return "La valeur foncière totale est trop dispendieuse.";        
    }
    
    public static String messageSuperficieParLot(String lot) {
        return "La superficie du " + lot + " est trop grande.";        
    }
    
    public static String messagePrixMaximumMetreCarre() {
        return "Le prix maximum du mètre carré dépasse de deux fois le prix minimum du mètre carré.";        
    }
    
    public static ArrayList accumulerObservation(String observations, ArrayList<Observations> liste_observations) {
        
        liste_observations.add(new Observations(observations));
        return liste_observations;
                
    }
    
    public static ArrayList<Observations> verifierLesLots(Lotissement[] tab_lots, Terrain terrain ){
        ArrayList<Observations> liste_observations = new ArrayList<Observations>();
        
        
        for (int i = 0; i < tab_lots.length; i++) {
            if(verifSuperficieParLot(tab_lots[i].getSuperficie())){
                 accumulerObservation(messageSuperficieParLot(tab_lots[i].getDescription()), liste_observations);
            }
            
            if(verifValeurParLot45k(tab_lots[i].getValeurParLot())){
                 accumulerObservation(messageValeurParLot45k(tab_lots[i].getDescription()), liste_observations);
            }
                                 
                        
        }
        
        if(verifDatesMesurLots6Mois(tab_lots)){
                 accumulerObservation(messageDatesMesurLots6Mois(), liste_observations);
        }
        
        if(verifTaxeMunicipale1k(terrain.getTaxeMunicipale())){
                 accumulerObservation(messageTaxeMunicipale1k(), liste_observations);
        }
        
        if(verifTaxeScolaire(terrain.getTaxeScolaire())){
                 accumulerObservation(messageTaxeScolaire(), liste_observations);
        }
        
        if(verifValeurFonciereTotale(terrain.getValeurFonciereTotale())){
                 accumulerObservation(messageValeurFonciereTotale(), liste_observations);
        }
        
        if(verifPrixMaximumMetreCarre(terrain.getPrixMin(), terrain.getPrixMax())){
                 accumulerObservation(messagePrixMaximumMetreCarre(), liste_observations);
        }
        
        
        return liste_observations;
               
        
    }
    
    public static JSONObject preparerDonneesEcritureObservations(String nom_fichier_sortie, ArrayList<Observations> liste_observations, JSONObject terrain_json) throws IOException {
             
        JSONArray observations_array = new JSONArray();
        Observations[] tab_observations = new Observations[liste_observations.size()];
        tab_observations = liste_observations.toArray(tab_observations);
                                    
        for(int i = 0; i < tab_observations.length; i++){
            observations_array.add(tab_observations[i].observation.toString());
        } 
        terrain_json.accumulate("observations:", observations_array);                
             
        return terrain_json;
    }
    
}

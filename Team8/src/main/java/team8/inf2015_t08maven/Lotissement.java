package team8.inf2015_t08maven;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Lotissement {

    private String description;
    private double valeur_par_lot;
    private double valeur_droit_de_passage;
    private double valeur_service;
    private double valeur_fonciere_lot;
    private int    superficie;
    private int    type;
    private String date_mesure;
   

    public Lotissement(String description, double valeur_par_lot, double valeur_droit_de_passage, double valeur_service, double valeur_fonciere_lot) {
        this.description = description;
        this.valeur_par_lot = valeur_par_lot;
        this.valeur_droit_de_passage = valeur_droit_de_passage;
        this.valeur_service = valeur_service;
    }

    public Lotissement(double valeur_par_lot, double valeur_droit_de_passage, double valeur_service) {
        this("", valeur_par_lot, valeur_droit_de_passage, valeur_service, 0);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setValeurFonciereLot(double valeur_fonciere_lot) {
        this.valeur_fonciere_lot = valeur_fonciere_lot;
    }
    
     public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public int getSuperficie(){
    return superficie;
    }
    
    public void setType(int type) {
        this.type = type;
    }
    
    public void setDateMesure(String date_mesure) {
        this.date_mesure = date_mesure;
    }
    
    public int getType() {
        return type;
    }
    
    public String getDescription() {
        return description;
    }

    public double getValeurParLot() {
        return valeur_par_lot;
    }

    public double getValeurDroitDePassage() {
        return valeur_droit_de_passage;
    }

    public double getValeurService() {
        return valeur_service;
    }

    public double getValeurFonciereLot() {
        return valeur_fonciere_lot;
    }
    
    public String getDateMesure() {
        return date_mesure;
    }
    
    private static String verifierDescriptionUnique(String description, Lotissement[] tab_lots, int index) throws ExceptionValidation {
        for (int i = 0; i < index; i++) {
            if(description.equals(tab_lots[i].description)){
                throw (new ExceptionValidation("Description déjà existante"));
            }
        }
        return description;
    }
    
    public static double calculerValeurLotsTotale(Terrain terrain, JSONArray lot_json, Lotissement[] tab_lots) throws ExceptionValidation {

        for (int i = 0; i < lot_json.size(); i++) {
            JSONObject x = lot_json.getJSONObject(i);

            TypeTerrain valeur_terrain = creerTypeTerrain(terrain.getTypeTerrain());
            valeur_terrain.setTerrain(terrain.getTypeTerrain(), x.getInt("superficie"), x.getInt("nombre_services"), terrain.getPrixMin(), terrain.getPrixMax(), x.getInt("nombre_droits_passage"), x.getString("date_mesure"));           
            tab_lots[i] = new Lotissement(valeur_terrain.getValeurLot(), valeur_terrain.getValeurDroitPassage(), valeur_terrain.getValeurService());
            terrain.setValeurFonciereTotale(terrain.getValeurFonciereTotale() + (tab_lots[i].getValeurParLot() + tab_lots[i].getValeurDroitDePassage() + tab_lots[i].getValeurService()));
            tab_lots[i].setDescription(verifierDescriptionUnique(x.getString("description"),tab_lots,i));
            tab_lots[i].setDateMesure(x.getString("date_mesure"));
            tab_lots[i].setValeurFonciereLot(tab_lots[i].getValeurParLot() + tab_lots[i].getValeurDroitDePassage() + tab_lots[i].getValeurService());
            
            tab_lots[i].setSuperficie(x.getInt("superficie"));
            tab_lots[i].setType(terrain.getTypeTerrain());
            
        }
        return terrain.getValeurFonciereTotale();
    }

    public static double enleverSigneDollar(String nombre) {
        return Double.valueOf(verifierStringPointVirgule(nombre).replaceAll("[ $,]", ""));
    }

    public static String verifierStringPointVirgule(String nombre) {

        if (nombre.contains(",")) {
            return (nombre.replace(",", "."));
        }
        return nombre;
    }

    public static TypeTerrain creerTypeTerrain(int x) {
        TypeTerrain[] valeur_terrain = new TypeTerrain[3];
        valeur_terrain[0] = new Agricole();
        valeur_terrain[1] = new Residentiel();
        valeur_terrain[2] = new Commerciale();
        return valeur_terrain[x];
    }
    
   

    public static final double VALEUR_BASE = 733.77;
    public static final double VALEUR_ZERO = 0.00;
    public static final double VALEUR_MAX = 5000.00;
    public static final int SUPERFICIE_MIN = 500;
    public static final int SUPERFICIE_SUPP = 10000;
    public static final int NOMBRE_SERVICES_BASE = 2;
    public static final double MONTANT_BASE = 500.00;
    public static final int[] TAB_VALEUR_SERVICES = {500, 1000, 1500};
    public static final double[] TAB_DROITS_PASSAGES = {0.05, 0.10, 0.15};
    public static final double TAXE_MUNICIPALE_TAUX = 0.025;
    public static final double TAXE_SCOLAIRE_TAUX = 0.012;

}

package team8.inf2015_t08maven;

import java.text.*;
import java.util.Date;

public class TypeTerrain {

    private int type_terrain;
    private int superficie;
    private int nombre_services;
    private double prix_min;
    private double prix_max;
    private int nombre_droits_passage;
    private String date_mesure; 

    public TypeTerrain() {
    }

    public TypeTerrain(int type_terrain, int superficie, int nombre_services, double prix_min, double prix_max, int nombre_droits_passage, String date_mesure) throws ExceptionValidation {
        this.setTerrain(type_terrain, superficie, nombre_services, prix_min, prix_max, nombre_droits_passage, date_mesure);
    }

    public void setTerrain(int type_terrain, int superficie, int nombre_services, double prix_min, double prix_max, int nombre_droits_passage, String date_mesure) throws ExceptionValidation{
        setTypeDeTerrain(type_terrain);
        setSuperficie(superficie);
        setNombreServices(nombre_services);
        setPrixMin(prix_min);
        setPrixMax(prix_max);
        setNombreDroitsPassage(nombre_droits_passage);
        setDateMesure(date_mesure);
    }
    
    public void setPrixMax(double prix_max) throws ExceptionValidation {
        if (prix_max < 0) {
            throw new ExceptionValidation("Un montant ne peut pas être négatif");
        }
        this.prix_max = prix_max;
    }
        
    public void setPrixMin(double prix_min) throws ExceptionValidation {
        if (prix_min < 0) {
            throw new ExceptionValidation("Un montant ne peut pas être négatif");
        }
        this.prix_min = prix_min;
    }
    
    public void setSuperficie(int superficie) throws ExceptionValidation {
        if (superficie < 0 || superficie > 50000) {
            throw new ExceptionValidation("La superficie ne peut pas être négative et ne peut pas être supérieure à 50000 m3");
        }
        this.superficie = superficie;
    }
    
    public void setTypeDeTerrain(int type_terrain) throws ExceptionValidation {
        if (type_terrain < 0 || type_terrain > 2) {
            throw new ExceptionValidation("Le type de terrain doit prendre la valeur 0, 1 ou 2");
        }
        this.type_terrain = type_terrain;
    }
    
    public void setNombreServices(int nombre_services) throws ExceptionValidation {
        if (nombre_services < 0 || nombre_services > 5) {
            throw new ExceptionValidation("Le nombre de services doit être entre 0 et 5 inclusivement");
        }
        this.nombre_services = nombre_services;
    }

    public void setNombreDroitsPassage(int nombre_droits_passage) throws ExceptionValidation {
        if (nombre_droits_passage < 0 || nombre_droits_passage > 10) {
            throw new ExceptionValidation("Le nombre de droits de passage doit être entre 0 et 10 inclusivement");
        }
        this.nombre_droits_passage = nombre_droits_passage;
    }
    
    public void setDateMesure(String date_mesure) throws ExceptionValidation {
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            df.parse(date_mesure); 
        }
        catch (ParseException ex) {
            throw new ExceptionValidation("Le format de date doit être ISO 8601.");
        }
    }
    
    public int getTypeTerrain() {
        return type_terrain;
    }
    
    public int getSuperficie() {
        return superficie;
    }
    
    public int getNombreServices() {
        return nombre_services;
    }
    
    public double getPrixMin() {
        return prix_min;
    }
    
    public double getPrixMax() {
        return prix_max;
    }
    
    public int getNombreDroitsPassage() {
        return nombre_droits_passage;
    }
    
    public double getValeurService() {
        return 0;
    }

    public double getValeurLot() {
        return 0;
    }

    public double getValeurDroitPassage() {
        return 0;
    }

}

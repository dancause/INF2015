package team8.inf2015_t08maven;

public class Agricole extends TypeTerrain {

    public Agricole() {
    }

    public Agricole(int type_terrain, int superficie, int nombre_services, double prix_min, double prix_max, int nombre_droits_passage, String date_mesure) throws ExceptionValidation {
        super(type_terrain, superficie, nombre_services, prix_min, prix_max, nombre_droits_passage, date_mesure);
    }

    @Override
    public double getValeurService() {
        return agricole();
    }

    @Override
    public double getValeurDroitPassage() {
        return Lotissement.MONTANT_BASE - (getNombreDroitsPassage() * (Lotissement.TAB_DROITS_PASSAGES[getTypeTerrain()] * getValeurLot()));
    }

    @Override
    public double getValeurLot() {
        return getSuperficie() * getPrixMin();
    }

    private double agricole() {
        return Lotissement.VALEUR_ZERO;
    }
}

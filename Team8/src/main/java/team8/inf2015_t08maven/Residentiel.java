package team8.inf2015_t08maven;

public class Residentiel extends TypeTerrain {

    public Residentiel() {
    }

    public Residentiel(int type_terrain, int superficie, int nombre_services, double prix_min, double prix_max, int nombre_droits_passage, String date_mesure) throws ExceptionValidation {
        super(type_terrain, superficie, nombre_services, prix_min, prix_max, nombre_droits_passage, date_mesure);
    }

    @Override
    public double getValeurService() {

        if (validSupercifieMin()) {
            return calculValeurInferieur();
        }
        if (validSupercifieEntreLimite()) {
            return calculServiceValeur(0);
        }
        return calculServiceValeur(1);
    }

    public double getValeurLot() {
        return getSuperficie() * ((getPrixMin() + getPrixMax()) / 2);
    }

    public double getValeurDroitPassage() {
        return Lotissement.MONTANT_BASE - (getNombreDroitsPassage() * (Lotissement.TAB_DROITS_PASSAGES[getTypeTerrain()] * getValeurLot()));
    }

    private double lotissementValeurService(int i) {
        return Lotissement.TAB_VALEUR_SERVICES[i];
    }

    private boolean validSupercifieMin() {
        return (getSuperficie() <= Lotissement.SUPERFICIE_MIN);
    }

    public boolean validSupercifieEntreLimite() {
        return (getSuperficie() > Lotissement.SUPERFICIE_MIN && getSuperficie() <= Lotissement.SUPERFICIE_SUPP);
    }

    private double calculValeurInferieur() {
        return Lotissement.VALEUR_ZERO;
    }

    private int nombreServices() {
        return Lotissement.NOMBRE_SERVICES_BASE + getNombreServices();
    }

    private double calculServiceValeur(int i) {
        return nombreServices() * lotissementValeurService(i);
    }

}


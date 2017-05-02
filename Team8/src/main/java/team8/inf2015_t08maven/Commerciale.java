package team8.inf2015_t08maven;

public class Commerciale extends TypeTerrain {

    public Commerciale() {
    }

    public Commerciale(int type_terrain, int superficie, int nombre_services, double prix_min, double prix_max, int nombre_droits_passage, String date_mesure) throws ExceptionValidation {
        super(type_terrain, superficie, nombre_services, prix_min, prix_max, nombre_droits_passage, date_mesure);
    }

    @Override
    public double getValeurService() {

        if (validSupercifieMin() && validServiceValeurMax(0)) {
            return calculServiceValeur(0);
        }
        if (!validSupercifieMin() && validServiceValeurMax(2)) {
            return calculServiceValeur(2);
        }
        return Lotissement.VALEUR_MAX;
    }

    @Override
    public double getValeurDroitPassage() {
        return Lotissement.MONTANT_BASE - (getNombreDroitsPassage() * (Lotissement.TAB_DROITS_PASSAGES[getTypeTerrain()] * getValeurLot()));
    }

    @Override
    public double getValeurLot() {
        return getSuperficie() * getPrixMax();
    }

    private double calculServiceValeur(int i) {
        return nombreServices() * lotissementValeurService(i);
    }

    private double lotissementValeurService(int i) {
        return Lotissement.TAB_VALEUR_SERVICES[i];
    }

    private boolean validSupercifieMin() {
        return (getSuperficie() <= Lotissement.SUPERFICIE_MIN);
    }

    private boolean validServiceValeurMax(int i) {
        return calculServiceValeur(i) < Lotissement.VALEUR_MAX;
    }

    private int nombreServices() {
        return Lotissement.NOMBRE_SERVICES_BASE + getNombreServices();
    }

}

package team8.inf2015_t08maven;

public class Terrain {

    private int type_terrain;
    private double prix_min;
    private double prix_max;
    private double taxe_municipale;
    private double taxe_scolaire;
    private double valeur_fonciere_totale;

    public Terrain(int type_terrain, double prix_min, double prix_max, double taxe_municipale, double taxe_scolaire, double valeur_fonciere_totale) throws ExceptionValidation {
        setTypeTerrain(type_terrain);
        setPrixMin(prix_min);
        setPrixMax(prix_max);
        this.taxe_municipale = taxe_municipale;
        this.taxe_scolaire = taxe_scolaire;
        this.valeur_fonciere_totale = valeur_fonciere_totale;

    }

    public Terrain(int type_terrain, double prix_min, double prix_max) throws ExceptionValidation {
        this(type_terrain, prix_min, prix_max, 0, 0, 0);
    }

    public void setTypeTerrain(int type_terrain) throws ExceptionValidation {
        if (type_terrain < 0 || type_terrain > 2) {
            throw new ExceptionValidation("Le type de terrain doit prendre la valeur 0, 1 ou 2");
        }
        this.type_terrain = type_terrain;
    }
    
    public void setPrixMin(double prix_min) throws ExceptionValidation {
        if (prix_min < 0) {
            throw new ExceptionValidation("Un montant ne peut pas être négatif");
        }
        this.prix_min = prix_min;
    }
    
    public void setPrixMax(double prix_max) throws ExceptionValidation {
        if (prix_max < 0) {
            throw new ExceptionValidation("Un montant ne peut pas être négatif");
        }
        this.prix_max = prix_max;
    }

    public void setTaxeMunicipale(double taxe_municipale) {
        this.taxe_municipale = taxe_municipale;
    }

    public void setTaxeScolaire(double taxe_scolaire) {
        this.taxe_scolaire = taxe_scolaire;
    }

    public void setValeurFonciereTotale(double valeur_fonciere_totale) {
        this.valeur_fonciere_totale = valeur_fonciere_totale;
    }
    
    public int getTypeTerrain() {
        return type_terrain;
    }

    public double getPrixMin() {
        return prix_min;
    }

    public double getPrixMax() {
        return prix_max;
    }

    public double getTaxeMunicipale() {
        return taxe_municipale;
    }

    public double getTaxeScolaire() {
        return taxe_scolaire;
    }

    public double getValeurFonciereTotale() {
        return valeur_fonciere_totale;
    }
        
    public static double calculerValeurFonciere(double valeur_fonciere_lots) {
        return arrondirMontant(valeur_fonciere_lots + Lotissement.VALEUR_BASE);
    }

    public static double calculerTaxeScolaire(double valeur_fonciere_totale) {
        return arrondirMontant(valeur_fonciere_totale * Lotissement.TAXE_SCOLAIRE_TAUX);
    }

    public static double calculerTaxeMunicipale(double valeur_fonciere_totale) {
        return arrondirMontant(valeur_fonciere_totale * Lotissement.TAXE_MUNICIPALE_TAUX);
    }

    public static double arrondirMontant(double arrondir) {
        return Math.round(arrondir * 20.0) / 20.0;
    }
}

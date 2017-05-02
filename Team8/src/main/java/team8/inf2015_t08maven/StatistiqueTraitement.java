/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team8.inf2015_t08maven;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import net.sf.json.JSONObject;

/**
 *
 * @author janindancause
 */
public class StatistiqueTraitement {
    public static final String [] message_statistique=new String []{ 
            "Le nombre total de lots",
            "Moins de 1000$",
            "1000 à 10000$",
            "Plus de 10000$",
            "Nombres de lot agricole",
            "Nombres de lot commercial",
            "Nombres de lot résidentiel",
            "Superficie maximal traité",
            "Valeur maximal d'un lot traité"};
    static String nomfichier="json/statistique.json";
    private static final String [] message_erreur=new String[]{
            "Fichier adsent, un nouveau fichier va être créé",
            "Impossible d'écrire le fichier dans le dossier"};
    
     public  static Statistique lireStatistique() throws Exception {
      
       Statistique Statis=new Statistique();

       try {
            String json = FileReader.loadFileIntoString(nomfichier, "utf-8");
            JSONObject lot_Statistique = JSONObject.fromObject(json);

            Statis.setStatistique(
            lot_Statistique.getInt(message_statistique[0]),
            lot_Statistique.getInt(message_statistique[1]),
            lot_Statistique.getInt(message_statistique[2]),
            lot_Statistique.getInt(message_statistique[3]),
            lot_Statistique.getInt(message_statistique[4]),
            lot_Statistique.getInt(message_statistique[5]),
            lot_Statistique.getInt(message_statistique[6]),
            lot_Statistique.getInt(message_statistique[7]),
            lot_Statistique.getInt(message_statistique[8])
            );
  
        }
        catch (FileNotFoundException e) {
        System.out.print(message_erreur[0]);
        }
        return Statis;
}
     
       public static JSONObject preparerDonneesStatistique(Statistique Statis) {
        JSONObject StatisObject = new JSONObject();
        
        StatisObject.accumulate(message_statistique[0], Statis.getTotallot());
        StatisObject.accumulate(message_statistique[1], Statis.getmoins1000());
        StatisObject.accumulate(message_statistique[2], Statis.get1000_10000());
        StatisObject.accumulate(message_statistique[3], Statis.getplus10000());
        StatisObject.accumulate(message_statistique[4], Statis.getnbAgricole());
        StatisObject.accumulate(message_statistique[5], Statis.getnbCommercial());
        StatisObject.accumulate(message_statistique[6], Statis.getnbResidentiel());
        StatisObject.accumulate(message_statistique[7], Statis.getMaxSuperficie());
        StatisObject.accumulate(message_statistique[8], Statis.getValLotMax());
        
        return StatisObject;
    }
       
       public static void ecrireStatistique(JSONObject JSON_Statis){
  
        try {
            FileWriter fichier_stat = new FileWriter(nomfichier);
            PrintWriter sortie = new PrintWriter(fichier_stat);
            sortie.print(JSON_Statis);
            sortie.close();
        } catch (IOException e) {
            System.out.print(message_erreur[1]);
        }
       
       }
  
       public static void traiterStatistique(String Arg,Lotissement [] tabLOT)throws Exception{
           Statistique stat=lireStatistique();
           
            for(int i = 0; i < tabLOT.length;i++){
                stat.valeurLot(tabLOT[i].getValeurFonciereLot());
                stat.lotTypes(tabLOT[i].getType());
                stat.MaxValeurLot(tabLOT[i].getValeurFonciereLot());
                stat.maxSupperficie(tabLOT[i].getSuperficie());
                stat.setTotallot();          
            }
            
        resetStatistique(Arg,stat);
        ecrireStatistique(preparerDonneesStatistique(stat));
        afficherStatistique(Arg,stat);
        
    }
public static void ViderStats(Statistique Stat){
     Stat.resetStatistique();
}

public static void afficherStatistique(String Arg,Statistique stat){
if(Arg.equalsIgnoreCase("-s")){
        System.out.print(stat);
        }
}
public static void resetStatistique(String Arg,Statistique stat){
  if(Arg.equalsIgnoreCase("-sr")){
        ViderStats(stat); 
        }
}
    
}

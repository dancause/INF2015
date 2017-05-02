/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team8.inf2015_t08maven;

/**
 *
 * @author janindancause
 */
public class Statistique {
    
    private int total_lot=0;
    private int moins_1000=0;
    private int entre_1000_10000=0;
    private int plus_de_10000=0;
    private int nb_lot_agricole=0;
    private int nb_lot_commercial=0;
    private int nb_lot_residentiel=0;
    private int maximale_superficie=0;
    private double val_lot_maximale=0;
    
 
   public Statistique(
   int total_lot,
   int moins_1000,
   int entre_1000_10000,
   int plus_de_10000,
   int nb_lot_agricole,
   int nb_lot_commercial,
   int nb_lot_residentiel,
   int maximale_superficie,
   int val_lot_maximale){
     
   this.total_lot=nb_lot_agricole+nb_lot_commercial+nb_lot_residentiel;
   this.moins_1000=moins_1000;
   this.entre_1000_10000=entre_1000_10000;
   this.plus_de_10000=plus_de_10000;
   this.nb_lot_agricole=nb_lot_agricole;
   this.nb_lot_commercial=nb_lot_commercial;
   this.nb_lot_residentiel=nb_lot_residentiel;
   this.maximale_superficie=maximale_superficie;
   this.val_lot_maximale=val_lot_maximale;
 
 }
   
   public Statistique(){
   }
   
   public void resetStatistique(){
   
   setmoins1000(0);
   set1000_10000(0);
   setplus10000(0);
   setnbAgricole(0);
   setnbCommercial(0);
   setnbResidentiel(0);
   setMaxSuperficie(0);
   setValLotMax(0);
   setTotallot();
   }
   
   public void setStatistique(
   int total_lot,
   int moins_1000,
   int entre_1000_10000,
   int plus_de_10000,
   int nb_lot_agricole,
   int nb_lot_commercial,
   int nb_lot_residentiel,
   int maximale_superficie,
   int val_lot_maximale){
       
   setTotallot();
   setmoins1000(moins_1000);
   set1000_10000(entre_1000_10000);
   setplus10000(plus_de_10000);
   setnbAgricole(nb_lot_agricole);
   setnbCommercial(nb_lot_commercial);
   setnbResidentiel(nb_lot_residentiel);
   setMaxSuperficie(maximale_superficie);
   setValLotMax(val_lot_maximale);
   }
   
   public void setTotallot(){
   this.total_lot=nb_lot_agricole+nb_lot_commercial+nb_lot_residentiel;
   }
   public void setmoins1000(int x){
   this.moins_1000=x;
   }
   public void set1000_10000(int x){
   this.entre_1000_10000=x;
   }
   public void setplus10000(int x){
   this.plus_de_10000=x;
   }    
   public void setnbAgricole(int x){
   this.nb_lot_agricole=x;
   }
   public void setnbCommercial(int x){
   this.nb_lot_commercial=x;
   }
   public void setnbResidentiel(int x){
   this.nb_lot_residentiel=x;
   }
   public void setMaxSuperficie(int x){
   this.maximale_superficie=x;
   }
   public void setValLotMax(int x){
   this.val_lot_maximale=x;
   }
   
   
    public int getTotallot(){
   return total_lot;
   }
   public int getmoins1000(){
   return moins_1000;
   }
   public int get1000_10000(){
   return entre_1000_10000;
   }
   public int getplus10000(){
   return plus_de_10000;
   }    
   public int getnbAgricole(){
   return nb_lot_agricole;
   }
   public int getnbCommercial(){
   return nb_lot_commercial;
   }
   public int getnbResidentiel(){
   return nb_lot_residentiel;
   }
   public int getMaxSuperficie(){
   return maximale_superficie;
   }
   public double getValLotMax(){
   return val_lot_maximale;
   }
   
   public void valeurLot(double x){
        if(x<1000){
        this.moins_1000=moins_1000+1;  
        }
        if(x>=1000 && x < 10000){
        this.entre_1000_10000=entre_1000_10000+1;
        }
        if(x>=10000){
        this.plus_de_10000=plus_de_10000+1;
        }
    }
   
   public void maxSupperficie(int x){
        if(x>maximale_superficie){
        this.maximale_superficie=x;
        }  
    }
   
   public void MaxValeurLot(double x){
           if(x>val_lot_maximale){
        this.val_lot_maximale=x;
        }  
    }
   
   public void Agricole(){
       setnbAgricole(nb_lot_agricole+1);
   }
   public void Commerciale(){
       setnbCommercial(nb_lot_commercial+1);
   }
   public void Residentiel(){
      setnbResidentiel(nb_lot_residentiel+1);
   }
   public void lotTypes(int x){
       setTotallot();
       if(x==0){
           Agricole();
       }
       if(x==2){
           Commerciale();
       }
       if(x==1){
           Residentiel();
       }
   }
   public String toString(){
    return ("\n"+StatistiqueTraitement.message_statistique[0]       +" :\t"+total_lot+
            "\n"+StatistiqueTraitement.message_statistique[1]       +" :\t\t"+moins_1000+
            "\n"+StatistiqueTraitement.message_statistique[2]       +" :\t\t\t"+entre_1000_10000+
            "\n"+StatistiqueTraitement.message_statistique[3]       +" :\t\t"+plus_de_10000+
            "\n"+StatistiqueTraitement.message_statistique[4]       +" :\t"+nb_lot_agricole+
            "\n"+StatistiqueTraitement.message_statistique[5]       +" :\t"+nb_lot_commercial+
            "\n"+StatistiqueTraitement.message_statistique[6]       +" :\t"+nb_lot_residentiel+
            "\n"+StatistiqueTraitement.message_statistique[7]       +" :\t"+maximale_superficie+
            "\n"+StatistiqueTraitement.message_statistique[8]       +" :"+val_lot_maximale+" $\n"
            );    
    
    } 
}

  
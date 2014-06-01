package OOT_SS14_DC.Spieler;

import java.util.*;

import OOT_SS14_DC.Spielkarton.*;

public class Mensch extends Spieler {

    public Mensch(String Name, Ecke ecke, String symbol) {
        super(Name, ecke, symbol);
    }

    @Override
    public Feld spielsteinWaehlen(Feld[] feld) {
        int wahlmöglichkeit = 2;
        System.out.print("\n1 = AUSSETZEN\t");
        for (Feld iterator : feld) {
            System.out.print(wahlmöglichkeit +" = "+  (iterator.getIndexZeile() + 1)
                    + "/"+ (iterator.getIndexSpalte() +1)+"  \t");
            if(wahlmöglichkeit%5 == 0){
                System.out.println("\n");
            }
            wahlmöglichkeit++;
        }
        System.out.println("Bitte Spielstein auswählen der bewegt werden soll");
        Scanner eingabe = new Scanner(System.in);
        int auswahl;
        try{
        auswahl = eingabe.nextInt();
        }catch(InputMismatchException ex){
            auswahl = -1;
        }
        while (auswahl <= 0 || auswahl > wahlmöglichkeit) {
            System.out.println("Es wurde kein gültiger Spielstein gewählt,"
                    + " versuchen sie es erneut");
            try{
                auswahl = eingabe.nextInt();
            }catch(InputMismatchException ex){
                auswahl = -1;
            }
        }
        
        if(auswahl == 1){
            return null;
        }else{
            return feld[auswahl-2];
        }
    }

    
    @Override
    public Feld zielWaehlen(LinkedList<Feld> ziel) {
    	
        
        
        int wahlmöglichkeit = 2;
        System.out.print("\n1 = NEUER SPIELSTEIN\t");
        for (Feld iterator : ziel) {
            System.out.print(wahlmöglichkeit +" = "+  (iterator.getIndexZeile() + 1)
                + "/"+ (iterator.getIndexSpalte()+1)+"  \t");
            wahlmöglichkeit++;
        if(wahlmöglichkeit%5 == 0){
            System.out.println("\n");
            }
           
        }
        if (wahlmöglichkeit%5 !=0){
            System.out.println("\n");
        }
        System.out.println("wohin soll der Stein bewegt werden?");
        Scanner eingabe = new Scanner(System.in);
        
        int auswahl;
        try{
            auswahl = eingabe.nextInt();
        }catch(InputMismatchException ex){
            auswahl = -1;
        }
        while (auswahl <= 0 || auswahl > wahlmöglichkeit) {
            System.out.println("Es wurde kein gültiger Ziel gewählt,"
                    + " versuchen sie es erneut");
            try{
                auswahl = eingabe.nextInt();
            }catch(InputMismatchException ex){
                auswahl = -1;
            }
        }
        
        
        if(auswahl == 1){
            return null;
        }else{
            return ziel.get(auswahl-2);
        }
        
    }
       
        
}

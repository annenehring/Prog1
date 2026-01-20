package Exceptions;

import Prog1Tools.IOTools;

/*
TODO: Programmieren Sie eine Methode addPositive, die zwei positive Integer addieren soll.
 Wenn nicht positive Zahlen als Parameter übergeben werden, dann soll eine IllegalArgumentException(unchecked Exception)
  geworfen werden.
 */
public class AddPositive {

    public static int addPositive(int a, int b){
        if(a<0||b<0){
            throw new IllegalArgumentException("Nur positive Zahlen bitte ");
        }else{
            return a + b;
        }
    }



    /*
    TODO: Programmieren Sie eine main-Methode, die zwei Integer von der Konsole einliest
     und damit addPositive aufruft. Bauen Sie Fehlerhandling ein, damit so lange Werte
     eingelesen werden, bis die Methode erfolgreich aufgerufen werden kann.
     */
    public static void main(String[] args) {

        try {
            int a = IOTools.readInt("gib mir den ersten Wert: ");
            int b = IOTools.readInt("gib mir den zweiten Wert: ");
            System.out.println(addPositive(a, b));
        } catch (IllegalArgumentException e) {
            System.out.println("Fehler: " + e.getMessage());
            main(args);
        }

        while (true) {
            try {
                int a = IOTools.readInt("gib mir den ersten Wert: ");
                int b = IOTools.readInt("gib mir den zweiten Wert: ");
                System.out.println(addPositive(a, b));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Fehler: " + e.getMessage());
            }

        }
    }
}

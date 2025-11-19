package Operatoren;
import Prog1Tools.IOTools;
public class Modulo{ // Klassen Kopf

   /* TODO: Schreiben Sie ein Programm, das einen Sekunden-Wert
       in einer int-Variablen sec speichert und diesen Wert in
        Jahre, Tage, Stunden, Minuten und Sekunden zerlegt.
        Das Programm soll z. B. folgendes ausgeben:
        158036521 Sekunden entsprechen:
        5 Jahren, 4 Tagen, 3 Stunden, 2 Minuten und 1 Sekunden.
    */
    public static void main(String[] args) { // Main - Methode

        long sec = 158036521;
        long years = sec/(60*60*24*365);
        sec = sec % (60*60*24*365);
        long tage = sec/(60*60*24);
        sec = sec % (60*60*24);
        long stunden = sec/(60*60);
        sec = sec % (60*60);
        long minuten = sec/60;
        sec = sec%60;
        long sekunden= sec;

        System.out.println( "158036521 Sekunden entsprechen " + years + " jahren, "+ tage + " tagen, " + stunden + " Stunden, "+ minuten + " Minuten, "+ sekunden+ " Sekunden");


    }
}

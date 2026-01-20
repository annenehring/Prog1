package Schleifen;
import Prog1Tools.IOTools;


public class DoWhile {

    public static void main(String[] args) {
        /*
        TODO: Schreibe ein kleines Programm,
         das den Benutzer solange nach einer Zahl fragt, bis er 0 eingibt.
         Dann soll die Summe aller eingegebenen Zahlen ausgegeben werden.
         */

        int eingabe;
        int sum = 0;
        do{
            eingabe = IOTools.readInt("Gib mir eine Zahl: ");
            sum += eingabe;
        }while(eingabe != 0);

        System.out.println(sum);
    }
}

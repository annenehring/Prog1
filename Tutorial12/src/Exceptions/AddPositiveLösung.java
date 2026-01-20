package Exceptions;

import Prog1Tools.IOTools;

public class AddPositiveLösung {
    /*
TODO: Programmieren Sie eine Methode addPositive, die zwei positive Integer addieren soll.
 Wenn nicht positive Zahlen als Parameter übergeben werden, dann soll eine IllegalArgumentException
  geworfen werden.
 */
        public static int addPositive(int i1, int i2) {
            if (i1 >= 0 && i2 >= 0) {
                return i1 + i2;
            } else {
                throw new IllegalArgumentException("Both numbers must be positive");
            }
        }

        /*
        TODO: Programmieren Sie eine main-Methode, die zwei Integer von der Konsole einliest
         und damit addPositive aufruft. Bauen Sie Fehlerhandling ein, damit so lange Werte
         eingelesen werden, bis die Methode erfolgreich aufgerufen werden kann.
         */
        public static void main(String[] args) {
            while (true) {
                try {
                    System.out.println(addPositive(IOTools.readInt("Enter the first number: "), IOTools.readInt("Enter the second number: ")));
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Please try again");
                }
            }
        }
}

package Typecasts;

public class TypecastÜbung {
    public static void main(String[] args) {
        double a = 5.0;
        double b = a;
        /*
        INFO: Gleicher Datentyp
         -> kein Typecast notwendig
         */

        int c = 5;
        long d = c;
        /*
        INFO: long ist größerer Datentyp als int
         -> Implizite Typecasten
         */
        int f = 3;
        short z = (short) f;
        /*
        INFO: shprt ist kleinerer Datentyp als int
         -> Explizites Typecasten
         -> Informationen könnne verloren gehen
         */
        int x = 65;
        char t = (char) x;
        System.out.println("x: " + x);
        System.out.println("(char) x: " + t);

        /*
        INFO: Wir sagen: behandle die Zahl 65 nicht mehr als Zahl,
          sondern als Zeichen.( ASCII-Code-Tabelle)
         */


    }
}

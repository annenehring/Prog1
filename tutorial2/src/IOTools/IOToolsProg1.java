package IOTools;
import Prog1Tools.IOTools;

public class IOToolsProg1 {
    public static void main(String[] args) {
/*
    TODO: Lese aus dem Terminal 2 Werte ein, die addiert werden sollen
     und gebe das Ergebnis zurück.
*/
        int x = IOTools.readInt("Gebe mir ein x: ");
        int y = IOTools.readInt("Gebe mir ein y: ");
        int ergebnis = x +y;
        System.out.println( x + " + " + y + " = "+ ergebnis);


        /*
    TODO: Wir wollen die Fläche eines Rechtecks berechen. Schreibe dafür
     ein Programm, welches die Länge und die Breite aus dem Terminal einliest
     und die Fläche zurück gibt. (wähle geeignete Datentypen für
     l = 200 000 und b = 300 000)
     */
        long l = IOTools.readLong("Gebe mir ein l: ");
        long b = IOTools.readLong("Gebe mir ein b: ");
        long F =l*b;
        System.out.println( l + " + " + b + " = "+ F);


    }

}

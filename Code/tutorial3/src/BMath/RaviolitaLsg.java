package BMath;
import Prog1Tools.IOTools;

public class RaviolitaLsg {
    public static void main(String[] args) {
/*
        TODO: Aufgabe 5 Tut2:
         */
        double u = IOTools.readDouble("u:");
        double h = IOTools.readDouble("h:");



        double l = Math.sqrt(Math.pow(u,2)+ Math.pow(h,2));
        System.out.println("Die Länge der Diagonalen ist: " +l);
        double d = u/Math.PI;
        System.out.println("Der Durchmesser des Bodens ist: " + d);
        double fB = Math.PI * Math.pow((d/2),2);
        System.out.println("Die Fläche des Dosenbodens ist : "+ fB);
        double fM = u *h;
        System.out.println("Die Mantelfläche ist: "+ fM);
        double fG = 2 * fB + fM;
        System.out.println("Die Gesamtfläche der Dose ist: " + fG);
        double v = fB *h;
        System.out.println("Das Volumen ist :" + v);




    }
}

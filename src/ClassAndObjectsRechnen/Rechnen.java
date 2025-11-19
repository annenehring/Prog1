package ClassAndObjectsRechnen;
import Prog1Tools.IOTools;
public class Rechnen {

    /**
     * Klassenemthoden, weil sie direkt mit übergebenen Parametern arbeiten, statt an einem bestimmten Bruchobjekt
     * @param a erster Parameter
     * @param b zweiter Paramter
     * @return größte teiler
     */
    public static int ggt(int a, int b){
        if ( a == 0){
            return b;
        }else if(b == 0){
            return a;
        }
        int x = Math.abs(a);
        int y = Math.abs(b);

        while(x != y){
            if(x > y){
                x-=y;
            }else if(y> x){
                y-= x;
            }
        }
        return x;
    }

    public static void einlesen(Bruchzahl b){
        do {
            b.nenner = IOTools.readInt("Nenner: ");
        }while(b.nenner == 0);
        b.zaehler = IOTools.readInt("Zaehler: ");

    }
    public static void ausgeben(Bruchzahl b){
        System.out.println(b.zaehler + "/"+ b.nenner);
    }

    public static double wert(Bruchzahl b){
        return (double) b.zaehler/b.nenner;
    }

    public static Bruchzahl kehrwert(Bruchzahl b){
        Bruchzahl a = new Bruchzahl();
        a.nenner = b.zaehler;
        a.zaehler = b.nenner;
        return a;
    }

    public static Bruchzahl neg(Bruchzahl b){

        b.zaehler = -b.zaehler;
        return b;
    }




    public static void main(String[] args) {

        System.out.println(ggt(100,27));
        Bruchzahl b = new Bruchzahl();
        b.nenner = 5;
        b.zaehler = 6;
        ausgeben(b);




    }
}

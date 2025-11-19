package ClassAndObjectsRechnen;
import Prog1Tools.IOTools;
public class Rechnen_lsg {

    public static int ggt(int a, int b){

        if ( a== 0){
            return b;
        }else if( b == 0){
            return a ;
        }
        int x = Math.abs(a);
        int y = Math.abs(b);
        while(x != y ) {
            if (x>y){
                x-=y;
            }else{
                y-=x;
            }

        }
        return x;
    }

    public static void einlesen(Bruchzahl b){
        do {
            b.nenner = IOTools.readInt("Nenner: ");
        }while(b.nenner == 0);
            b.zaehler = IOTools.readInt("Zähler: ");

    }

    public static void ausgeben(Bruchzahl b){

        System.out.println(b.zaehler + " / " + b.nenner);
    }

    public static double wert(Bruchzahl b ) {

        return (double) b.zaehler/b.nenner;
    }
    public static Bruchzahl kehrwert(Bruchzahl b){
        Bruchzahl result = new Bruchzahl();
       result.zaehler = b.nenner;
       result.nenner = b.zaehler;
       return result;
    }
    public static Bruchzahl neg(Bruchzahl b){
        Bruchzahl result = new Bruchzahl();
        result.zaehler = -b.zaehler;
        result.nenner = b.nenner;
        return result;
    }
    public static Bruchzahl kuerzen(Bruchzahl b) {
        Bruchzahl result = new Bruchzahl();
        int teiler = ggt(b.zaehler, b.nenner);

        result.zaehler = b.zaehler / teiler;
        result.nenner = b.nenner / teiler;

        // Falls beide negativ sind: Vorzeichen drehen
        if (result.zaehler < 0 && result.nenner < 0) {
            result.zaehler *= -1;
            result.nenner *= -1;
        }
        return result;
    }

    public static Bruchzahl mul(Bruchzahl a, Bruchzahl b){
        Bruchzahl result = new Bruchzahl();
       result.nenner = a.nenner * b.nenner;
       result.zaehler = a.zaehler * b.zaehler;
       return kuerzen(result);

    }

    public static Bruchzahl div(Bruchzahl a, Bruchzahl b) {
        Bruchzahl kehrwertVonB = kehrwert(b); // vorhandene Methode
        return mul(a, kehrwertVonB);          // vorhandene Methode mul wiederverwenden
    }

    public static Bruchzahl add(Bruchzahl a, Bruchzahl b) {
        Bruchzahl result = new Bruchzahl();
        result.nenner = a.nenner * b.nenner;
        result.zaehler = a.zaehler * b.nenner + b.zaehler * a.nenner;

        return kuerzen(result); // wieder vorhandene Methode nutzen
    }

    public static Bruchzahl sub(Bruchzahl a, Bruchzahl b) {
        Bruchzahl negB = neg(b); // negativen Wert von b bilden
        return add(a, negB);     // wieder vorhandene Methode add nutzen
    }



    public static void main(String[] args) {
        System.out.println( ggt(8,6));
        Bruchzahl bruchzahl = new Bruchzahl();
        einlesen(bruchzahl);
        ausgeben(bruchzahl);
        System.out.println(wert(bruchzahl));
        Bruchzahl kehr = kehrwert(bruchzahl);
        System.out.print("Kehrwert: ");
        ausgeben(kehr);
        Bruchzahl negativ = neg(bruchzahl);
        System.out.print("Negativer Bruch: ");
        ausgeben(negativ);
        Bruchzahl gekuerzt = kuerzen(bruchzahl);
        System.out.print("Gekürzter Bruch: ");
        ausgeben(gekuerzt);

        Bruchzahl b1 = new Bruchzahl();
        b1.zaehler = 1;
        b1.nenner = 2;

        Bruchzahl b2 = new Bruchzahl();
        b2.zaehler = 3;
        b2.nenner = 4;

        Bruchzahl produkt = mul(b1,b2);
        System.out.print("a * b = ");
        ausgeben(produkt);

        Bruchzahl quotient = div(b1, b2);
        System.out.print("a / b = ");
        ausgeben(quotient);

        Bruchzahl summe = add(b1, b2);
        System.out.print("a + b = ");
        ausgeben(summe);

        Bruchzahl differenz = sub(b1, b2);
        System.out.print("a - b = ");
        ausgeben(differenz);

    }



    }



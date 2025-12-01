package Wiederholung;

public class Bruchzahl {
    int nenner;
    int zaehler;


    public Bruchzahl(int zaehler, int nenner){
        this.zaehler = zaehler;
        this.nenner = nenner;
        if(nenner == 0) {
            this.nenner = 1;
            System.out.println("Nenner darf nicht null sein -> ist jetzt 1");
        }
    }

    //INFO: Nicht die Aufgabe, aber hier sind die Methoden als Instanzmethoden
    // -> sie müssten in der selben Klasse sein

    public void ausgeben() {
        System.out.println(zaehler + "/" + nenner);
    }

    public double wert() {
        return (double) zaehler / nenner;
    }

    public Bruchzahl kehrwert() {
        int temp = zaehler;
        zaehler = nenner;
        nenner = temp;
        return this;
    }

    public Bruchzahl neg() {
        zaehler = -zaehler;
        return this;
    }

    public static void main(String[] args) {
        System.out.println("Hallo");
        Bruchzahl b = new Bruchzahl(2 , 0);
        System.out.println(b.wert());
        System.out.println("Kehrwert: " + b.kehrwert().wert());

        Bruchzahl k = b.kehrwert();
        k.ausgeben();
    }
}

package Beispiele;


public class Straßenfahrzeug extends Fahrzeug {
    protected int anzRäder;

    //muss einen konstruktor haben der den Kosntruktor der Oberklasse aufruft
    public Straßenfahrzeug(int geschwindigkeit, String farbe, int anzRäder) {
        super(geschwindigkeit, farbe);
        this.anzRäder = anzRäder;

    }

    @Override// muss man nicht, aber kann man -> sagt Compiler methode der oberklasse soll überschrieben werden
    void beschreiben() {
        super.beschreiben(); // Oberklassenmethode aufrufen
        System.out.println("... und es ist ein Straßenfahrzeug!");
    }

    public static void main(String[] args) {

        Straßenfahrzeug a = new Straßenfahrzeug(3, "blau", 3);
        a.paint("rot");
        System.out.println(a.farbe);
        a.beschreiben();


    }
}

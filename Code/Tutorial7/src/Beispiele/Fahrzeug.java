package Beispiele;

public class Fahrzeug {
    protected int geschwindigkeit;
    protected String farbe;

    public Fahrzeug(int geschwindigkeit, String farbe){
        this.geschwindigkeit = geschwindigkeit;
        this.farbe = farbe;
    }
    void paint(String farbe){
        this.farbe = farbe;
        System.out.println("painting");
    }
    void beschreiben() {
        System.out.println("Fahrzeug mit " + geschwindigkeit + " km/h");
    }

}

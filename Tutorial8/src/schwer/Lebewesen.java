package schwer;

abstract class Lebewesen {
    protected String name;
    protected char symbol;

    public Lebewesen(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    // Wird in den Unterklassen konkret umgesetzt
    abstract void aktion();

    // Wird zum Anzeigen im Spielfeld benutzt
    void anzeigen() {
        System.out.print(symbol);
    }
}
class Mensch extends Lebewesen {

    public Mensch(String name) {
        super(name, 'M'); // ruft Konstruktor der Oberklasse auf
    }

    @Override
    void aktion() {
        System.out.println("Mensch " + name + " sagt: Hallo!");
    }
}

class Hund extends Lebewesen {

    public Hund(String name) {
        super(name, 'H');
    }

    @Override
    void aktion() {
        System.out.println("Hund " + name + " macht Geräusche!");
    }
}
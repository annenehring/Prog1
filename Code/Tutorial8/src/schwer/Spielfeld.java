package schwer;


public class Spielfeld {

    static Lebewesen[][] feld = new Lebewesen[3][3];

    public static void main(String[] args) {

        feld[0][0] = new Mensch("Anna");
        feld[0][2] = new Hund("Bello");
        feld[1][1] = new Mensch("Max");

        anzeigen();
        aktionenAusführen();

    }

    public static void anzeigen() {
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                if (feld[i][j] == null) {
                    System.out.print(". ");
                } else {
                    feld[i][j].anzeigen();
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Ruft für jedes Lebewesen im Feld aktion() auf
    public static void aktionenAusführen() {
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                if (feld[i][j] != null) {
                    feld[i][j].aktion();  // dynamic binding!
                }
            }
        }
    }

}

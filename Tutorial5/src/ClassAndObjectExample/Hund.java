package ClassAndObjectExample;

public class Hund {
    /*
    TODO: Die Klasse soll: Zwei Instanzvariablen haben (private):
     name (String)
     alter (int)
     Eine Konstante (static final): MAX_AGE = 20 -> maximal mögliches Hundealter
     Getter und Setter
     Setter soll verhindern, dass alter größer als MAX_AGE wird
     Methoden:
     bellen() -> gibt "wuff wuff" aus
     In Main sollen 2 Hunde erzeugt werden.
     */

    private String name;
    private int alter;
    static final int Max_age = 20;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAlter(){
        return this.alter;
    }

    public void setAlter(int alter) {
        if (alter <= Max_age && alter >= 0) {
            this.alter = alter;
        } else {
            System.out.println("Das Alter muss positiv sein und darf 20 nicht überschreiten");
        }
    }

    //INFO: Instanzmethoden
    public void bellen(){
            System.out.println("wuff wuff");
        }

    //INFO: muss Intanzmethode sein, weil hier name und alter gebraucht wird und die Methode sonst nicht weiß von welchem Objekt
    void info() {
        System.out.println("Ich bin " + name + " und ich bin " + alter + " Jahre alt.");
    }


    public static void main(String[] args) {
        Hund h1 = new Hund();
        h1.setName("Bello"); // wir können auch h1.name = "Bello"; schreiben, weil wir in der gleichen Klasse sind
        h1.setAlter(5); // h1.alter = 5; geht auch (dann wird nicht geprüft ob < 20)

        Hund h2 = new Hund();
        h2.setName("Anna");
        h2.setAlter(18);
        h2.bellen();

        h1.info();
        h2.info();


    }

}

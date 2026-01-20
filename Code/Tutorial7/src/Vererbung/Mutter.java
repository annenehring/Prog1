package Vererbung;

/*
TODO: Erstellen Sie eine Klasse Mutter mit den Attributen name und
 alter  sowie einem Konstruktor, der beide Werte setzt.
 Implementieren Sie außerdem eine Methode vorstellen(), die eine kurze Beschreibung ausgibt.

 */
class Mutter {

    String name;
    int alter;

    public Mutter(String name, int alter){
        this.name = name;
        this.alter = alter;
    }

    public void vorstellen(){
        System.out.print("Ich bin " + this.name + " und bin " + this.alter + "Jahre alt");
    }

    public void leaving(){

    }

}
/*
TODO: Erstellen Sie anschließend eine Klasse Kind, die von Mutter erbt und zusätzlich das Attribut
 lieblingsSpielzeug besitzt. Schreiben Sie einen Konstruktor, der alle drei Werte übernimmt
  und den Konstruktor der Oberklasse mit super(...) aufruft. Überschreiben Sie die Methode vorstellen(),
  sodass die Ausgabe zusätzlich das Lieblingsspielzeug des Kindes enthält.
 */
class Kind extends Mutter {

    String lieblingsS;

    public Kind(String name, int age, String lieblingsS){
        super(name,age);
        this.lieblingsS = lieblingsS;
    }

   @Override
    public void vorstellen(){
        super.vorstellen();
        System.out.println(" und mein Lieblingsspielzeug ist: " + lieblingsS);
    }

    public void paint(){
        System.out.println("painting ... ");
    }



    public static void main(String[] args) {
        Kind a = new Kind("Paul", 3, "Autos");
        a.vorstellen();

        Mutter b = new Kind("Paul", 3, "Autos");
        b.vorstellen();
        b.leaving();

    }



}


package Vererbung;

/*
TODO: Erstellen Sie eine abstrakte Klasse Tier mit dem Attribut name und einem Konstruktor,
  der dieses initialisiert. Definieren Sie eine abstrakte Methode lautGeben() sowie eine konkrete Methode beschreiben(),
  die den Namen des Tieres ausgibt.

 */
 abstract class Tier {

     String name;

     public Tier(String name){
         this.name = name;
     }

     abstract void lautGeben();

     protected void beschreiben(){
         System.out.print(" Das ist ein " + this.name);
     }


}


 /*
 TODO: Erstellen Sie die Klasse Katze, die von Tier erbt, und fügen Sie das Attribut anzahlLeben hinzu.
  Schreiben Sie einen Konstruktor, der sowohl den Namen als auch die Anzahl der Leben setzt.
  Implementieren Sie lautGeben() so, dass "Miau" ausgegeben wird. Überschreiben Sie außerdem beschreiben(),
  sodass zusätzlich die Anzahl der Leben angezeigt wird.

  */
class Katze extends Tier{

    int anzLeben;

    public Katze(String name, int anzLeben){
        super(name);
        this.anzLeben = anzLeben;

    }

    @Override
     public void lautGeben(){
        System.out.println("Miau");
    }

    @Override
      public void beschreiben(){
        super.beschreiben();
        System.out.println(" und hat " + this.anzLeben + " Leben");
    }

     public static void main(String[] args) {

         Katze a = new Katze("Lisa", 9);
     }
}

/*
TODO: erstellen Sie eine Klasse KatzenBaby und lassen Sie sie sinnvoll erben.
 Kann die Klasse beschreiben() Überschrieben?
 */

class Katzenbaby extends Katze{

    public Katzenbaby(String name, int anzLeben){
        super(name,anzLeben);
    }

    @Override
    public void beschreiben(){
        super.beschreiben();
    }

}




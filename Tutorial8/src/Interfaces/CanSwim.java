package Interfaces;

//INFO: Interface beschriebt Verhalten
/*INFO:
   Alle Methoden sind automatisch public und abstract.
   Alle Variablen wären public static final (Konstanten)
   -> jede Klasse kann verwenden

 */
public interface CanSwim{
    public static final int gewicht = 3;
    void swim();

    /*
    INFO: Manchmal hat man Funktionen, die thematisch zu einem Interface passen,
     aber NICHT zu einer bestimmten Implementation.
     --> Kann nicht überschrieben werden
     Aufruf: boolean ok = CanSwim.isValidDepth(5);
     */
    static boolean isValidDepth(int d) {
        return d >= 0;
    }
    default void foo() {
        System.out.println("foo");
    }

    //INFO: Klassen, die CanSwim implementieren erben Methode

}
class Duck implements CanSwim {


    @Override
    public void swim() { System.out.println("quack!"); }
}

class Fish implements CanSwim {

    @Override
    public void swim() { System.out.println("blub."); }
}

class HouseBoat implements CanSwim {

    @Override
    public void swim() { System.out.println("I am sailing!"); }

    //INFO: Coding to an Interface
    static void letThemSwim(CanSwim s) { // CanSwim sagt --> alles was du mir gibst muss swim methode haben
        s.swim();
    }

    public static void main(String[] args) {
        CanSwim d = new Duck();
        d.swim(); // dynamic binding -> entscheidet zur runtime welches swim


        letThemSwim(new Duck());
        letThemSwim(new Fish());
        letThemSwim(new HouseBoat());

        d.foo();
        d = new Duck();
        d = new Fish();
        d.swim();



        // abszrakte klassen könenn das auch
    }
}
package Threads;/*
TODO:
 a) Sie sollen im Auftrag der Verwaltung des kinderreichen Bezirks Prenzlzwerg einen konfliktfreien
 Kinderspielplatz simulieren. Untenstehender Code wurde bereits von Ihrem Kollegen
 vorbereitet, der allerdings im Gegensatz zu Ihnen nicht verstanden hat, wie man in Java korrekt
 mit Threads programmiert. Ergänzen Sie in der Methode backeKuchen() die notwendigen
 Codezeilen, die sicherstellen, dass immer nur ein Threads.Kind gleichzeitig mithilfe der Förmchen- und
 Schaufelobjekte einen Sandkuchen backen kann. D. h., für den Vorgang des Sandkuchenbackens
 benötigt ein Threads.Kind alleinigen Zugriff auf sowohl die Threads.Schaufel als auch das Förmchen. Achten Sie
 darauf, möglichst effizienten Code zu schreiben.
 */

import java.util.HashMap;
import java.util.Map;

public class Sandkasten {
    private final Foermchen foermchen = new Foermchen();
    private final Schaufel schaufel = new Schaufel();
    private final static Sandkasten sandkasten = new Sandkasten();
    private Sandkasten() {
    }
    public static Sandkasten getSandkasten() {
        return sandkasten;
    }
    public void backeKuchen() {
        synchronized (foermchen) {
            synchronized (schaufel) {
                foermchen.backeKuchen();
                schaufel.backeKuchen();
            }
        }

    }
    // weitere Methoden, die exklusiven Zugriff auf foermchen oder schaufel benötigen
// ...
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++)
            new Kind("Threads.Kind-" +i).start();
    }
}
class Foermchen {
    public void backeKuchen() {
        System.out.println(Thread.currentThread().getName()
                + " bäckt Kuchen mit Förmchen!");
    }
}
class Schaufel {
    public void backeKuchen() {
        System.out.println(Thread.currentThread().getName()
                + " bäckt Kuchen mit Threads.Schaufel!");
    }
}
class Kind extends Thread {
    public Kind(String name){
        super.setName(name);
    }
    public void run() {
        for (int i = 0; i < 100; i++) {
            Sandkasten.getSandkasten().backeKuchen();
           try {
                Thread.sleep((long) (Math.random() * 100));
           } catch (InterruptedException e) {
           }
        }
    }
}

/*
TODO:
  Stellen Sie sich vor, dass in einem Programm mehrere Instanzen von Threads.Sandkasten parallel benutzt
  werden. Welche Auswirkung hätte hier ein synchronized-Block, der eine Klassenvariable als
  Lock benutzt? Antworten Sie in einem Satz.
 */

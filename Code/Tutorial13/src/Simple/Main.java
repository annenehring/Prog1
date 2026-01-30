package Simple;

/*
TODO: Erstellen Sie eine main-Methode, die zwei parallel laufende Threads erstellt: einer mit
 dem SimpleThread, einer mit SimpleRunnable. Sie könnten im SimpleThread die Methode start aufrufen.
 */

public class Main {
    public static void main(String[] args) {

    Thread t1 = new SimpleThread();
    Thread t2 = new Thread(new SimpleRunnable());

    t1.start();
    t2.start();
    }
}

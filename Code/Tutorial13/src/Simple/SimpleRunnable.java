package Simple;
/*
TODO:Aufgabe 3: Thread vs. Runnable
 Programmierens Sie eine Klasse SimpleThread, die von Thread erbt.
 Überschreiben Sie die run-Methode, sodass ”I’m a simple Thread“ ausgegeben wird.
 Programmieren Sie auch eine Klasse SimpleRunnable, die Runnable implementiert.
 Überschreiben Sie erneut die run-Methode, sodass ”I’m a simple Runnable“
 ausgegeben wird. Erstellen Sie eine main-Methode, die zwei parallel laufende Threads erstellt: einer mit
 dem SimpleThread, einer mit SimpleRunnable. Sie könnten im SimpleThread die Methode start aufrufen.
 */
class SimpleRunnable implements Runnable{


    @Override
    public void run() {
        System.out.println("I am a simple Runnable ");
    }
}

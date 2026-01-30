package Simple;

/*
TODO:Passen Sie SimpleRunnable wie folgt an.
 • Die Klasse soll weiter den Text ausgeben, dann aber 100 ms schlafen und den Text erneut ausgeben.
 • Wenn der Thread interrupted wird, soll dies auf der Konsole ausgegeben werden und das Programm
 beendet werden.
 Schreiben Sie nun eine main-Methode, in der eine Instanz der Klasse gestartet und nach einer Sekunde
 wieder interrupted wird.

 INFO: wichtige Methoden:
  Thread.currentThread().isInterrupted();
  Thread.sleep("Zeit in millisek."); -> lässt schlafen (warten)
  Thread.currentThread().interrupt(); -> unterbricht Thread

 */
public class SimpleRunnableInterruptable implements Runnable{


    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()){
            System.out.println("I am a simple Runnable");
            try {
                Thread.sleep(100);

            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println("wurde Interrupted");
            }
        }


    }

    public static void main(String[] args) throws InterruptedException {

        Thread r1 = new Thread(new SimpleRunnableInterruptable());
        r1.start();

        Thread.sleep(1000);

        r1.interrupt();
    }


}


package ProducerConsumer;

import java.util.LinkedList;
import java.util.List;

public class MyBlockingQueue{

    private List<Integer> queue = new LinkedList<>();
    private final int limit = 10;

    public void enqueue(int item) throws InterruptedException {

       synchronized (queue) {

            while (queue.size() == limit) {
                // Queue voll → Producer wartet
                queue.wait();
            }

            // Element hinzufügen
            queue.add(item);
            System.out.println("Thread produziert: " + item);

            // Consumer wecken (Queue ist nicht mehr leer)
            queue.notifyAll();
        }
    }

    public int dequeue() throws InterruptedException {

        synchronized (queue) {

            while (queue.isEmpty()) {
                // Queue leer → Consumer wartet
                queue.wait();
            }

            int item = queue.remove(0);
            System.out.println("Thread konsumiert: " + item);

            // Producer wecken (Queue ist nicht mehr voll)
            queue.notifyAll();

            return item;
        }
    }

}

/*
TODO: Teil a) Producer
 Implementieren Sie eine Klasse Producer, die das Interface Runnable implementiert.
 Der Producer soll:
 eine Referenz auf ein MyBlockingQueue-Objekt besitzen,
 in der run()-Methode 20 Ganzzahlen (z. B. 0 bis 19) in die Queue einfügen,
 nach jedem Einfügen den produzierten Wert auf der Konsole ausgeben,
 nach jedem Einfügen kurz warten (z. B. mit Thread.sleep).
 */
class Producer implements Runnable {

    private MyBlockingQueue queue;

    public Producer(MyBlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) { // produziert max 10
                queue.enqueue(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

/*
TODO: Teil b) Consumer
 Implementieren Sie eine Klasse Consumer, die ebenfalls das Interface Runnable implementiert.
 Der Consumer soll:
 eine Referenz auf dasselbe MyBlockingQueue-Objekt besitzen,
 in einer Schleife fortlaufend Elemente aus der Queue entnehmen,
 jedes entnommene Element auf der Konsole ausgeben,
 nach jeder Entnahme kurz warten (z. B. mit Thread.sleep).
 */
class Consumer implements Runnable {

    private MyBlockingQueue queue;

    public Consumer(MyBlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) { // consumiert unendlich
                queue.dequeue();
                Thread.sleep(800);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /*
    TODO: Teil c) Hauptprogramm
     Implementieren Sie eine main-Methode, in der:
     Ein Objekt der Klasse MyBlockingQueue mit einer Kapazität von 10 erstellt wird.
     Ein Producer-Thread und ein Consumer-Thread erzeugt werden, die dieselbe Queue verwenden.
     Beide Threads gestartet werden.
     Das Hauptprogramm für einige Sekunden weiterläuft, bevor es sich beendet.
     */
    public static void main(String[] args) throws InterruptedException {

        MyBlockingQueue queue = new MyBlockingQueue();

        Thread producer1 = new Thread(new Producer(queue), "Producer-1");

        Thread consumer1 = new Thread(new Consumer(queue), "Consumer-1");

        producer1.start();
        consumer1.start();


        Thread.sleep(3000); // Programm läuft 3 Sekunden -> dann fertig
        // Was apssiert wenn consumer1.interrupt()? /join()
        //Threads terminieren nie
        System.out.println("Simple.Main beendet sich");
    }
}

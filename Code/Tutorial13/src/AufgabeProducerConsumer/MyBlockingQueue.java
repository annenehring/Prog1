package AufgabeProducerConsumer;

import java.util.LinkedList;
import java.util.List;

public class MyBlockingQueue {

    private List<Integer> queue = new LinkedList<>();
    private final int limit = 10;

    public void enqueue(int item) throws InterruptedException {

        synchronized (queue) {
            while (queue.size() == limit) {
                queue.wait();
            }

            queue.add(item);
            System.out.println("produziert "+ item);
            queue.notifyAll();
        }

    }
    public int dequeue() throws InterruptedException {

        synchronized (queue) {
            while (queue.isEmpty()) {
                queue.wait();
            }

            int item = queue.remove(0);
            System.out.println("konsumiert " + item);
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
 in der run()-Methode 10 Ganzzahlen (z. B. 0 bis 10) in die Queue einfügen,
 nach jedem Einfügen kurz warten (z. B. mit Thread.sleep).
 */

class Producer implements Runnable{

    private MyBlockingQueue queue;

    public Producer(MyBlockingQueue queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
        for(int i = 0; i< 10; i++){
                queue.enqueue(i);
                Thread.sleep(300);
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
            while (true) {
                queue.dequeue();
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }


     /*
    TODO: Teil c) Hauptprogramm
     Implementieren Sie eine main-Methode, in der:
     Ein Objekt der Klasse MyBlockingQueue erstellt wird.(Kapazität ist automatisch 10)
     Ein Producer-Thread und ein Consumer-Thread erzeugt werden, die dieselbe Queue verwenden.
     Beide Threads gestartet werden.
     Das Hauptprogramm für einige Sekunden weiterläuft, bevor es sich beendet.
     */
     public static void main(String[] args) throws InterruptedException {

         MyBlockingQueue queue = new MyBlockingQueue();

         Thread t1 = new Thread(new Producer(queue));
         Thread t2 = new Thread(new Consumer(queue));

         t1.start();
         t2.start();

         Thread.sleep(3000);

         System.out.println("Main Thread ist fertig");
     }
}



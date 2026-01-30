//Race Conditions
/*
TODO: Implementieren Sie ein Java-Programm, das eine Race Condition demonstriert.
 Die Klasse Counter ist vorgegeben (Sie enthält einen ganzzahligen Zähler und eine Methode increment(), welche den Zähler um eins erhöht.)
 -> Implementieren Sie eine Klasse, die das Interface Runnable implementiert.
 Diese Klasse soll in ihrer run()-Methode den Zähler 100 000-mal erhöhen.
 -> Erzeugen Sie in der main-Methode zwei Threads, die denselben Counter verwenden, und starten Sie diese Threads.
 Warten Sie mithilfe von join() auf die Beendigung beider Threads.
 -> Geben Sie anschließend den erwarteten Wert sowie den tatsächlich erreichten Wert des Zählers auf der Konsole aus.

INFO: t1.join(); in der Main Methode bedeutet: Der Main Thread soll warten bis t1 fertig ist
 -> sonst läuft Main zu schnell durch
 */
class Counter {
    int value = 0;

    public void increment() {
        value++;
    }
}

class CounterRunnable implements Runnable {

    private Counter counter;

    public CounterRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            counter.increment();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread t1 = new Thread(new CounterRunnable(counter));
        Thread t2 = new Thread(new CounterRunnable(counter));

        t1.start();
        t2.start();

        t1.join(); //Der aufrufende Thread wartet, bis t fertig ist.
        t2.join(); // ohne das könnte main zu früh weiter gehen

        System.out.println("Erwartet: 200000");
        System.out.println("Ergebnis: " + counter.value);
    }
}


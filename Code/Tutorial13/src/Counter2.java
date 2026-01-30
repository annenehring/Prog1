/*
TODO: Implementieren Sie ein Java-Programm, das eine Race Condition demonstriert.
 Die Klasse Counter ist vorgegeben (Sie enthält einen ganzzahligen Zähler und eine Methode increment(),
 welche den Zähler um eins erhöht.)
 -> Implementieren Sie eine Klasse, die das Interface Runnable implementiert.
 Diese Klasse soll in ihrer run()-Methode den Zähler 100 000-mal erhöhen.
 -> Erzeugen Sie in der main-Methode zwei Threads, die denselben Counter verwenden, und starten Sie diese Threads.
 Warten Sie mithilfe von join() auf die Beendigung beider Threads.
 -> Geben Sie anschließend den erwarteten Wert sowie den tatsächlich erreichten Wert des Zählers auf der Konsole aus.

INFO: t1.join(); in der Main Methode bedeutet: Der Main Thread soll warten bis t1 fertig ist
 -> sonst läuft Main zu schnell durch
 */
class Counter2 {
    int value = 0;

    public void increment() {
        value++;
    }
}
class CounterRunnable2 implements Runnable {

    private Counter2 counter;

    public CounterRunnable2(Counter2 counter) {
        this.counter = counter;
    }
    @Override
    public void run() {
        for(int i = 1; i< 100000; i++){
            counter.increment();
        }


    }

    public static void main(String[] args)  throws InterruptedException{
        Counter2 c2 = new Counter2();

        Thread t1 = new Thread(new CounterRunnable2(c2));
        Thread t2 = new Thread(new CounterRunnable2(c2));

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(c2.value);
        System.out.println("200000");
    }
}

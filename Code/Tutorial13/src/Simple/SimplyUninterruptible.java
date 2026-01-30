package Simple;

public class SimplyUninterruptible implements Runnable {

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("I'm a simple Runnable.");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Nein!");
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new SimplyUninterruptible());
        t.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();
        System.exit(1);
    }

    // Stopping is possible via calling System.exit(1) from another thread.

}

package Interfaces;

/*
TODO: Erstelle ein Interface PaymentProvider mit der Methode pay(double amount)
 und implementiere zwei Klassen Paypal und Sparkasse.
 Schreibe anschließend eine main-Methode, in der du demonstrierst,
 warum Coding to an Interface sinnvoll ist:
 Verwende dafür eine Variable vom Typ PaymentProvider,
 mit der du zuerst über Paypal und danach über Sparkasse eine Zahlung durchführst,
 ohne den restlichen Code ändern zu müssen.
 */
public interface PaymentProvider {

    void pay(double amount);

}
class Paypal implements PaymentProvider{

    @Override
    public void pay(double amount){
        System.out.println("Zahlen "+ amount + " mit PayPal");
    }

}
class Sparkasse implements PaymentProvider{

    @Override
    public void pay(double amount){
        System.out.println("Zahlen "+ amount + " mit Sparkasse");
    }

    public static void main(String[] args) {

        PaymentProvider a = new Paypal();
        a.pay(50);
        a = new Sparkasse();
        a.pay(50);
    }

}

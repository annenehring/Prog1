package Wiederholung.Rekursion;

public class Counter {

    /*
    TODO:Rekursive Methode countdown, die herunter zählt. Z.B
     countdown(3) gibt aus:
     3
     2
     1
     0

     */

    public static void countDown(int n){
        if(n<0){
            return;
        }
        System.out.println(n);
        countDown(n-1);
    }




    public static void main(String[] args) {

        countDown(3);
    }
}

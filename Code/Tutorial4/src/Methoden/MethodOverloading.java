package Methoden;

public class MethodOverloading {

    /*
    TODO:Schreibe drei Methoden print, die jeweils verschiedene Datentypen ausgeben:
     print(int x)
     print(double x)
     print(String text)
     Teste alle Varianten in main.
     */

    public static void print( int x ) {
        System.out.println(x);
    }
    public static void print( double x ) {
        System.out.println(x);
    }
    public static void print(String x ) {
        System.out.println(x);
    }


    public static void main(String[] args) {
        print(5);
        print(3.0);
        print("Hallo");

    }



}

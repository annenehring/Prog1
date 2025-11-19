package Methoden;

public class OverloadExample {
    /*
    TODO:Welche Methode wird aufgerufen?
     */
    //1
    static void check(int a, int b) {
        System.out.println("check(int, int)");
    }

    //2
    static void check(long a, long b) {
        System.out.println("check(long, long)");
    }

    //3
    static void check(double a, double b) {
        System.out.println("check(double, double)");
    }

    //4
    static void check(int a, double b) {
        System.out.println("check(int, double)");
    }

    //5
    public static void main(String[] args) {

        check(1, 2);       //
        check(1.0, 2.0);   //3
      //  check2(1, 2L);      //  2 und 4 sind gleich spezifisch
        check(7.0,3); // 3
        check(1, 2.0);     // 4
        check(1.0f, 2);    // 3
    }
}

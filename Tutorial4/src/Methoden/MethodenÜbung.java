package Methoden;

public class MethodenÜbung {

    //Beispiel:

    public static void print(int a){
        System.out.println(a);
    }
    /*
    TODO: Schreibe eine Methode add,
      die zwei int-Werte als Eingabeparameter nimmt
       und die Summe zurückgibt.
     */

    public static int add(int a , int b){
        int summe = a +b;
        return summe;
    }

    /*
    TODO:Schreibe eine Methode max,
      die zwei ganze Zahlen entgegennimmt
      und die größere der beiden zurückgibt.
     */
    public static int max(int x, int y) {
        if(x>y){
            return x;
        }else if(y>x){
            return y;
        }else{
            System.out.println("Fehler. Methode wurde mit zwei gleich großen Werten aufgerufen");
            return y;
        }
       // return Math.max(x,y);
    }





    public static void main(String[] args) {

        int a = add(3,2);
        int max = max(5,8);

    }
}

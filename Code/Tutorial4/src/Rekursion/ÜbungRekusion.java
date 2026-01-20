package Rekursion;
import Prog1Tools.IOTools;

public class ÜbungRekusion {

    /*
    TODO: Schreibe ein Java-Programm,
      das die Fakultät einer Zahl n rekursiv berechnet.
     */
    public static int fak(int n){
        if(n==0|| n == 1) {
            return 1;
        }
        return n* fak( n -1);
    }
    //5 * fak(4)
    //5 * 4 * fak(3)
    //5 * 4 * 3 * fak(2)
    //5 * 4 * 3 * 2 * fak(1)
    //5 * 4 * 3 * 2 * 1

    public static void main(String[] args) {

            int n = IOTools.readInt("Gib eine Zahl ein:");
            int e = fak(n);
            System.out.println("Die Fakultät vom " + n + " ist " + e);

    }

}

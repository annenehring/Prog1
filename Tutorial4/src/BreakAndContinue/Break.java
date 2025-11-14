package BreakAndContinue;

public class Break {
    public static void main(String[] args) {


    /*
    TODO: Schreibe eine Schleife,
      die Zahlen von 1 bis 20 ausgibt.
      Wenn die Zahl 13 erreicht wird, brich die Schleife
      mit break ab.

     */

        for(int i = 1; i <= 20; i++){
            System.out.println(i);
            if(i == 13)break;
        }
    }
}

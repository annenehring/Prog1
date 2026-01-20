package BreakAndContinue;

public class Continue {
    public static void main(String[] args) {
        /*
        TODO:Schreibe eine Schleife, die Zahlen von 1 bis 10 ausgibt,
          außer die Zahl 5 (benutze continue)
         */

        for(int i = 1; i <= 10; i ++){
            if(i == 5) continue;
            System.out.println(i);
        }

    }
}

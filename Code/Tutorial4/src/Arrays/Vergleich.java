package Arrays;

public class Vergleich {
    public static void main(String[] args) {
        /*
        TODO: Gegeben seien zwei Variablen a und b vom Typ int[].
         Warum kann man die beiden Variablen a und b
         nicht mittels a == b vergleichen? Geben Sie Code an,
         der die beiden Variablen vergleicht. Dabei seien die
         zwei Variablen genau dann gleich, wenn alle Komponenten
         übereinstimmen.


         */
        int[] a = {1,3,4};
        int[] b = {1,3,4};

        if (a == b) {
            System.out.println("== sagt: gleich");
        } else {
            System.out.println("== sagt: ungleich");
        }





        /*
        TODO: Gegeben sei eine Variable mA vom Typ int[][].
          Was passiert bei der Anweisung mA = new int[4][2]?
         Skizzieren Sie die angelegten Referenzen und Komponenten.
         */
        int[][] mA; // Referenyvariable, die noch auf null zeigt (nicht initialisiert)
        mA = new int[4][2];

        System.out.println(mA[0][1]);

        int l = mA.length;
        int l2= mA[1].length;

        System.out.println(l); // Was wird hier ausgegeben?
        System.out.println(l2);// Was wird hier ausgegeben?

        /* Array mit 4 Elementen zeigt jeweils auf Array mit 2 Elementen
        mA
        │

        ┌────────────┐
        │ [0] --> [0, 0]   <- int[2]
        │ [1] --> [0, 0]   <- int[2]
        │ [2] --> [0, 0]   <- int[2]
        │ [3] --> [0, 0]   <- int[2]
        └────────────┘

         */
    }

    /*INFO: Mehrdimensionale Arrays:

    INFO: int[][] matrix = new int[3][2];

    matrix -> [0] -> [0, 0]
              [1] -> [0, 0]
              [2] -> [0, 0]


    INFO: int[][][] feld = new int[2][3][4];

    feld
 │
 ├─► feld[0] ──► [ [0,0,0,0], [0,0,0,0], [0,0,0,0] ]
 │
 └─► feld[1] ──► [ [0,0,0,0], [0,0,0,0], [0,0,0,0] ]
     */
}

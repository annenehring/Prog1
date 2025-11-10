package FArrays;

public class Arrays {

    //INFO: Referenzdatentypen
    public static void main(String[] args) {
        // INFO: Array hat die Länge 5, Standardwerte = 0
        int[] zahlen1 = new int[5];
        // Werte setzen
        zahlen1[0] = 10;
        zahlen1[1] = 20;

        //INFO: direkte Initialisierung
        int[] zahlen2 = {1, 2, 3, 4, 5};

        System.out.println(zahlen1); //falsch!!

        //INFO: ausgeben mit for-each:
        for(int temp : zahlen1){
            System.out.print(temp + ", ");
        }
        System.out.println();

        for(int i = 0; i < zahlen1.length; i++){
            System.out.print(zahlen1[i] + ", ");
        }
        System.out.println();

        for(int temp : zahlen2){
            System.out.print(temp+ ", ");
        }
        System.out.println();

        //INFO: Kopie
        int[] kopie1 = zahlen2; // nur Referenzkopie! (beide zeigen auf dasselbe Objekt)
        // wir ändern zahlen2:
        zahlen2[4] = 8;

        System.out.println("Kopie von Zahlen 2: ");
        for(int temp : kopie1){
            System.out.print(temp + ", ");
        }
        System.out.println();
        //INFO: tiefe Kopie
        int[] kopie2 = new int[zahlen1.length];

        for(int i = 0; i< zahlen1.length; i++){
            kopie2[i] = zahlen1[i];
        }
        /*
        kopie2[0] = zahlen1[0];
        kopie2[1] = zahlen1[1];
        kopie2[2] = zahlen1[2];
        kopie2[3] = zahlen1[3];
        ...
         */
        //INFO: Testen
        zahlen1[3] = 6;

        System.out.println("zahlen1 nach Veränderung: ");
        for(int temp : zahlen1){
            System.out.print( temp+ ", ");
        }

        System.out.println("\ntiefe Kopie von zahlen1 nach Veränderung: ");
        for(int temp : kopie2){
            System.out.print(temp+", ");
        }

        // INFO: Beispiel: 2D-Array (Matrix)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        // Ausgabe mit geschachtelten Schleifen
        System.out.println("\nMatrix (ausgegeben):");
        for (int i = 0; i < matrix.length; i++) { //Anzahl der Reihen
            for (int j = 0; j < matrix[i].length; j++) { // Anzahl der Zeilen
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // INFO: arbeiten mit Math.random:
        int[] zufall = new int[5];
        for (int i = 0; i < zufall.length; i++) {
            zufall[i] = (int) (Math.random() * 100); // 0–99
        }
        System.out.println("zufall: ");
        for(int temp : zufall){
            System.out.print( temp+ ", ");
        }
    }
}

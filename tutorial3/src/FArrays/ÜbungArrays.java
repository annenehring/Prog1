package FArrays;

import Prog1Tools.IOTools;

public class ÜbungArrays {


    public static void main(String[] args) {
         /*
    TODO: Initialisieren Sie eine Variable vom typ int[]
     mit der länge 5 und übergeben Sie die Werte 3,4,2,6,1.
     Geben Sie dann die länge des  Arrays aus.
     */

        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 1;
        arr[4] = 3;

        int[] arr2 = {3,4,2,6,1};

        System.out.println(arr.length);
        System.out.println(arr2.length);







        /*
        TODO: Prüfe, ob ein bestimmter Wert im Array {2, 4, 6, 8} vorkommt.
         Z.B: gesuchte Zahl 6 → Ausgabe: Gefunden
         */

        int[] arr3 = {2, 4, 6, 8};
        int gesucht = IOTools.readInteger("gesuchte Zahl: ");
        boolean gefunden = false;
        for(int temp : arr3){
            if(temp == gesucht){
                System.out.println("Gefunden");
                gefunden = true;
            }
        }
        if(gefunden == false){
            System.out.println("nicht gefunden");
        }




        /*
        TODO: Wir wollen zu arr die Zahl 9 hinzufügen. Setze das um.
         */

        int[] arr4 = new int[arr.length +1];

        for(int i = 0; i < arr.length; i++){


        }
        arr4[arr.length] = 9;

        for(int temp: arr4){
            System.out.println(temp + ", ");
        }
        }




    }


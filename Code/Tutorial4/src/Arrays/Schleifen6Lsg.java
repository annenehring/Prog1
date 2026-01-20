package Arrays;

import Prog1Tools.IOTools;

public class Schleifen6Lsg {

    public static void main(String[] args) {
        int count = IOTools.readInt("Wie viele Zahlen möchtest du einlesen? ");
        int arr[] = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = IOTools.readInt("Zahl " + (i + 1) + ": ");
        }

        for(int i = 0; i< count-1; i++){ //n-1 mal durchlaufen
            int j = 0;
            while (j < count - 1) {
                if (arr[j] > arr[j + 1]) {
                    // Vertauschen
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                j++;
            }
        }
        System.out.println("\nSortierte Zahlen:");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }




    }
}

package Sortieralgorithmen;

public class Quicksort {
    /*
    Prinzip: Teile und herrsche
    INFO:
     1. Wähle ein Pivot-Element (z. B. das letzte Element).
     2.Partitioniere das Array:
     2.1 alle Elemente kleiner als das Pivot nach links
     2.2 alle Elemente größer als das Pivot nach rechts
     3. Das Pivot steht danach an der richtigen Position
     4. Wende Quicksort rekursiv auf die linke und rechte Seite an
     */

        public static void quickSort(int[] arr, int left, int right) {
            // Abbruchbedingung:
            // Wenn der Bereich weniger als 2 Elemente hat, ist er bereits sortiert
            if (left < right) {
                // Partitioniert das Array und gibt die endgültige Position
                // des Pivot-Elements zurück
                int pivotIndex = partition(arr, left, right);

                // Alle Elemente links vom Pivot sind kleiner oder gleich
                quickSort(arr, left, pivotIndex - 1);
                // Alle Elemente rechts vom Pivot sind größer
                quickSort(arr, pivotIndex + 1, right);
            }
        }

        private static int partition(int[] arr, int left, int right) {
            int pivot = arr[right];   // Pivot wählen
            int i = left - 1;

            for (int j = left; j < right; j++) {
                if (arr[j] <= pivot) {
                    i++;
                    swap(arr, i, j);
                }
            }

            swap(arr, i + 1, right);
            return i + 1;
        }

        private static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Test
        public static void main(String[] args) {
            int[] arr = {7, 2, 1, 6, 8, 5, 3};

            quickSort(arr, 0, arr.length - 1);

            for (int n : arr) {
                System.out.print(n + " ");
            }
        }
    }


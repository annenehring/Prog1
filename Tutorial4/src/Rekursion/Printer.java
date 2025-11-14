package Rekursion;

public class Printer {
    /*
    TODO: implementiere Methode Rekursiv:
     */
        static void print(int[] array) {
            System.out.println("[");
            for (int i = 0; i < array.length; i++) {

                System.out.print(array[i]);
                if (i != array.length-1)
                    System.out.print(", ");

            }
            System.out.println("]");
        }
        static void print2(int[] arr){
            printRekursiv(arr,0);
        }

        static void printRekursiv(int[] arr, int index){

            if(index != arr.length){

                System.out.print(arr[index] + ",");
                printRekursiv(arr, index + 1);

            }

        }

    public static void main(String[] args) {
        int[] nums = new int[5];
        print2(nums);

    }
    }


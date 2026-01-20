package Sortieralgorithmen;

public class InsertionSort {

    public static void insertionSort(int[] array){

        for(int i = 1; i < array.length; i++){
            int key = array[i];
            int j = i-1;

            while(j >= 0 && array[j]> key){
                array[j+1]= array[j];
                j--;
            }
            array[j +1] = key;

        }

    }

































    public static void insertionSort2(int[] array){


        for(int i = 1; i < array.length; i ++){
            int key = array[i];
            int j = i -1;
            while(j>= 0 && array[j]> key){
                array[j + 1] = array[j];
                j--;
            }
            array[j+1]= key;
        }
    }
    public static void main(String[] args) {
            int[] arr = {2,6,1,7,9,1,2,5,2};
            insertionSort2(arr);
            for(int i : arr){
                System.out.print(i + ", ");
            }
    }
}


package Sortieralgorithmen;

public class SelectionSort {

    public static void selectionSort(int[] arr) {

        for(int i = 0; i<arr.length -1; i++){
            int key = arr[i];
            int index = i;
            for(int j = i+1; j< arr.length; j++){
                if(key > arr[j]){
                    key = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = key;

        }

    }
































    public static void selectionSort2(int[] arr){
        for(int i = 0; i < arr.length- 1; i++){
            int current = arr[i];
            int index = i;
            for(int j = i+1; j < arr.length; j ++){
            if(current > arr[j]) {
                current = arr[j];
                index = j;
            }
            }
            arr[index] = arr[i];
            arr[i] = current;



        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,7,2,10,4,6,1};
        selectionSort(arr);
        for(int temp: arr){
            System.out.print(temp + ", ");
        }
    }
}

package Sortieralgorithmen;

public class BubbleSort {


    public static void bubbleSort(int[] arr){

        int temp;
        for(int j = arr.length; j > 0 ; j--) {
            for (int i = 0; i < j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }



    public static void main(String[] args) {
        int[] arr = {-10, -3, 0, 5, 7, 17, 23, 27, 30};
        bubbleSort(arr);
        for(int temp : arr){
            System.out.print(temp + ", ");
        }
    }
}

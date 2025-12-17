package SuchAlgorithmen;

import java.util.Arrays;


public class LinearSearch {

    public static int linearSearch(int[] arr, int value){

        for(int i = 0; i < arr.length; i++){
            if(arr[i]== value){
                return i;
            }

        }
        return -1;


    }



    public static void main(String[] args) {

        int[] array = {-10, -3, 0, 5, 7, 17, 23, 27, 30};
       System.out.println(linearSearch(array, 7));

    }
}

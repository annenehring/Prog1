package SuchAlgorithmen;

public class BinarySearch {



    public static int binarySearch(int[] arr, int value){
            if(arr == null){
                return -1;
            }
            int anfang = 0;
            int ende = arr.length -1;

            while(anfang <= ende) {
                int stelle = (anfang + ende) / 2;

                if(arr[stelle] == value){
                    return stelle;
                }else if(arr[stelle]< value){
                    anfang = stelle +1;
                }else if(arr[stelle] > value){
                    ende = stelle -1;
                }
            }
            return -1;
        }


        public static int binarySearchRecHilfe(int[] arr, int value){
        return binarySearchRec(arr,0,arr.length-1,value);
        }
     public static int binarySearchRec(int[] arr,int anfang, int ende, int value) {

        int stelle = (anfang + ende)/2;
        if(anfang<=ende) {
            if (arr[stelle] > value) {
                return binarySearchRec(arr, anfang, stelle - 1, value);
            } else if (arr[stelle] < value) {
                return binarySearchRec(arr, stelle + 1, ende, value);
            } else {
                return stelle;
            }
        }
        return -1;
        }






    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,6,7,8,9,10};
       System.out.println(binarySearch(arr, 4));
       System.out.println((binarySearchRecHilfe(arr,4)));
    }
    }


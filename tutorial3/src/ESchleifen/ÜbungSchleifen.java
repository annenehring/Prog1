package ESchleifen;

public class ÜbungSchleifen {


    public static void main(String[] args) {
     /*
     TODO:Schreiben Sie eine for-Schleife die jede ganze Zahl
       von 0 bis 10 ausgibt
         */

        for(int i = 0; i <= 10; i++ ){
            System.out.print(i + ", ");
        }
        System.out.println();

        /*
    TODO: Schreiben Sie eine for-Schleife, die jede zweite ganze
      Zahl von 0 bis 10 ausgibt.
     */
        for(int i = 0; i < 11; i ++){
            if(i%2 == 1){
                System.out.print( i + ", ");
            }

        }
        System.out.println();

     /*
     TODO: Schreiben Sie eine while-Schleife, die die Zahlen
      von 0 bis 10 ausgibt
      */
        int i = 0;
        while(i <= 10){
            System.out.print(i + ",");
            i++;
        }

    }
}

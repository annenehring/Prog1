package Collection;


import java.util.ArrayList;
import java.util.List;

public class Seperate {

    /**
     * (!) Aufgabe 37: Listen: gerade und ungerade Werte trennen
     * Schreiben Sie eine Methode separate, welche eine List<Integer>-Instanz als Input erhält. Sie soll zwei Lis-
     * ten zurückgeben, dabei soll die erste Liste alle geraden und die zweite Liste alle ungeraden Werte enthalten.
     * Für den Rückgabetyp können Sie class ListPair { List<Integer> first, second; } verwenden.
     * @return
     */
    public static ListPair separate(List<Integer> input){
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for(Integer s : input){
            if(s % 2 == 0){
                even.add(s);
            }else{
                odd.add(s);
            }
        }
        return new ListPair(even, odd);
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

       ListPair pair = separate(list);
       System.out.println(pair);
    }

}


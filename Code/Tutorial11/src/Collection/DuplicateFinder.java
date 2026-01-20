package Collection;

import java.util.*;

public class DuplicateFinder {

    /**
     * (!) Aufgabe 41: Anwendung: Duplikate mit Set finden
     * Schreiben Sie eine Methode findDuplicates, die eine Liste von ganzen Zahlen als Input erhält. Verwenden Sie
     * in der Methode ein Set, um alle Duplikate in der Liste zu finden. Geben Sie diese als Set<Integer> zurück.
     * @return
     */
    public static Set<Integer> findDuplicates(List<Integer> input){
        Set<Integer> duplicate = new HashSet<>();
        Set<Integer> hilfe = new HashSet<>();

        for(Integer value : input){
            if(!hilfe.add(value)){
                duplicate.add(value);
            }
        }
        return duplicate;
    }



    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 3);
        Set<Integer> set = new HashSet<>();

        Set<Integer> result = findDuplicates(numbers);
        System.out.println(result); // [1, 2, 3]
    }
}

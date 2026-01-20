package Collection;

import java.util.*;

public class CountOccurrences {
    /**
     *
     *Schreiben Sie eine Methode countOccurrences, die eine Liste von
     * Strings als Input erhält.
     * Die Methode soll eine Map<String, Integer> zurückgeben, in der für
     * jedes Wort gespeichert ist,
     * wie oft es in der Liste vorkommt.
     *
     * z.b ["Apfel", "Banane", "Apfel", "Orange", "Banane", "Apfel"]
     * ->{
     *   "Apfel" = 3,
     *   "Banane" = 2,
     *   "Orange" = 1
     * }
     */
    public static Map<String, Integer> countOccurrences(List<String> input){
        Map< String,Integer> map = new HashMap<>();
        
        for(String s : input){
            if(map.containsKey(s)){
                map.put(s,map.get(s) + 1);
            }else{
                map.put(s,1);
            }
        }
        return map;
    }



    public static void main(String[] args) {

        List<String> words = Arrays.asList(
                "Apfel", "Banane", "Apfel", "Orange", "Banane", "Apfel"
        );

        Queue<Integer> q = new LinkedList<>();

        Map<String, Integer> map = countOccurrences(words);
        System.out.println(map);
    }

}

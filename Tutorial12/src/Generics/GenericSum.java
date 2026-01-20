package Generics;

public class GenericSum {

    /**
     * Aufgabe 47: Generische Methoden: Summe berechnen
     * Schreiben Sie eine generische Methode calculateSum, die für alle Datentypen funktionieren soll, die Zahlen
     * darstellen. Die Methode soll ein Array von ihrem generischen Typ als Input erhalten und einen einzelnen Wert
     * des Typs DOUBLE zurückgeben. Dieser Wert soll die Summe aller Werte im Array sein. Rufen Sie die Methode für
     * verschiedene Beispielwerte auf. Funktioniert sie auch mit primitiven Datentypen? Warum?
     */
    public static <T extends Number> Double calculateSum(T[] arr){
        double res = 0;
        for(int i = 0; i< arr.length; i++){
            res +=  arr[i].doubleValue();
        }
        return res;
    }



    public static void main(String[] args) {
        Integer[] arr2 = {1,2,4,5};
        System.out.println(calculateSum(arr2));

        Double[] arr3 = {2.0,4.5,3.9};
        System.out.println(calculateSum(arr3));

    }
}

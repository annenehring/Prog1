package Rekursion;

/*TODO:
   Aufgabe 10 – Rekursion Gegeben ist folgender Code, der iterativ funktioniert. Schreiben Sie die noch fehlende
   Überladung der Methode mysteryRecursive so, dass die gleiche Funktionalität durch
   Rekursion erfüllt wird.

 */
public class Rekursion {
    public static void main(String[] args) {
        System.out.println(mysteryIterative(4, 5));
        System.out.println(mysteryRecursive(4, 5));
    }

    //2^3 =
    // 2, 3
    public static double mysteryIterative(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base; // 1 * 2 * 2 * 2
        }
        return result; // 2*2*2
    }

    public static double mysteryRecursive(double base, int exponent) {
        double currentResult = 1;
        return mysteryRecursive(base, exponent, currentResult);
    }
    //2 , 0 , 8
    public static double mysteryRecursive(double base, int exp, double curRes){

        if( exp == 0){
            return curRes;
        }
        curRes = curRes * base;
        return mysteryRecursive(base, exp - 1, curRes);
    }

}

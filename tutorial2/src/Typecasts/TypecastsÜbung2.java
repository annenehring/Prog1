package Typecasts;

public class TypecastsÜbung2 {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;
        double c = a / b;
        double d = (double) a / b;
        int e = (int) (a / (double) b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
    }
}

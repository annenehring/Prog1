package Operatoren;

public class Increment {
    public static void main(String[] args) {
        int a = 1;
        a++;
        System.out.println(a); //2
        a = a++;
        System.out.println(a);//2
        a = ++a;
        System.out.println(a);//3
        a = a + 1;
        System.out.println(a);//4
        a = --a;
        System.out.println(a);//3
        a += a;
        System.out.println(a);//6
        a -= a + 1; // 6 - (6+1) = 7
        System.out.println(a);// -1
        a = (a--) - (--a);
        // a = -1
        // a = -2
        // a = -3
        // -1 - (-3) = 2
        System.out.println(a);//2

    }

}

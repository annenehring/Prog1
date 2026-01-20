package Typecasts;

public class Typecasts {
    public static void main(String[] args) {

    /*
    TODO: Was gibt der folgende Code aus?
     */
        int b = 10084;
        System.out.println("(byte) b: " + (byte) b); // 100
       // System.out.println("(char) b: " + (char) b);
        int e = 3/2;
        System.out.println("e: " + e); // 1

        double f = 3/2;
        System.out.println("f: " + f);//1.0

        double g = 3.0 / 2;
        System.out.println("g: " + g);//1.5
        System.out.println("(int) g: " + (int) g);//1

        float j = 0.2f * 0.1f * 10.0f; //0.20000002
        double j2 = 0.2 * 0.1 * 10.0;
        System.out.println("j: " + j);
        System.out.println("j2: "+ j2);
        System.out.println("(int) j: " + (int)j);//0





        char c = ' '; // ASCII Values
        System.out.println("c: " + c);
        System.out.println("(int) c: " + (int) c);
        System.out.println("(double) c: " + (double) c);

        char d = 'Z' - 1;
        System.out.println("d: " + d);
        System.out.println("(int) d: " + (int) d);

        double h = 0x012345; // Hexadecimal
        System.out.println("h: " + h);
        System.out.println("(int) h: " + (int) h);

        int i = 012; // Octal
        System.out.println("i: " + i);


    }
}

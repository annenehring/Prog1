package ABooleanOperators;

public class BooleanOp {
    public static void main(String[] args) {
        /*
        TODO: Was wird auf der Konsole ausgegeben?
         */

        boolean a = true;
        boolean b = false;
        boolean c = true;

        boolean d = a || b; //true
        boolean e = c && a; //true
        boolean f = !e; //false
        boolean g = (a && b) || !(c && b); //true
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}

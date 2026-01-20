package CifStatement;

public class Fallunterscheidung {
    public static void main(String[] args) {
        /*
        TODO: Welcher Wert e wird von diesem Code berechnet und ausgegeben?
         */

        double a, b, c, d, e;
        a = 5;
        b = 2;
        c = 3;
        d = 9;
        if (b > a)
            if (c > b)
                if (d > c)
                    e = d;
                else
                    e = c;
            else
            if (d > b)
                e = d;
            else
                e = b;
        else
        if (c > a)
            if (d > c)
                e = d;
            else
                e = c;
        else
        if (d > a)
            e = d;
        else
            e = a;
        System.out.println("e = " + e);

        /*
        TODO: Überlegen Sie sich eine deutlich kürzere Alternative,
         die zum selben Ergebnis kommt.

        INFO: kürzer:
         */

        e = Math.max(Math.max(a,b),Math.max(c,d));
        System.out.println(e);




    }
}

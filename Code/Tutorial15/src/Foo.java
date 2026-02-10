import java.util.ArrayList;

public class Foo {
    protected int a, b;
    private static int c = 6;
    static Foo buildFoo(int a, int b) {
        Foo f = new Foo();
        f.a = a;
        f.b = b;
        return f;
    }
    void invert() {
        int temp = this.a;
        this.a = this.b;
        this.b = temp;
    }
    Foo redo(Foo other) {
        Foo f = new Foo();
        f.a = other.a - this.a;
        f.b = other.b + this.b;

        return f;
    }
    void replace(int a, int b) {
        a = b;
    }
    void overwrite() {
        a = 42;
        b = ++c;
    }
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList();
        a.add("Produkt A");
        a.add("Produkt B");
        a.add("Produkt C");
        a.get(0);//A
        a.get(1);//B
        a.get(2);//C

        Foo f = buildFoo(3, 2);
        Foo f2 = buildFoo(5, 1);
        Foo f3 = Bar.cloneFoo(f);
        f.invert();
        Foo f4 = f.redo(f2);
        f.overwrite();
        f2.overwrite();
        f4.replace(9, 3);
        f3.overwrite();
        f3.invert();
//hier
    }
}
class Bar extends Foo {
    void invert() {
        this.a = -a;
        this.b = -b;
    }
    static Bar cloneFoo(Foo foo) {
        Bar b = new Bar();
        b.a = foo.a;
        b.b = foo.b;
        return b;
    }
}

package Loader;

class Base {
    static { System.out.println("base static block"); } //1
    static Helper baseHelper = new Helper("baseHelper");//2

    Base() {
        System.out.println("base constructor"); //8
    }
}
class ClassOrderTest extends Base {
    static Helper h1 = new Helper("h1");//3
    static { System.out.println("class static block"); }//4

    public static void main(String[] args) {
        System.out.println("main"); //5
        Sub s = new Sub();
    }
}
class Sub extends Base {
    static Helper subHelper = new Helper("subHelper"); //6
    static { System.out.println("sub static block"); }//7

    Sub() {
        System.out.println("sub constructor"); //9
    }
}










class Helper {
    Helper(String s) {
        System.out.println(s);
    }
}


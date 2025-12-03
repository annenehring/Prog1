package Loader;

class Parents {
    static Helper p1 = new Helper("parent h1");//5
    static {
        System.out.println("parent static");//6
    }
    static Helper p2 = new Helper("parent h2");//7

    Parents() {
        System.out.println("parent ctor");//10
    }
}
class LoaderTest {
    static Helper hMain1 = new Helper("main h1");//1

    public static void main(String[] args) {
        System.out.println("start main");//4
        Child c = new Child();
        System.out.println("end main");//12
    }

    static {
        System.out.println("loader static");//2
    }

    static Helper hMain2 = new Helper("main h2"); //3
}
class Child extends Parents {
    static {
        System.out.println("child static block");//8
    }
    static Helper c1 = new Helper("child h1");//9
    Child() {
        System.out.println("child ctor");//11
    }
}



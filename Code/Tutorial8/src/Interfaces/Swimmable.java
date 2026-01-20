package Interfaces;

//INFO: INTERFACE
public interface Swimmable{
    public static final int gewicht = 3;
    void swim();

    static boolean isValidDepth(int d) {
        return d >= 0;
    }

}


class Duck2 implements Swimmable {

    @Override
    public void swim() { System.out.println("quack!"); }
}

class Fish2 implements Swimmable {

    @Override
    public void swim() { System.out.println("blub."); }
}

class HouseBoat2 implements Swimmable {

    @Override
    public void swim() {
        System.out.println("I am sailing!");
    }

    //INFO: Coding to an Interface
    static void letThemSwim(Swimmable s) {
        s.swim();
    }

    public static void main(String[] args) {
        Swimmable d = new Duck2();
        d.swim();

        letThemSwim(new Duck2());
        letThemSwim(new Fish2());
        letThemSwim(new HouseBoat2());

        System.out.println(Swimmable.isValidDepth(3));

        d = new Duck2();
        d = new Fish2();
        d.swim();


    }
}


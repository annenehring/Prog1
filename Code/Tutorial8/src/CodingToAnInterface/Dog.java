package CodingToAnInterface;

public class Dog implements active {
    String name;

    public Dog(String name){
        this.name = name;
    }
    public void makeSound() {
        System.out.println("Wuff!");
    }

    public static void main(String[] args) {
        active a = new Cat("Lisa");
        a = new Dog("Bruno");
    }
}

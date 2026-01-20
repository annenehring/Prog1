package CodingToAnInterface;

public class Cat implements active {
    String name;

    public Cat(String name){
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Miau!");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Cat cat = (Cat) obj;
        return this.name.equals(cat.name);
    }




    public static void main(String[] args) {
        Cat a = new Cat("Katze");
        Cat b = new Cat("Katze");



    }
}

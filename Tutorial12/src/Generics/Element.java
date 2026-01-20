package Generics;

public class Element {

    final Integer value;
    Element next;

    public Element(Integer value) {
        this.value = value;
    }

    public void append(Integer value) {
        if (next == null) {
            next = new Element(value);
        } else {
            next.append(value);
        }
    }


    /*public static void main(String[] args) {
        Element<Integer> a = new Element<>(1);
        a.append(2);
        a.append(3);

        Element<String> b = new Element<>("A");
        b.append("B");
    }

     */

}

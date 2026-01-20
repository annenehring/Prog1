package Klausur;

public class Element<T> {

    final T value;
    Element<T> next;

    public Element(T value) {
        this.value = value;
    }

    public void append(T value) {
        if (next == null) {
            next = new Element<>(value);
        } else {
            next.append(value);
        }
    }

    public static void main(String[] args) {
        Element<Integer> a = new Element<>(1);
        a.append(2);
        a.append(3);

        Element<String> b = new Element<>("A");
        b.append("B");
    }

}


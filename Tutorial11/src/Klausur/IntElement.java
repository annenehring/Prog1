package Klausur;

public class IntElement {

    final Integer value;
    IntElement next;

    public IntElement(Integer value) {
        this.value = value;
    }

    public void append(Integer value) {
        if (next == null) {
            next = new IntElement(value);
        } else {
            next.append(value);
        }
    }
}


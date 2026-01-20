package Klausur;

public class StringElement {

    final String value;
    StringElement next;

    public StringElement(String value) {
        this.value = value;
    }

    public void append(String value) {
        if (next == null) {
            next = new StringElement(value);
        } else {
            next.append(value);
        }
    }
}


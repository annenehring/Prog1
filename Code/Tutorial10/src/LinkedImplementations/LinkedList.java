package LinkedImplementations;

import java.util.List;

/**
 * Implementieren Sie eine einfach verkettete Liste, die Integer-Werte speichert. Als Basis für Ihre Liste können Sie
 * die folgende Klasse verwenden. Erstellen Sie außerdem eine Klasse List, die eine Referenz auf den Kopf der Liste
 * besitzt.
 */
public class LinkedList {

    private ListElement head;

    /**
     * (a) Schreiben Sie eine Methode insert, mit der Werte zur Liste hinzugefügt werden können. Diese soll einen
     * Wert und einen Index als Input bekommen. Wenn der Index größer als die Länge der Liste ist, können Sie das
     * Element einfach am Ende der Liste anhängen.
     *
     * @param value der eingefügt werden soll
     * @param index an dem der value eingefügt werden soll
     */
    public void insert(int value, int index) {
        ListElement newElement = new ListElement(value);
        // 2 -> 3 -> 7 -> 9
        // head = 3;
        // head = 2;
        // head.next = head;
        //
        if(head == null || index <= 1 ){
            newElement.next = head;
            head = newElement;
            return;
        }

        ListElement current = head;
        int pos = 0;

        while(current.next != null && pos < index -1){
            current = current.next;
            pos++;
        }

        newElement.next = current.next;
        current.next = newElement;

    }

    /**
     * (b) Überschreiben Sie nun die toString-Methode. Wie unterscheiden sich die rekursive und iterative Variante
     * voneinander?
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        ListElement current = head;

        while (current != null) {
            sb.append(current.value).append(" ");
            current = current.next;
        }

        sb.append("]");
        return sb.toString();
    }


    /**
     * rekursiver Ansatz:
     */
    public String toStringRecursive() {
        return "[ " + toStringRecursiveHelper(head) + "]";
    }

    private String toStringRecursiveHelper(ListElement elem) {
        if (elem == null) {
            return "";
        }
        return elem.value + " " + toStringRecursiveHelper(elem.next);
    }


    /**
     * (c) Schreiben Sie eine remove-Methode. Diese soll den Index eines zu entfernenden Elements bekommen und es
     * aus der Liste entfernen. Achten Sie darauf, die Liste wieder korrekt zusammenzuhängen, wenn Sie einen Wert aus
     * der Mitte entfernen.
     *
     * @param index an dem Wert entfernt werden soll
     * @return entfernten Wert
     */
    public Number remove(int index) {

        if( head == null){
            System.err.println("Liste is leer");
            return null;
        }

        ListElement current = head;
        int pos = 0;

        while( current.next != null && pos < index -1){
            current = current.next;
            pos++;
        }
        if( current.next == null){
            System.err.println("Index zu groß");
            return null;
        }
        ListElement neu = current.next;
        current.next = current.next.next;
        return neu.value;

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        System.out.println("Leere Liste:");
        System.out.println(list);

        list.insert(10, 0);
        list.insert(20, 1);
        list.insert(15, 1);
        list.insert(30, 100); // Index zu groß -> ans Ende

        System.out.println("\nListe nach insert:");
        System.out.println(list);


        System.out.println("\nEntferne Element an Index 0:");
        System.out.println("Entfernt: " + list.remove(0));
        System.out.println(list);

        System.out.println("\nEntferne Element in der Mitte (Index 1):");
        System.out.println("Entfernt: " + list.remove(1));
        System.out.println(list);

        System.out.println("\nEntferne Element mit zu großem Index:");
        System.out.println("Entfernt: " + list.remove(10));
        System.out.println(list);
    }
}

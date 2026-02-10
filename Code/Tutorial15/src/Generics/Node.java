package Generics;

/*
TODO:
 Gegeben sind die untenstehenden Binärbaumknotenklassen für Integer- bzw. String-Werte. Ihre
 Aufgabe ist es, eine generische Klasse Node zu schreiben, die die beiden gegebenen Klassen
 ersetzt. Die neue Klasse Node wird beispielhaft in der main-Methode weiter unten verwendet.
 Implementieren Sie die Node Klasse so, dass Sie die gleiche Anzahl von Attributen und Methoden
 (und die gleiche Funktionalität) hat wie die Klassen StringNode und IntNode.
 */
public class Node <T extends Comparable<T>> {

    final T value;
    Node<T> left;
    Node<T> right;

    public Node(T value){
        this.value = value;
    }

    public void add(T value){
                    if(this.value.compareTo(value) < 0) {
                        left = set(left,value);
                    } else {
                        right = set(right,value);
                    }
        }
        private Node<T> set(Node<T> node, T value){
                if(node == null) {
                        return new Node<T>(value);
                    } else {
                        node.add(value);
                        return node;
                    }
                }
}

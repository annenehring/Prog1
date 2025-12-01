package Konstruktor;

public class test {
    public static void main(String[] args) {
        Post p = new Post();
        System.out.println(p); // toString wird aufgerufen, wiel java intern s.toString aufruft, um es zu einem String zu machen
    }
}

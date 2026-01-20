package Konstruktor;

/*
TODO: Erstelle eine Klasse Schüler.
 Die Schüler haben einen Namen und ein Alter.
 Erstelle außerdem eine Variable counter, die zählt wie viele Schüler wir erstellt haben
 */
public class Schüler{

    int age;
    String name;
    static int counter = 0; //2

    public Schüler(int age, String name){
        this.age = age;
        this.name = name;
        counter++;
    }

    public Schüler(){

    }

    public static void main(String[] args) {

        Schüler a = new Schüler(13, "Laura");
        Schüler b = new Schüler(14, "Max");
        Schüler c = new Schüler(13, "Laura2");
        Schüler f = new Schüler(12, "Laura3");
        Schüler z = new Schüler(13, "Finn");
        Schüler anna = new Schüler();

        System.out.println(counter);
    }
}

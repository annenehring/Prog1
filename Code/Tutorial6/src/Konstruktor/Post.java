package Konstruktor;
import Prog1Tools.IOTools;
public class Post {
    String titel;
    String inhalt;
    String user;
    int anzahlLikes;

    //Konstruktor kann public, private oder protected sein
    //Compiler weiß nicht welchen Titel, also this
    public Post(String titel, String inhalt, String user){
        this.titel = titel;
        this.inhalt = inhalt;
        this.user = user;
        this.anzahlLikes = 0;

    }

    // Overloading Konstruktoren ohne Übergabe von parametern
    public Post(){
        System.out.println("Geben Sie Daten ein ");
        this.titel = IOTools.readLine("Titel: ");
        this.user = IOTools.readLine("user: ");
        this.inhalt = IOTools.readLine("Inhalt: ");
        this.anzahlLikes= IOTools.readInt("likes: ");

    }
    public Post(String titel){
        this(titel, "unbekannt", "unbekannt");
    }

    @Override
    public String toString() {
       return "Post{ titel='" + titel  + ", inhalt='" + inhalt  + ", author=" + user + ", likes=" + anzahlLikes + '}';
    }

    public static void main(String[] args) {
        Post p = new Post("Wasserfall");
        System.out.println(p.toString());
        System.out.println(p);


    }
}

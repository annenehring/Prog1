package Konstruktor;
import Prog1Tools.IOTools;

/*
TODO: Klasse Book soll den Titel, den Author,
 die Anzahl der pages und das rating (0 bis 5) von Büchern dar stellen
 */
public class Book {
    private String title;
    private String author;
    private int pages;
    private int rating;

    // TODO: "Normaler" Konstruktor mit Parametern
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.rating = 0;
    }

    // TODO: Parameterloser Konstruktor mit einlesen der Werte mit IOTools
    public Book() {
        System.out.println("Geben Sie die Daten für das Buch an: ");
    this.title = IOTools.readString("title: ");
    this.author = IOTools.readString("author: ");
    this.pages = IOTools.readInt("pages: ");
    this.rating = 0;



    }
    // TODO: Bewertung erhöhen (aber max. 5)
    public void upvote() {
    if(rating < 5) {
        rating++;
    }else{
        System.out.println("Voting ist schon 5");
    }
    }

    //TODO: Prüfen, ob das Buch "lang" ist (ab 500 Seiten)
    public boolean isLong(){
        if (this.pages > 500){
            return true;
        }else{
            return false;
        }
    }



    //Hallo
    //2
    //TODO: Rekursive Methode: Zählt Vokale im Titel
   public int countVowelsInTitle() {
        return countVowelsRecursive(this.title,0);

   }

    // Info: Hilfsmethode (privat), rekursiv
   private int countVowelsRecursive(String text, int index) {
        // Abbruchbedingung
       if(index >= text.length()){
           return 0;
       }
        int counter = 0;
        char a = text.charAt(index); //charAt(int index) ist eine Methode der Klasse String.
        // Sie gibt das Zeichen (Char) an einer bestimmten Stelle des Strings zurück.
        if((a=='a') || (a=='e')||(a=='i')||(a=='o')||(a=='u')){
            counter++;
        }
        return counter + countVowelsRecursive(text, index++);
    }

   @Override
    public String toString() {
        return "Book{title='" + title +
                ", pages=" + pages +
                ", rating=" + rating +
                '}';
    }




    public static void main(String[] args) {
        Book b = new Book("Wasserfall","Anne", 300);
        System.out.println(b);
        System.out.println(b);


        // rating ohne 0 default
    }
}


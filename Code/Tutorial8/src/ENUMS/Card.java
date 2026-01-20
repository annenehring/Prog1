package ENUMS;

public class Card {

    public final Rank rank;
    public final Suit suit;

    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public String toString(){
        return rank + " of " + suit;
    }


}

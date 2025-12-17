package ENUMS;

public class Deck {

        public final Card[] deck = new Card[52];

        public Deck(){
            int index = 0;

            for(Suit suit : Suit.values()){
                for(Rank rank : Rank.values()){
                    deck[index ] = new Card( rank, suit);
                    index ++;
                }
            }


        }


}

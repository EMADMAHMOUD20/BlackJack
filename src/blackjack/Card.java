package blackjack;

public class Card {
    private final int suit;
    private final int rank;
    private final int value;

    public Card(int suit, int rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }


    public Card(Card copyCard) {
        this(copyCard.suit, copyCard.rank, copyCard.value);
    }

    public int getSuit() {
<<<<<<< HEAD
        String name="omda";
        int age=20;
        //emad
=======
        String name = "Mohamed Ibrahim" ;
        System.out.println(name);
>>>>>>> upstream/main
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public int getValue() {
        return value;
    }


    public String cardData() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                ", value=" + value +
                '}';
    }
}

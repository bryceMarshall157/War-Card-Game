import java.util.*;

public class Deck {
	
	String[] suits = { "Hearts", "Spades", "Clubs", "Diamonds"};
	
	ArrayList<Card> bicycleCards = new ArrayList<Card>();

	public Deck() {

		for (String suit:suits) {
			for (int i = 2; i < 15; i++) {
				bicycleCards.add(new Card(i,suit));
			}
		}
	}

	public void shuffle() {
		Collections.shuffle(bicycleCards);
	}

	public Card draw() {
		return bicycleCards.remove(0);
	}

	public ArrayList<Card> getDeck() {
		return bicycleCards;
	}
}

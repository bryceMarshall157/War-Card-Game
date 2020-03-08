import java.util.ArrayList;

public class Player {

	ArrayList<Card> hand = new ArrayList<Card>();
	int score;
	String name;

	public Player(String name) {
		this.score = 0;
		this.name = name;
	}

	public void draw(Deck deck) {
		hand.add(deck.draw());
	}

	public void describeBattle(Player other) {
		System.out.print(name + "'s " + hand.get(0).toString());
		System.out.print(" of " + hand.get(0).getName() + " vs ");
		System.out.print(other.name + "'s " + other.hand.get(0).toString());
		System.out.print(" of " + other.hand.get(0).getName());
	}

	public Card flip() {
		return hand.remove(0);
	}

	public void incrementScore() {
		score += 1;
	}

	public void handWinner() {
		System.out.println("\n" + name + " wins the hand.\n");
	}

	public void gameWinner(Player loser) {
		System.out.println("Player " + name + " wins by a score of: ");
		System.out.println(score + " to " + loser.score);
	}

}

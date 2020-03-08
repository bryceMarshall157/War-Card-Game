public class App {

	public static void main(String[] args) {

		War("Daniel Day Lewis", "Abraham Lincoln");

	}

	public static void War(String p1, String p2) {

		Deck deck = new Deck();
		Player one = new Player(p1);
		Player two = new Player(p2);

		deck.shuffle();

		for (int i = 0; i < 26; i++) {
			one.draw(deck);
			two.draw(deck);
		}
		
		System.out.println(p1 + " vs " + p2 + "\n"); 
		
		
		while (one.hand.size() != 0) {

			one.describeBattle(two);

			Card p1Top = one.flip();
			Card p2Top = two.flip();

			if (p1Top.getValue() == p2Top.getValue()) {
				System.out.println("\nDraw!\n");
			} else if (p1Top.getValue() > p2Top.getValue()) {
				one.incrementScore();
				one.handWinner();
			} else if (p1Top.getValue() < p2Top.getValue()) {
				two.incrementScore();
				two.handWinner();
			}
		}

		if (one.score > two.score) {
			one.gameWinner(two);
		} else if (two.score > one.score) {
			two.gameWinner(one);
		} else {
			System.out.println("The game is a draw!");
		}
	}
}

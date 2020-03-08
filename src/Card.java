public class Card {

	private int value;
	private String name;

	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	public String toString() {

		StringBuilder faceCardName = new StringBuilder();

		switch (value) {

		case 11:
			faceCardName.append("Jack");
			break;
		case 12:
			faceCardName.append("Queen");
			break;
		case 13:
			faceCardName.append("King");
			break;
		case 14:
			faceCardName.append("Ace");
			break;
		default:
			faceCardName.append(value);
			break;
		}
		return faceCardName.toString();
	}
}

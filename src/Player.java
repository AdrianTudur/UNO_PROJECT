import java.util.ArrayList;

public class Player {

	private ArrayList<Card> playerHand = new ArrayList<Card>();
	private String playerName;

	public Player(String n) {
		playerName = n;
	}

	public void addCard(Card c) {
		playerHand.add(c);
	}
	
	public void removeCard(int ent) {
		playerHand.remove(ent);
	}
	
	@Override
	public String toString() {
		return "Player " + playerName + " | Hand : " + playerHand + "]";
	}



}

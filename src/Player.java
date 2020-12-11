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

	public void removeCard(Card c) {
		playerHand.remove(c);
	}

	public boolean hasUno() {
		boolean uno = false;
		if (playerHand.size() == 0) {
			uno = true;
		} 
		return uno;
	}
	
//	public boolean gameOver() {
//		if (playerHand.size() == 0) {
//			System.out.println(playerName + " Has Uno! ");
//			return true;
//		}
//		return false;
//	}

	public boolean hasMatch(Card c) {
		boolean match = false;
		for (int i = 0; i < playerHand.size(); i++) {
			if (playerHand.get(i).isMatch(c)) {
				match = true;
				break;
			}
		}
		return match;
	}

	public Card playCarded(Card rhs) {
		Card c;
		for (int i = 0; i < playerHand.size(); i++) {
			if (playerHand.get(i).isMatch(rhs)) {
				c = playerHand.get(i);
				return c;
			} else {
				
			}
		}
		return null;
	}
	
	public Card playCard(Card rhs) {
		Card c;
		for (int i = 0; i < playerHand.size(); i++) {
			if (playerHand.get(i).isMatch(rhs)) {
				c = playerHand.get(i);
				playerHand.remove(i);
				return c;
			} else {
				
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "Player " + playerName + " | Hand : " + playerHand + "]";
	}

}

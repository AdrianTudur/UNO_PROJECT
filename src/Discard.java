import java.util.ArrayList;

public class Discard {
	
	private ArrayList<Card> Discard = new ArrayList<Card>();
	
	public Discard() {
		
	}
	
	public void discardTop(Card c) {
		Discard.add(c);
	}
	public Card getLast() {
		return Discard.get(Discard.size()-1);
	}

	public void addCard(Card c) {
		Discard.add(c);
	}
	
	public Card dealD() {
		// Deck must not be empty
		// Get card at the tail of the deck
		Card c = Discard.remove(Discard.size() - 1);
		return c;
	}
	
	@Override
	public String toString() {
		return "Top Card : [" + Discard + "]";
	}
	
}

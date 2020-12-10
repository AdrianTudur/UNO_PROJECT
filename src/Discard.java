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
	@Override
	public String toString() {
		return "Top Card : [" + Discard + "]";
	}
	
}

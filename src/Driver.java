
public class Driver {

	public static void main(String[] args) {

		Player p1 = new Player("Bob");
		Player p2 = new Player("Joe");
		Discard dis = new Discard();
		Deck d = new Deck();
		d.shuffle();

		for (int i = 0; i < 7; i++) {
			// System.out.println(d.dealCard());
			p1.addCard(d.dealCard());
			p2.addCard(d.dealCard());
		}
		dis.discardTop(d.dealCard());
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println();
		System.out.println(dis);
		int ent = 1;		
//		System.out.println(d);
		if (Card.getCardColor(dis.getLast()) == 2) {
			p1.removeCard(ent);

		}
//		p1.removeCard(ent);
		
		System.out.println(p1);
		System.out.println(p2);
//		if(!d.isEmpty()) {
//			System.out.println(d.dealCard());
//		} else {
//			
//		}

//		Card c1 = new Card(1, 2);
//		Card c2 = new Card(2, 13);
//		System.out.println(c1);
//		
//		if(c1.isMatch(c2)) {
//			System.out.println("Match");
//		} else {
//			System.out.println("Not");
//		}
	}

}

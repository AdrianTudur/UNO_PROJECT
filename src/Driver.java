
public class Driver {

	public static void main(String[] args) {

		Player p1 = new Player("Bob");
		Player p2 = new Player("Joe");
		Player p3 = new Player("Rob");
		Player p4 = new Player("Jim");
		Discard dis = new Discard();
		Deck d = new Deck();
		d.shuffle();
		d.shuffle();

		
		for (int i = 0; i < 7; i++) {
			p1.addCard(d.dealCard());
			p2.addCard(d.dealCard());
			p3.addCard(d.dealCard());
			p4.addCard(d.dealCard());
		}
		dis.discardTop(d.dealCard());

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println();
		System.out.println("Top Card: " + dis.getLast());
		System.out.println();

		do {
			
			if (p1.hasMatch(dis.getLast())) { // Player 1 //
				dis.addCard(p1.playCarded(dis.getLast()));
				p1.playCard(dis.getLast());
			} else {
				p1.addCard(d.dealCard());
			}
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
			System.out.println(p4);
			System.out.println();
			System.out.println("Top Card: " + dis.getLast());
			System.out.println();
			if (d.isEmpty()) {
				for (int i = 0; i < 20; i++) {
					d.restockD(dis.dealD());
				}
			}
			
			if (!p1.hasUno()) {
			if (p2.hasMatch(dis.getLast())) { // Player 2 //
				dis.addCard(p2.playCarded(dis.getLast()));
				p2.playCard(dis.getLast());
			} else {
				p2.addCard(d.dealCard());
			}
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
			System.out.println(p4);
			System.out.println();
			System.out.println("Top Card: " + dis.getLast());
			System.out.println();
			if (d.isEmpty()) {
				for (int i = 0; i < 20; i++) {
					d.restockD(dis.dealD());
				}
			}
			} else {
				System.out.println("Bob Has Uno");
				break;
			}
			
			if (!p2.hasUno()) {
			if (p3.hasMatch(dis.getLast())) { // Player 3 //
				dis.addCard(p3.playCarded(dis.getLast()));
				p3.playCard(dis.getLast());
			} else {
				p3.addCard(d.dealCard());
			}
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
			System.out.println(p4);
			System.out.println();
			System.out.println("Top Card: " + dis.getLast());
			System.out.println();
			if (d.isEmpty()) {
				for (int i = 0; i < 20; i++) {
					d.restockD(dis.dealD());
				}
			}
			} else {
				System.out.println("Joe Has Uno");
				break;
			}
			
			if (!p3.hasUno()) {
			if (p4.hasMatch(dis.getLast())) { // Player 4 //
				dis.addCard(p4.playCarded(dis.getLast()));
				p4.playCard(dis.getLast());
			} else {
				p4.addCard(d.dealCard());
			}
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
			System.out.println(p4);
			System.out.println();
			System.out.println("Top Card: " + dis.getLast());
			System.out.println();
			if (d.isEmpty()) {
				for (int i = 0; i < 20; i++) {
					d.restockD(dis.dealD());
				}
			}
			} else {
				System.out.println("Rob Has Uno");
				break;
			}
		} while(!p1.hasUno() && !p2.hasUno() && !p3.hasUno() && !p4.hasUno()); {
			System.out.println();
			System.out.println("Game Over");
		}
	}

}

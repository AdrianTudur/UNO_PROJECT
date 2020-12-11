
public class Card {

	private int color;
	private int value;

	// Color Dictionary:
	// Red = 0
	// Yellow = 1
	// Blue = 2
	// Green = 3
	// No Color = 4

	// Value Dictionary:
	// 10 = Skip
	// 11 = Reverse
	// 12 = Draw2
	// 13 = Wild
	// 14 = Wild4

	public Card(int c, int v) {
		color = c;
		value = v;

	}

	public void setColor(int c) {
		color = c;

	}

	public void setValue(int v) {
		value = v;
	}
	public int getCardValue(){
	    return value;
	}
	public int getCardColor(){
	    return color;
	}
	public static int getCardValue(Card c) {
		return c.getCardValue();
	}
	
	public static int getCardColor(Card c) {
		return c.getCardColor();
	}

	public boolean isMatch(Card c2) {
		if (this.value == 13 || this.value == 14) {
			return true;
		} else if (this.color == c2.color) {
			return true;
		} else if (this.value == c2.value) {
			return true;
		} else {
		return false;
		}
	}

	@Override
	public String toString() {
		String c;
		if (color == 0)
			c = "R";
		else if (color == 1)
			c = "Y";
		else if (color == 2)
			c = "B";
		else
			c = "G";
		String v;
		if (value == 10)
			v = "Skip";
		else if (value == 11)
			v = "Reverse";
		else if (value == 12)
			v = "Draw 2";
		else if (value == 13)
			v = "Wild";
		else if (value == 14)
			v = "Wild 4";
		else
			v = value + "";
		return "[" + c + " : " + v + "]";
		
	}

}

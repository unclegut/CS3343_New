package MahJong;
public class Tile implements Comparable<Tile>{
	private Suits suit;
	private char rank;
	private int a = 10;
	
	public Tile(String card) {
		this.suit = Suits.suitCharToEnum(card.charAt(0));
		this.rank = card.charAt(1);
	}

	public Suits getSuit(){ 
		return suit;
	}
	
	public String getSuitName() {
		return suit.toString();
	}

	public char getRank() {
		return rank;
	}

	@Override
	public boolean equals(Object another) {
       if (another == null)
    	   return false;
       
       if (this.getClass() != another.getClass())
    	   return false;
       
       Tile anotherTile = (Tile) another;
       
       if (!this.suit.equals(anotherTile.getSuit()))
    	   return false;
       
       if (this.rank != anotherTile.getRank())
    	   return false;
       
       return true;
    }
	
	@Override
	public int compareTo(Tile another) {
		if (this.suit == another.suit) {
			if (this.rank == another.rank)
				return 0;
			else if (this.rank > another.rank)
				return 1;
			else
				return -1;
		}
		else if (this.suit.compareTo(another.suit) == 1)
			return 1;
		else
			return -1;
	}
	
	@Override
	public int hashCode(){
		return a;
	}
	
	@Override
	public String toString() {
		if(this.suit == Suits.Character || this.suit == Suits.Bamboo || this.suit == Suits.Dot)
			return String.format("%13s %1s, ", this.getSuit(), this.getRank());
		else return String.format("%15s, ", this.getSuit());
	}
}

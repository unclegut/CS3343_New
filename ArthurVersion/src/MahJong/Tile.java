package MahJong;
public class Tile{
	private Suits suit;
	private char rank;
	private int a = 10;
	
	public Tile(String card) {
		this.suit = Suits.suitCharToEnum(card.charAt(0)); //input 'c' , 'b' , 'd' , 'e' , etc...
		this.rank = card.charAt(1); //1-9
	}

	/* Get Method */
	public Suits getSuit(){ 
		return suit;
	}
	
	public String getSuitName() { //show suit name defined in enum class
		return suit.toString();
	}

	public char getRank() {
		return rank;
	}

	//int result = player1Hand.getTile(0).getSuit().compareTo(player1Hand.getTile(1).getSuit()); can use to find the suit different, 0 = same suit
	
	//Important to HashSet
	@Override
	public boolean equals(Object obj) {
        return (obj instanceof Tile && ((Tile) obj).suit == this.suit && ((Tile) obj).rank == this.rank);
    }
	
	//Important to HashSet
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

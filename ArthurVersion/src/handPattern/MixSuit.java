package handPattern;

import java.util.*;

import mahJong.*;

public class MixSuit extends HandPattern{
	
	public MixSuit() {
		super(3, "MixSuit");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean checkPattern(Hand hand){
		
		ArrayList<Tile> tileSet = new ArrayList<Tile>(new HashSet<Tile>(hand.getList()));
		ArrayList<Integer> tileCount = new ArrayList<Integer>();
		for(Tile tile:tileSet)
			tileCount.add(Collections.frequency(hand.getList(), tile)); //count unique element 
		
		String checkingSuit = null; // the suit that only exist in hand
		if(tileSet.get(0).getSuit() == Suits.Bamboo || tileSet.get(0).getSuit() == Suits.Character || tileSet.get(0).getSuit() == Suits.Dot) {
	
			checkingSuit = tileSet.get(0).getSuitName(); //get the first tile as checking tile
		
			for(int i = 0 ; i < tileSet.size() ; i++) {
				if (tileSet.get(i).getSuitName() != checkingSuit) {
					if(tileSet.get(i).getRank() != '0') return false; //rank 0 means it is not Character/Bamboo/Dot
				}
			}
			
			if ( hand.getList().contains(new Tile("n0")) || hand.getList().contains(new Tile("e0"))
					|| hand.getList().contains(new Tile("s0")) || hand.getList().contains(new Tile("w0")) 
					|| hand.getList().contains(new Tile("r0")) || hand.getList().contains(new Tile("g0"))
					|| hand.getList().contains(new Tile("_0"))){
			return true;
			}
		}
		
		return false; // not mix suit
	}
}

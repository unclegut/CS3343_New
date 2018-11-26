package handPattern;

import java.util.*;

import mahJong.*;

public class SameSuit extends HandPatterns{
	
	public SameSuit() {
		super(7, "SameSuit");
	}

	@Override
	public boolean checkPattern(Hand hand){
		
		ArrayList<Tile> tileSet = new ArrayList<Tile>(new HashSet<Tile>(hand.getList()));
		ArrayList<Integer> tileCount = new ArrayList<Integer>();
		for(Tile tile:tileSet)
			tileCount.add(Collections.frequency(hand.getList(), tile)); //count unique element in the set
		
		String checkingSuit = null; // the only suit that exist in hand
		if(tileSet.get(0).getSuit() == Suits.Bamboo || 
				tileSet.get(0).getSuit() == Suits.Character || 
				tileSet.get(0).getSuit() == Suits.Dot) {
	
			checkingSuit = tileSet.get(0).getSuitName(); //get the first tile as checking tile
		
			for(int i = 0 ; i < tileSet.size() ; i++) {
				if (tileSet.get(i).getSuitName() != checkingSuit)
					return false;
			}
			
			return true; //no failure, check successfully therefore return true
		}
		
		else return false; // not same suit
	}
}

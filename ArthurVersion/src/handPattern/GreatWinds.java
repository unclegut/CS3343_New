package handPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import mahJong.Hand;
import mahJong.Suits;
import mahJong.Tile;

public class GreatWinds extends HandPatterns{
	
	public GreatWinds() {
		super(-1, "GreatWinds");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean checkPattern(Hand hand){
		
		ArrayList<Tile> tileSet = new ArrayList<Tile>(new HashSet<Tile>(hand.getList()));
		ArrayList<Integer> tileCount = new ArrayList<Integer>();
		for(Tile tile:tileSet)
			tileCount.add(Collections.frequency(hand.getList(), tile)); //count unique element 
		
		if ( hand.getList().contains(new Tile("n0")) && hand.getList().contains(new Tile("e0"))
				&& hand.getList().contains(new Tile("s0")) && hand.getList().contains(new Tile("w0"))){

			//Make sure all wind tiles has 3.
			if(Collections.frequency(hand.getList(), new Tile("n0")) == 3 && Collections.frequency(hand.getList(), new Tile("e0")) == 3
					&& Collections.frequency(hand.getList(), new Tile("s0")) == 3 && Collections.frequency(hand.getList(), new Tile("w0")) == 3){
			
				for(int i = 0 ; i < tileSet.size(); i++){
					
					if(tileSet.get(i).getSuit() != Suits.NorthWind && tileSet.get(i).getSuit() != Suits.EastWind
					&& tileSet.get(i).getSuit() != Suits.SouthWind && tileSet.get(i).getSuit() != Suits.WestWind){
						
						if(tileCount.get(i) == 2) //The number of tile other than wind is 2
							return true;
						
					}
				}
			}
		} //1
		
		return false;
	}
}

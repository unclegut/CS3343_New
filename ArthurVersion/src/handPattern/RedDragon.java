package handPattern;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import mahJong.Hand;
import mahJong.Suits;
import mahJong.Tile;

public class RedDragon extends HandPattern{
	public RedDragon() {
		super(1, "RedDragon");
	}

	@Override
	public boolean checkPattern(Hand hand) {
		ArrayList<Tile> tileSet = new ArrayList<Tile>(new HashSet<Tile>(hand.getList()));
		ArrayList<Integer> tileCount = new ArrayList<Integer>();
		
		for(Tile tile:tileSet){
			tileCount.add(Collections.frequency(hand.getList(), tile)); //count unique element 
		}
		
		//Case for red/green/white dragon
		for(int i = 0 ; i < tileSet.size() ; i++){
			if(tileSet.get(i).getSuit() == Suits.RedDragon)
				if(tileCount.get(i) == 3)
					return true;
        }
		
		return false;
	}

	
}

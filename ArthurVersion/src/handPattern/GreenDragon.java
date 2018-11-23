package handPattern;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import mahJong.Hand;
import mahJong.Suits;
import mahJong.Tile;

public class GreenDragon extends HandPattern{
	public GreenDragon() {
		super(1, "GreenDragon");
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
			if(tileSet.get(i).getSuit() == Suits.GreenDragon)
				if(tileCount.get(i) == 3)
					return true;
        }
		
		return false;
	}

	
}

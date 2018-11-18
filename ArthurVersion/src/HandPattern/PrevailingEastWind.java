package HandPattern;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import MahJong.Hand;
import MahJong.Suits;
import MahJong.Tile;

public class PrevailingEastWind extends HandPattern{
	public PrevailingEastWind() {
		super(1, "EastWind");
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
			if(tileSet.get(i).getSuit() == Suits.EastWind)
				if(tileCount.get(i) == 3)
					return true;
        }
		
		return false;
	}
}

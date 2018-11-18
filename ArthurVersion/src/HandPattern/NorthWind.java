package HandPattern;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import MahJong.Hand;
import MahJong.Suits;
import MahJong.Tile;

public class NorthWind extends HandPattern{
	public NorthWind() {
		super(1, "NorthWind");
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
			if(tileSet.get(i).getSuit() == Suits.NorthWind)
				if(tileCount.get(i) == 3)
					return true;
        }
		
		return false;
	}
}

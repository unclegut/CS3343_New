package handPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import mahJong.Hand;
import mahJong.Tile;

public class AllinTriplets extends HandPatterns {
	public AllinTriplets() {
		super(3, "AllinTriplets");
	}

	public boolean checkPattern(Hand hand){
		
		ArrayList<Tile> tileSet = new ArrayList<Tile>(new HashSet<Tile>(hand.getList()));
		
		ArrayList<Integer> tileCount = new ArrayList<Integer>();
		for(Tile tile:tileSet){
			tileCount.add(Collections.frequency(hand.getList(), tile)); //count unique element 
		}
		
		//Add sort here to make 23333 sequence, only this class need
		Collections.sort(tileCount);
		
		if(tileCount.get(0) == 2 && tileCount.get(1) == 3 && tileCount.get(2) == 3 && tileCount.get(3) == 3 && tileCount.get(4) == 3)
			return true;
		
		else return false;
	}
}

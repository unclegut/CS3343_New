package HandPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import MahJong.Hand;
import MahJong.Suits;
import MahJong.Tile;

public class CommonHand extends HandPattern{
	public CommonHand() {
		super(1, "CommonHand");
	}

	public boolean checkPattern(Hand hand){
		
		ArrayList<Tile> tileSet = new ArrayList<Tile>(new HashSet<Tile>(hand.getList()));
		ArrayList<Integer> tileCount = new ArrayList<Integer>();
		for(Tile tile:tileSet)
			tileCount.add(Collections.frequency(hand.getList(), tile)); //count unique element 
		
		//Add sort here to make 2333 sequence, only this class need
		Collections.sort(tileCount);
		
		
	}
}

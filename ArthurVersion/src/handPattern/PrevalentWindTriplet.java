package handPattern;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import mahJong.Hand;
import mahJong.Suits;
import mahJong.Tile;

public class PrevalentWindTriplet extends HandPattern{ //�魷
	public PrevalentWindTriplet() { 
		super(1, "PrevalentWindTriplet");
	}

	@Override
	public boolean checkPattern(Hand hand) {
		ArrayList<Tile> tileSet = new ArrayList<Tile>(new HashSet<Tile>(hand.getList()));
		ArrayList<Integer> tileCount = new ArrayList<Integer>();
		
		for(Tile tile:tileSet){
			tileCount.add(Collections.frequency(hand.getList(), tile)); //count unique element 
		}
		
		char pWind = hand.getPrevalentWind();
		Suits suit = Suits.suitCharToEnum(pWind);
		
		for(int i = 0 ; i < tileSet.size() ; i++){
			if(tileSet.get(i).getSuit() == suit)
				if(tileCount.get(i) == 3)
					return true;
        }
		
		return false;
	}
}
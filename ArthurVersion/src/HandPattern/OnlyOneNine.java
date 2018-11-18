package HandPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import MahJong.Hand;
import MahJong.Suits;
import MahJong.Tile;

public class OnlyOneNine extends HandPattern {
	
	public OnlyOneNine() {
		super(10, "OnlyOneNine");
		// TODO Auto-generated constructor stub
	}

	public boolean checkPattern(Hand hand){
		
		ArrayList<Tile> tileSet = new ArrayList<Tile>(new HashSet<Tile>(hand.getList()));
			ArrayList<Integer> tileCount = new ArrayList<Integer>();
		for(Tile tile:tileSet)
			tileCount.add(Collections.frequency(hand.getList(), tile)); //count unique element 
		

		//DDW <- Must be ddw, else fail
		
		for(int i = 0 ; i < tileSet.size() ; i++){
			if((tileSet.get(i).getSuit() == Suits.Character || tileSet.get(i).getSuit() == Suits.Bamboo || tileSet.get(i).getSuit() == Suits.Dot)){
				if(!(tileSet.get(i).getRank() == '1' || tileSet.get(i).getRank() == '9'))
					return false;
			}
			
			else return false;
		}
		
		return true;
	}
}

package HandPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import MahJong.Hand;
import MahJong.Suits;
import MahJong.Tile;

public class AllHonorTiles extends HandPattern{
	public AllHonorTiles(int point, String name) {
		super(10, "AllHonorTiles");
	}

	public boolean checkPattern(Hand hand){
		
		ArrayList<Tile> tileSet = new ArrayList<Tile>(new HashSet<Tile>(hand.getList()));
		ArrayList<Integer> tileCount = new ArrayList<Integer>();
		for(Tile tile:tileSet)
			tileCount.add(Collections.frequency(hand.getList(), tile)); //count unique element 
		
		Collections.sort(tileCount);
		
		for(int i = 0 ; i < tileSet.size() ; i++){
			if(!(tileSet.get(i).getSuit() == Suits.NorthWind|| tileSet.get(i).getSuit() == Suits.EastWind
					||tileSet.get(i).getSuit() == Suits.SouthWind || tileSet.get(i).getSuit() == Suits.WestWind
					|| tileSet.get(i).getSuit() == Suits.RedDragon || tileSet.get(i).getSuit() == Suits.GreenDragon
					|| tileSet.get(i).getSuit() == Suits.WhiteDragon))
				return false;
		}
			
		if(tileCount.get(0) == 2 && tileCount.get(1) == 3 && tileCount.get(2) == 3 && tileCount.get(3) == 3 && tileCount.get(4) == 3)
			return true;
		else return false;
	}
}

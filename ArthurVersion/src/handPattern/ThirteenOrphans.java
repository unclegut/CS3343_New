package handPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import mahJong.Hand;
import mahJong.Tile;

public class ThirteenOrphans  extends HandPattern {
	
	public ThirteenOrphans() {
		super(-1, "ThirteenOrphans");
		// TODO Auto-generated constructor stub
	}

	public boolean checkPattern(Hand hand){
		
		ArrayList<Tile> tileSet = new ArrayList<Tile>(new HashSet<Tile>(hand.getList()));
		ArrayList<Integer> tileCount = new ArrayList<Integer>();
		for(Tile tile:tileSet)
			tileCount.add(Collections.frequency(hand.getList(), tile)); //count unique element 
		
		//Contain 13 element
		if ( hand.getList().contains(new Tile("c1")) && hand.getList().contains(new Tile("c9"))
				&& hand.getList().contains(new Tile("b1")) && hand.getList().contains(new Tile("b9"))
				&& hand.getList().contains(new Tile("d1")) && hand.getList().contains(new Tile("d9"))
				&& hand.getList().contains(new Tile("n0")) && hand.getList().contains(new Tile("e0"))
				&& hand.getList().contains(new Tile("s0")) && hand.getList().contains(new Tile("w0"))
				&& hand.getList().contains(new Tile("r0")) && hand.getList().contains(new Tile("g0"))
				&& hand.getList().contains(new Tile("_0"))){
			
			for(int i = 0 ; i < tileCount.size() ;i++){
				if(tileCount.get(i) == 2)
						return true;
			}
		}
		
		return false;
	}
}

package handPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import mahJong.Hand;
import mahJong.Tile;

public class ThirteenOrphans  extends HandPatterns {
	
	public ThirteenOrphans() {
		super(-1, "ThirteenOrphans");
		// TODO Auto-generated constructor stub
	}

	public boolean checkPattern(Hand hand){
		
		ArrayList<Tile> tileSet = new ArrayList<Tile>(new HashSet<Tile>(hand.getList()));
		ArrayList<Integer> tileCount = new ArrayList<Integer>();
		for(Tile tile:tileSet)
			tileCount.add(Collections.frequency(hand.getList(), tile)); //count unique element 
		
		ArrayList<Tile> ThirteenOrphans = new ArrayList<Tile>();
		ThirteenOrphans.add(new Tile("c1"));
		ThirteenOrphans.add(new Tile("c9"));
		ThirteenOrphans.add(new Tile("b1"));
		ThirteenOrphans.add(new Tile("b9"));
		ThirteenOrphans.add(new Tile("d1"));
		ThirteenOrphans.add(new Tile("d9"));
		ThirteenOrphans.add(new Tile("n0"));
		ThirteenOrphans.add(new Tile("e0"));
		ThirteenOrphans.add(new Tile("s0"));
		ThirteenOrphans.add(new Tile("w0"));
		ThirteenOrphans.add(new Tile("r0"));
		ThirteenOrphans.add(new Tile("g0"));
		ThirteenOrphans.add(new Tile("_0"));
		
		if (hand.getList().containsAll(ThirteenOrphans)) {
			for(int i = 0 ; i < tileCount.size() ; i++){
				if(tileCount.get(i) == 2)
						return true;
			}
		} 
		
		return false;
	}
}

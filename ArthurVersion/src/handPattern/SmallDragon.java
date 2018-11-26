package handPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

import mahJong.Hand;
import mahJong.Tile;

public class SmallDragon extends HandPatterns{
	
	public SmallDragon() {
		super(3, "SmallDragon");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean checkPattern(Hand hand){
		
		ArrayList<Tile> tileSet = new ArrayList<Tile>(new TreeSet<Tile>(hand.getList()));
		ArrayList<Integer> tileCount = new ArrayList<Integer>();
		for(Tile tile:tileSet)
			tileCount.add(Collections.frequency(hand.getList(), tile)); //count unique element 
		
		if ( hand.getList().contains(new Tile("r0")) && hand.getList().contains(new Tile("g0"))
				&& hand.getList().contains(new Tile("_0"))){

			//Make sure two types of dragon tile have 3 and the remaining one is 2.
			if((Collections.frequency(hand.getList(), new Tile("r0")) == 2 && Collections.frequency(hand.getList(), new Tile("g0")) == 3
					&& Collections.frequency(hand.getList(), new Tile("_0")) == 3)
					
					|| (Collections.frequency(hand.getList(), new Tile("r0")) == 3 && Collections.frequency(hand.getList(), new Tile("g0")) == 2
							&& Collections.frequency(hand.getList(), new Tile("_0")) == 3)
							
					|| (Collections.frequency(hand.getList(), new Tile("r0")) == 3 && Collections.frequency(hand.getList(), new Tile("g0")) == 3
							&& Collections.frequency(hand.getList(), new Tile("_0")) == 2))
				return true;
					
		}
		
		return false;
	}
}

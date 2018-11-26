package handPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import mahJong.Hand;
import mahJong.Tile;

public class SmallWinds  extends HandPatterns {
	
	public SmallWinds() {
		super(6, "SmallWinds");
		// TODO Auto-generated constructor stub
	}

	public boolean checkPattern(Hand hand){
		
		ArrayList<Tile> tileSet = new ArrayList<Tile>(new HashSet<Tile>(hand.getList()));
		ArrayList<Integer> tileCount = new ArrayList<Integer>();
		for(Tile tile:tileSet)
			tileCount.add(Collections.frequency(hand.getList(), tile)); //count unique element 
		
		if ( hand.getList().contains(new Tile("n0")) && hand.getList().contains(new Tile("e0"))
				&& hand.getList().contains(new Tile("s0")) && hand.getList().contains(new Tile("w0"))){
			
			//Make sure 3 types of wind tiles has 3 and one type has 2.
			if((Collections.frequency(hand.getList(), new Tile("n0")) == 2 && Collections.frequency(hand.getList(), new Tile("e0")) == 3
					&& Collections.frequency(hand.getList(), new Tile("s0")) == 3 && Collections.frequency(hand.getList(), new Tile("w0")) == 3)
					
					|| (Collections.frequency(hand.getList(), new Tile("n0")) == 3 && Collections.frequency(hand.getList(), new Tile("e0")) == 2
							&& Collections.frequency(hand.getList(), new Tile("s0")) == 3 && Collections.frequency(hand.getList(), new Tile("w0")) == 3)
							
					|| (Collections.frequency(hand.getList(), new Tile("n0")) == 3 && Collections.frequency(hand.getList(), new Tile("e0")) == 3
							&& Collections.frequency(hand.getList(), new Tile("s0")) == 2 && Collections.frequency(hand.getList(), new Tile("w0")) == 3)
							
					|| (Collections.frequency(hand.getList(), new Tile("n0")) == 3 && Collections.frequency(hand.getList(), new Tile("e0")) == 3
							&& Collections.frequency(hand.getList(), new Tile("s0")) == 3 && Collections.frequency(hand.getList(), new Tile("w0")) == 2)){
				
				return true;
			}
				
			else return false;
		}
		
		return false;
		}
}
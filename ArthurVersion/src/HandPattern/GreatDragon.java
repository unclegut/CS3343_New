package HandPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import MahJong.Hand;
import MahJong.Tile;

public class GreatDragon extends HandPattern{
	
	public GreatDragon() {
		super(8, "GreatDragon");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean checkPattern(Hand hand){
		
		ArrayList<Tile> tileSet = new ArrayList<Tile>(new HashSet<Tile>(hand.getList()));
		ArrayList<Integer> tileCount = new ArrayList<Integer>();
		for(Tile tile:tileSet)
			tileCount.add(Collections.frequency(hand.getList(), tile)); //count unique element 
		
		if ( hand.getList().contains(new Tile("r0")) && hand.getList().contains(new Tile("g0"))
				&& hand.getList().contains(new Tile("_0"))){

			//Make sure all dragon tiles has 3.
			if(Collections.frequency(hand.getList(), new Tile("r0")) == 3 && Collections.frequency(hand.getList(), new Tile("g0")) == 3
				&& Collections.frequency(hand.getList(), new Tile("_0")) == 3){
				return true;
					}
		}
		
		return false;
	}
}

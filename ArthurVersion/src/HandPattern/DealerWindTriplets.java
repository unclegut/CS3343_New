package HandPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import MahJong.Hand;
import MahJong.Suits;
import MahJong.Tile;

public class DealerWindTriplets extends HandPattern{
	
	public DealerWindTriplets() {
		super(1, "DealerWindTriplets");
	}

	@Override
	public boolean checkPattern(Hand hand) {
		
		return false;
	}
}

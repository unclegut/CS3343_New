package handPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

import mahJong.Hand;
import mahJong.Suits;
import mahJong.Tile;

public class OnlyOneNine extends HandPatterns {

	public OnlyOneNine() {
		super(-1, "OnlyOneNine");
		// TODO Auto-generated constructor stub
	}

	public boolean checkPattern(Hand hand) {

		ArrayList<Tile> tileSet = new ArrayList<Tile>(new TreeSet<Tile>(hand.getList()));
		ArrayList<Integer> tileCount = new ArrayList<Integer>();
		for (Tile tile : tileSet)
			tileCount.add(Collections.frequency(hand.getList(), tile)); // count unique element

		Collections.sort(tileCount);

		if (tileCount.get(0) == 2 && tileCount.get(1) == 3 && tileCount.get(2) == 3 
				&& tileCount.get(3) == 3 && tileCount.get(4) == 3) {

			for (int i = 0; i < tileSet.size(); i++) {
				if ((tileSet.get(i).getSuit() == Suits.Character || tileSet.get(i).getSuit() == Suits.Bamboo
						|| tileSet.get(i).getSuit() == Suits.Dot)) {

					if (!(tileSet.get(i).getRank() == '1' || 
							tileSet.get(i).getRank() == '9'))
						return false; // not 1 or 9
				} else
					return false; // not character/bamboo/dot
			}

			return true;

		} else
			return false; // not 23333 structure of ���k
	}
}

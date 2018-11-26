package handPattern;

import java.util.*;

import mahJong.*;

public class MixSuit extends HandPatterns {

	public MixSuit() {
		super(3, "MixSuit");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean checkPattern(Hand hand) {

		ArrayList<Tile> tileSet = new ArrayList<Tile>(new HashSet<Tile>(hand.getList()));
		ArrayList<Integer> tileCount = new ArrayList<Integer>();
		for (Tile tile : tileSet)
			tileCount.add(Collections.frequency(hand.getList(), tile)); // count unique element

		String checkingSuit = null; // the suit that only exist in hand

		for (int i = 0; i < tileSet.size(); i++) {

			if (tileSet.get(i).getSuit() == Suits.Bamboo || tileSet.get(i).getSuit() == Suits.Character
					|| tileSet.get(i).getSuit() == Suits.Dot) {

				checkingSuit = tileSet.get(i).getSuitName(); // get the tile as checking tile
				break;
			}
		}

		if (checkingSuit == null)
			return false; // all honor tile

		for (int i = 0; i < tileSet.size(); i++) {
			if (tileSet.get(i).getSuitName() != checkingSuit) {
				if (tileSet.get(i).getRank() != '0')
					return false; // not that checking suit
			}
		}

		return true;

	}
}

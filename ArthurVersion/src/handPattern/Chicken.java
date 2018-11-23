package handPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import mahJong.Hand;
import mahJong.Tile;

public class Chicken extends HandPattern {

	public Chicken() {
		super(0, "Chicken");
	}

	public boolean checkPattern(Hand hand) { // randomly get eyes here

		ArrayList<Tile> allTiles = new ArrayList<Tile>(hand.getList());
		Collections.sort(allTiles);
		ArrayList<Tile> tileSet = new ArrayList<Tile>(new HashSet<Tile>(hand.getList()));
		ArrayList<Integer> tileCount = new ArrayList<Integer>();

		for (Tile tile : tileSet) {
			tileCount.add(Collections.frequency(hand.getList(), tile));
		}

		for (int i = 0; i < tileSet.size(); i++) {
			if (tileCount.get(i) == 2) {
				if (checkNonEyeTiles(allTiles, tileSet.get(i)))
					return true;
			}
		}
		return false;
	}

	private boolean checkNonEyeTiles(ArrayList<Tile> allTiles, Tile eye) {

		ArrayList<Tile> allTilesCopy = new ArrayList<Tile>(allTiles);
		String eyeCard = "" + eye.getSuit().getSuit() + eye.getRank();
		allTilesCopy.removeAll(Collections.singleton(new Tile(eyeCard)));

		int count = 0;
		while (count < 4) {
			if (checkSequence(allTilesCopy.get(count * 3 + 1), allTilesCopy.get(count * 3))
					&& checkSequence(allTilesCopy.get(count * 3 + 2), allTilesCopy.get(count * 3 + 1)))
				count++;
			else if (checkTriplets(allTilesCopy.get(count * 3 + 1), allTilesCopy.get(count * 3))
					&& checkTriplets(allTilesCopy.get(count * 3 + 2), allTilesCopy.get(count * 3 + 1)))
				count++;
			else
				return false;
		}

		return true;
	}

	private boolean checkSequence(Tile largerTile, Tile smallerTile) {
		if (largerTile.getSuit() == smallerTile.getSuit()) {
			if (largerTile.getRank() - smallerTile.getRank() == 1)
				return true;
		}
		return false;
	}

	private boolean checkTriplets(Tile largerTile, Tile smallerTile) {
		if (largerTile.getSuit() == smallerTile.getSuit()) {
			if (largerTile.getRank() == smallerTile.getRank())
				return true;
		}
		return false;
	}
}

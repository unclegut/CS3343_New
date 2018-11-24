package mahJong;
import java.util.ArrayList;

import handPattern.HandPattern;

public class Hand {
	private ArrayList<Tile> tiles;
	private char prevalentWind;//°é­·
	private char seatWind; //ªù­·


	public Hand(char prevalentWind, char seatWind, String[] strTiles) {

		this.prevalentWind = prevalentWind;
		this.seatWind = seatWind;
		
		tiles = new ArrayList<Tile>();
		for (int i = 0; i < strTiles.length; i++) {
			tiles.add(new Tile(strTiles[i]));
		}
	}
	
	public ArrayList<Tile> getList() {
		return tiles;
	}
	
	public char getPrevalentWind() {
		return prevalentWind;
	}
	
	public char getSeatWind() {
		return seatWind;
	}

	public void printHand() {
		int lineCount = 0;
		System.out.println("\nYou have: \n");
		for(int i = 0; i < tiles.size(); i++){
			System.out.print(tiles.get(i));
			lineCount++;
			if(lineCount == 3 ){
				System.out.println();
				lineCount = 0;
			}
		}
		System.out.println("\n\nIn your hand. ");
	}
	
}

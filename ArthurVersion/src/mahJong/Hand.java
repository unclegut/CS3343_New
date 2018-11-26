package mahJong;
import java.util.ArrayList;

import handPattern.HandPattern;

public class Hand {
	private ArrayList<Tile> tiles;
	private char prevalentWind;//�魷
	private char seatWind; //����
	// private ArrayList<HandPattern> winningHand;
	// private HandChecker hc;

	public Hand(char prevalentWind, char seatWind, String[] strTiles) {
		// hc = HandChecker.getInstance();
		this.prevalentWind = prevalentWind;
		this.seatWind = seatWind;
		//tiles = new Tile[tileLength];
		tiles = new ArrayList<Tile>();
		for (int i = 0; i < strTiles.length; i++) {
			tiles.add(new Tile(strTiles[i]));
		}
	}
	
	public ArrayList<Tile> getList() {
		return tiles;
	}
	
	/*// get the information of tile in hand
	public Tile getTile(int i) {
		return tiles.get(i);
	}*/
	
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
	
	/*
	private void printCheckingResult() {
		if (!winningHand.isEmpty()) {
			int points = 0;
			System.out.println("Hand patterns: ");		
			for (HandPattern hp : winningHand) {
				System.out.println(hp.toString());
				points += hp.getPoint();
			}
			System.out.println("\nTotal winning point: " + (points == -1 ? "Maximum" : points));
		}
		else
			System.out.println("This hand is a Trick Hand!");
	}
	*/

	/*
	public void checkHand() {
		winningHand = hc.checkHand(this);
		printCheckingResult();
	}
	*/
}
package MahJong;
import java.util.ArrayList;

import HandPattern.HandPattern;

public class Hand {
	private ArrayList<Tile> tiles;
	private char prevailingWind;
	private char dealersWind;
	private ArrayList<HandPattern> winningHand;
	private HandChecker hc;

	public Hand(char prevailingWind, char dealersWind, String[] strTiles) {
		hc = HandChecker.getInstance();
		this.prevailingWind = prevailingWind;
		this.dealersWind = dealersWind;
		//tiles = new Tile[tileLength];
		tiles = new ArrayList<Tile>();
		for (int i = 0; i < 14; i++) {
			tiles.add(new Tile(strTiles[i]));
		}
	}
	
	public ArrayList<Tile> getList() {
		return tiles;
	}
	
	// get the information of tile in hand
	public Tile getTile(int i) {
		return tiles.get(i);
	}
	
	public char getPrevailingWind() {
		return prevailingWind;
	}
	
	public char getDealersWind() {
		return dealersWind;
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

	public void checkHand() {
		winningHand = hc.checkHand(this);
		printCheckingResult();
	}
}

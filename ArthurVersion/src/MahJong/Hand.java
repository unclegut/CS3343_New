package MahJong;
import java.util.ArrayList;

import HandPattern.HandPattern;

public class Hand {
	private ArrayList<Tile> tiles;
	private char prevailingWind;
	private char dealersWind;
	private boolean winning;
	private ArrayList<HandPattern> winningHand;
	private int point;
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
		point = 0; //initialize number of score
	}
	
	public ArrayList<Tile> getList() {
		return tiles;
	}
	
	// get the information of tile in hand
	public Tile getTile(int i) {
		return tiles.get(i);
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
		if (winning) {
			System.out.println("Hand patterns: ");		
			for (HandPattern hp : winningHand)
				System.out.println(hp.toString());		
			System.out.println("\nTotal winning point: " + point);
		}
		else
			System.out.println("This hand is a Trick Hand!");
	}
	
	public void setCheckResult(boolean winning, ArrayList<HandPattern> winningHand, int point) {
		this.winning = winning;
		this.winningHand = winningHand;
		this.point = point;
	}

	public void checkHand() {
		hc.checkHand(this, prevailingWind, dealersWind);
		printCheckingResult();
	}
}

package mahJong;
import java.util.*;


public class Main {
	public static void main(String[] args) {
		char pWind, sWind;
		String tiles;
		
		System.out.println("Hello!");
		//System.out.println("Welcome to Hong Kong MahJong Point Calculator!");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Prevalent Wind: (e/s/w/n)");
		pWind = scanner.nextLine().charAt(0);
		
		System.out.println("Seat Wind: (e/s/w/n)");
		sWind = scanner.nextLine().charAt(0);
		
		System.out.println("Tiles in your hand: (e.g. B91)");		
		tiles = scanner.nextLine();
		String[] tileStr = tiles.split("\\s+"); //length must be 14
		// s = 1 white space, s+ = multiple white space
		
		//maybe can do sort here:
		Arrays.sort(tileStr);// sort the array first 
		//!! Need Checking here??
		
		Hand hand = new Hand(pWind, sWind, tileStr);
		
		hand.printHand();
		
		//System.out.print("Index of Character is:" + Suits.valueOf("Character").ordinal());
		
		//Testing section
		HandChecker hc = HandChecker.getInstance();
		hc.checkHand(hand);
		hc.printCheckingResult();
		//Testing section
		
		scanner.close();
	}
}

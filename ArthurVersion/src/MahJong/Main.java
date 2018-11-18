package MahJong;
import java.util.*;

//123
public class Main {
	public static void main(String[] args) {
		char pWind, dWind;
		String tiles;
		
		System.out.println("Hello!");
		//System.out.println("Welcome to Hong Kong MahJong Point Calculator!");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Prevailing Wind: (E/S/W/N)");
		pWind = scanner.nextLine().charAt(0);
		
		System.out.println("Dealer's Wind: (E/S/W/N)");
		dWind = scanner.nextLine().charAt(0);
		
		System.out.println("Tiles in your hand:");
		tiles = scanner.nextLine();
		String[] tileStr = tiles.split("\\s+"); //length must be 14
		// s = 1 white space, s+ = multiple white space
		
		if(!(Validation.validating(tileStr))){ //check if length = 14 & correctness of suits 
			// need error handler later
			System.out.println("Program end!");
			scanner.close();
			System.exit(1);
		}	
		
		//maybe can do sort here:
		Arrays.sort(tileStr);// sort the array first 
		
		Hand hand = new Hand(pWind, dWind, tileStr);
		
		hand.printHand();
		
		//System.out.print("Index of Character is:" + Suits.valueOf("Character").ordinal());
		
		//Testing section
		
		//hand.checkHand();
		
		//Testing section
		
		scanner.close();
	}
}

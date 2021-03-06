package mahJong;

import java.util.*;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import GUI.LabelDemo;


public class Main {
	public static void main(String[] args) {
		char pWind, sWind;
		String tiles;
		System.out.println("Hello! Welcome to");
		System.out.println("___  ___      _     _                  ______     _       _   _____       _            _       _             \r\n" + 
				"|  \\/  |     | |   (_)                 | ___ \\   (_)     | | /  __ \\     | |          | |     | |            \r\n" + 
				"| .  . | __ _| |__  _  ___  _ __   __ _| |_/ /__  _ _ __ | |_| /  \\/ __ _| | ___ _   _| | __ _| |_ ___  _ __ \r\n" + 
				"| |\\/| |/ _` | '_ \\| |/ _ \\| '_ \\ / _` |  __/ _ \\| | '_ \\| __| |    / _` | |/ __| | | | |/ _` | __/ _ \\| '__|\r\n" + 
				"| |  | | (_| | | | | | (_) | | | | (_| | | | (_) | | | | | |_| \\__/\\ (_| | | (__| |_| | | (_| | || (_) | |   \r\n" + 
				"\\_|  |_/\\__,_|_| |_| |\\___/|_| |_|\\__, \\_|  \\___/|_|_| |_|\\__|\\____/\\__,_|_|\\___|\\__,_|_|\\__,_|\\__\\___/|_|   \r\n" + 
				"                  _/ |             __/ |                                                                     \r\n" + 
				"                 |__/             |___/                                                                      ");
		
		
		//System.out.println("Welcome to Hong Kong MahJong Point Calculator!");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please input:");
		System.out.println("Prevalent Wind: (e/s/w/n)");
		pWind = scanner.nextLine().charAt(0);
		
		System.out.println("Seat Wind: (e/s/w/n)");
		sWind = scanner.nextLine().charAt(0);
		
		System.out.println("Tiles in your hand: (e.g. c1 for Character1, e0 for East Wind, _0 for White Dragon)");		
		tiles = scanner.nextLine();
		String[] tileStr = tiles.split("\\s+"); //length must be 14
		// s = 1 white space, s+ = multiple white space
		
		//maybe can do sort here:
		Arrays.sort(tileStr);// sort the array first 
		
		//Need Checking here
		Validation v = new Validation();
		boolean isValid = v.validateHand(tileStr);
		
		if(isValid) {
		System.out.println("This Hand is Valid! Continue...");
		Hand hand = new Hand(pWind, sWind, tileStr);
		
		hand.printHand();
		
		//System.out.print("Index of Character is:" + Suits.valueOf("Character").ordinal());
		
		//Testing section
		HandChecker hc = HandChecker.getInstance();
		hc.checkHand(hand);
		hc.calculatePoints();
		//Testing section
		
		System.out.println("\nThe hand is printing on a pop up window now...");
		
		// Show hand by GUI
        SwingUtilities.invokeLater(new Runnable() { 
            public void run() {
		//Turn off metal's use of bold fonts
	        UIManager.put("swing.boldMetal", Boolean.FALSE);
                
	        LabelDemo.createAndShowGUI(tileStr);
            }
        });
        // End of GUI
        
		}
		else System.out.print("\nInvalid hand.");
		
		scanner.close();
		
	}
}

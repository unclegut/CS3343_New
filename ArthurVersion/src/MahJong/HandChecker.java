package MahJong;
import java.util.ArrayList;

import HandPattern.HandPattern;

public class HandChecker {
	private static HandChecker instance = new HandChecker();
		
	public static HandChecker getInstance() {
		return instance;
	}
	
	public void checkHand(Hand hand, char pWind, char dWind) {
		int point = 0;
		boolean winning = false;
		ArrayList<HandPattern> winningHand = new ArrayList<HandPattern>();
		
		// Checking
		
		
		
		hand.setCheckResult(winning, winningHand, point);
	}
}

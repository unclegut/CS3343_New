package HandPattern;

import MahJong.Hand;
import supportChecking.Eatable;

public abstract class HandPattern {
	private int point;
	private String name;
	String component; //Storing how the bonus points are calculated
		
	public HandPattern(int point, String name) {
		this.point = point;
		this.name = name;
		this.component = "";
	}
	
	@Override
	public String toString() {
		return name + " " + component + "\nPoint of this hand: " + point;
	}
	
	public int addPoint(int bouns) {
		return point = point + bouns;
	}
	
	public abstract boolean checkPattern(Hand hand);
	
	public boolean isEatable(Hand hand) { //Testing
		return Eatable.isEatable(hand);
	}
	
}

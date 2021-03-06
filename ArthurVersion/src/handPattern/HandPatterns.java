package handPattern;

import mahJong.Hand;

public abstract class HandPatterns {
	private int point;
	private String name;
		
	protected HandPatterns(int point, String name) {
		this.point = point;
		this.name = name;
	}
	
	public int getPoint() {
		return point;
	}
	
	@Override
	public String toString() {
		return name + " " + (point == -1 ? "Maximum" : point);
	}
	
	public abstract boolean checkPattern(Hand hand);
	
}

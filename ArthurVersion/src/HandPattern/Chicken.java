package HandPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import MahJong.Hand;
import MahJong.Tile;

public class Chicken extends HandPattern{
	static boolean isFinish = false;
	
	public Chicken() {
		super(0, "Chicken");
	}

public boolean checkPattern(Hand hand){ //randomly get eyes here
		
		//setup
		ArrayList<Tile> tileSet = new ArrayList<Tile>(new HashSet<Tile>(hand.getList()));
		ArrayList<Integer> tileCount = new ArrayList<Integer>();
		
		for(Tile tile:tileSet){
			tileCount.add(Collections.frequency(hand.getList(), tile)); //count unique element 
		}
		//
		
		for (int i = 0 ; i < tileSet.size() && isFinish == false ; i++){ //isFinish here control the iteration
				getPairOfEye(tileSet,tileCount,i);
		}
		
		if(isFinish == false)
			return false;
		else return true;
	}
	
public static boolean iterative(ArrayList <Tile> tileSet, ArrayList <Integer> tileCount){
		
		if(isFinish == true) return true;
		
		else
		{
			if(Collections.max(tileCount) >= 3)
				getTriplet(tileSet, tileCount);
			
			if(tileSet.size() >= 3)
				getSequence(tileSet, tileCount);
		}
		
		if(isFinish == true) return true;
		return false;
	}
	
	public static void getPairOfEye(ArrayList<Tile> tileSet , ArrayList<Integer> tileCount, int location){
		ArrayList <Tile> tempTileSet = new ArrayList <Tile>(tileSet);
		ArrayList <Integer> tempTileCount = new ArrayList <Integer>(tileCount);
		
		if(tileCount.get(location) == 2){ //if the element has only 2 
			//remove set + count
			tempTileSet.remove(location);
			tempTileCount.remove(location);
			
			iterative(tempTileSet , tempTileCount); // throw to do recursive
		}
		
		else if(tileCount.get(location) > 2) { //if the element has more than 2 
			int temp = tileCount.get(location);
			// minus 2 count
			tempTileCount.set(location, temp-2);
			iterative(tempTileSet , tempTileCount); // throw to do recursive
		}
	}
	
	private static void getTriplet(ArrayList<Tile> tileSet, ArrayList<Integer> tileCount) {
		ArrayList<Tile> tempTileSet = new ArrayList<Tile>(tileSet); //Avoid change the original copy;
		ArrayList<Integer> tempTileCount = new ArrayList<Integer>(tileCount);
		
		for(int i = 0 ; i < tempTileCount.size(); i++){
			int tempCount = tempTileCount.get(i);
			
			//just enough, remove from set
			if(tempTileCount.get(i) == 3){
				tempTileCount.remove(i);
				tempTileSet.remove(i);
				
				if(isSetEmpty(tempTileSet)){
					isFinish = true;
				}
				iterative(tempTileSet, tempTileCount);
				break; //since inside for loop, if we can find 3 then it's ok
				
			} //The number of tile other than wind is 3 (3 same tile)
				
			//reduce number by 3
			else if(tempTileCount.get(i) > 3){
				tempTileCount.set(i, tempCount - 3);
				iterative(tempTileSet, tempTileCount);
				break; //since inside for loop, if we can find 3 then it's ok
				
			}
		}
		
		//nothing happened, return nothing
	}
	
	private static void getSequence(ArrayList<Tile> tileSet, ArrayList<Integer> tileCount){
		ArrayList<Tile> tempTileSet = new ArrayList<Tile>(tileSet); //Avoid change the original copy;
		ArrayList<Integer> tempTileCount = new ArrayList<Integer>(tileCount);
		
		for (int i = 0 ; i < tempTileSet.size()-2 && isFinish == false ; i++){
			
			if((tempTileSet.get(i).getSuit() == tempTileSet.get(i).getSuit()) && (tempTileSet.get(i+1).getSuit() == tempTileSet.get(i+2).getSuit())){
				if (((tileSet.get(i).getRank() == tempTileSet.get(i+1).getRank()-1) && (tempTileSet.get(i+1).getRank() == tempTileSet.get(i+2).getRank()-1))
					|| ((tileSet.get(i).getRank() == tileSet.get(i+1).getRank()+1) && (tileSet.get(i+1).getRank() == tempTileSet.get(i+2).getRank()+1))) {
					
					//Enter Sequence Section
					int tempIndex = i;
					
					for(int j = 0 ; j < 3 ; j++){
						if(tempTileCount.get(tempIndex) == 1){
							tempTileSet.remove(tempIndex);
							tempTileCount.remove(tempIndex);
							
							if(isSetEmpty(tempTileSet)){
								isFinish = true;
								break;
							} //important
						}
						
						else if(tempTileCount.get(tempIndex) > 1){
							tempTileCount.set(tempIndex, tempTileCount.get(tempIndex)-1 );
							tempIndex++;
						}
					}
					
					iterative(tempTileSet, tempTileCount);
					break;
				} //end of second if
				break;
			} //end of first if
					
		}	
	}
	
	public static boolean isSetEmpty(ArrayList<Tile> tileSet){
		if (tileSet.size() == 0 ) return true;
		else return false;
	}
}

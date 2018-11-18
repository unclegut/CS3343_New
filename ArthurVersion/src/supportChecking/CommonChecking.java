package supportChecking;

import MahJong.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CommonChecking {
	static boolean isFinish = false;
	
	public static boolean isCommandHand(Hand hand){ //randomly get eyes here
			//setup
			ArrayList<Tile> tileSet = new ArrayList<Tile>(new HashSet<Tile>(hand.getList()));
			ArrayList<Integer> tileCount = new ArrayList<Integer>();
			
			for(Tile tile:tileSet){
				tileCount.add(Collections.frequency(hand.getList(), tile)); //count unique element 
			}
			//
			
			for (int i = 0 ; i < tileSet.size() && isFinish == false ; i++){ //isFinish here control the iteration
					getPairOfEye(tileSet,tileCount,i);
					System.out.println("End of " + (i+1) +  " iteration!\n\n");
			}
			
			if(isFinish == false)
				System.out.println("Solution is not found..");
			
			return isFinish;
	}
	
	public static boolean iterative(ArrayList <Tile> tileSet, ArrayList <Integer> tileCount){
		
		if(isFinish == true) return true;
		
		else
		{
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
			System.out.println("Remove Index: " + location + " for forming pair of eyes,\n" + tileSet.get(location) + " with count: " + tileCount.get(location) + "");
			tempTileSet.remove(location);
			tempTileCount.remove(location);
			
			printHand(tempTileSet,tempTileCount);
			iterative(tempTileSet , tempTileCount); // throw to do recursive
		}
		
		else if(tileCount.get(location) > 2) { //if the element has more than 2 
			int temp = tileCount.get(location);
			// minus 2 count
			tempTileCount.set(location, temp-2);
			System.out.println("After Minus:\nIndex: " + location + ", " + tileSet.get(location) + " with count: " + tileCount.get(location) + " by 2");
			
			printHand(tempTileSet,tempTileCount);
			iterative(tempTileSet , tempTileCount); // throw to do recursive
		}
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
							System.out.print("\n\nHandling on the set below:");
							printHand(tempTileSet,tempTileCount);
							System.out.println("Removing index " + tempIndex + ", " + tempTileSet.get(tempIndex) + " for sequence part.");
							tempTileSet.remove(tempIndex);
							tempTileCount.remove(tempIndex);
							
							if(isSetEmpty(tempTileSet)){
								System.out.println("Solution here!!");
								isFinish = true;
								break;
							} //important
							
							printHand(tempTileSet, tempTileCount);
						}
						
						else if(tempTileCount.get(tempIndex) > 1){
							System.out.print("\n\nHandling on the set below:");
							printHand(tempTileSet,tempTileCount);
							System.out.println("Minusing index " + tempIndex + ", " + tempTileSet.get(tempIndex) + " by 1 for sequence part.");
							tempTileCount.set(tempIndex, tempTileCount.get(tempIndex)-1 );
							printHand(tempTileSet, tempTileCount);
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
	
	
	
	public static void printHand(ArrayList<Tile> tileSet , ArrayList<Integer> tileCount){
		if(tileSet.size() == 0)
			System.out.println("The set is empty!");
		else{
			System.out.println("\n============================================\nIn the Set, You have:");
			
			for(int i = 0 ; i < tileSet.size() ; i++)
				System.out.println("Index " + i + " , " + tileSet.get(i) + " " + " with count: " + tileCount.get(i));
			System.out.println("============================================");
		}
	}
	
	public static boolean isSetEmpty(ArrayList<Tile> tileSet){
		if (tileSet.size() == 0 ) return true;
		else return false;
	}
}
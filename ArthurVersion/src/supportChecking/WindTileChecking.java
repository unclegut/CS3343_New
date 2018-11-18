package supportChecking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import MahJong.Hand;
import MahJong.Suits;
import MahJong.Tile;

public class WindTileChecking{
	public static int checkSpecialWind(Hand hand, char pWind, char dWind){
		int specialScore = 0;
		
		ArrayList<Tile> tileSet = new ArrayList<Tile>(new HashSet<Tile>(hand.getList()));
		ArrayList<Integer> tileCount = new ArrayList<Integer>();
		
		for(Tile tile:tileSet){
			tileCount.add(Collections.frequency(hand.getList(), tile)); //count unique element 
		}
		
		//Case for red/green/white dragon
		for(int i = 0 ; i < tileSet.size() ; i++){
			
			//Case for Winds, if implemented the environment , reload this after setting ENV!
			switch (pWind) {
            case 1:  pWind = 'E';
            if(tileSet.get(i).getSuit() == Suits.EastWind)
				if(tileCount.get(i) == 3)
					specialScore++;
                    break;
                    
            case 2: pWind = 'S';
            if(tileSet.get(i).getSuit() == Suits.SouthWind)
				if(tileCount.get(i) == 3)
					specialScore++;
            		break;
            		
            case 3: pWind = 'W';
            if(tileSet.get(i).getSuit() == Suits.WestWind)
				if(tileCount.get(i) == 3)
					specialScore++;
            		break;
            		
            case 4: pWind = 'N';
            if(tileSet.get(i).getSuit() == Suits.NorthWind)
				if(tileCount.get(i) == 3)
					specialScore++;
            		break;
            }
			
			switch (dWind) {
            case 1:  pWind = 'E';
            if(tileSet.get(i).getSuit() == Suits.EastWind)
				if(tileCount.get(i) == 3)
					specialScore++;
                    break;
                    
            case 2: pWind = 'S';
            if(tileSet.get(i).getSuit() == Suits.SouthWind)
				if(tileCount.get(i) == 3)
					specialScore++;
            		break;
            		
            case 3: pWind = 'W';
            if(tileSet.get(i).getSuit() == Suits.WestWind)
				if(tileCount.get(i) == 3)
					specialScore++;
            		break;
            		
            case 4: pWind = 'N';
            if(tileSet.get(i).getSuit() == Suits.NorthWind)
				if(tileCount.get(i) == 3)
					specialScore++;
            		break;
            }
        }
		
		return specialScore;
	}
}

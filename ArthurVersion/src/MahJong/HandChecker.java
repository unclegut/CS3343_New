package MahJong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import HandPattern.HandPattern;
import HandPattern.AllHonorTiles;
import HandPattern.AllinTriplets;
import HandPattern.Chicken;
import HandPattern.CommonHand;
import HandPattern.ContainOneNine;
import HandPattern.GreatDragon;
import HandPattern.GreatWinds;
import HandPattern.MixSuit;
import HandPattern.OnlyOneNine;
import HandPattern.SameSuit;
import HandPattern.SmallDragon;
import HandPattern.SmallWinds;
import HandPattern.ThirteenOrphans;


public class HandChecker {
	private static HandChecker instance = new HandChecker();
	private ArrayList<HandPattern> handPatterns;
	private ArrayList<HandPattern> winningHand;
	private Hand hand;

	private HandChecker() {
		handPatterns = new ArrayList<HandPattern>();
		handPatterns.add(new GreatWinds());
		handPatterns.add(new ThirteenOrphans());
		handPatterns.add(new OnlyOneNine());
		handPatterns.add(new AllHonorTiles());
		handPatterns.add(new SameSuit());
		handPatterns.add(new SmallWinds());
		handPatterns.add(new GreatDragon());
		handPatterns.add(new SmallDragon());
		handPatterns.add(new MixSuit());
		handPatterns.add(new AllinTriplets());
		handPatterns.add(new SamplePattern());
		handPatterns.add(new CommonHand());
		handPatterns.add(new SamplePattern());
		handPatterns.add(new SamplePattern());
		handPatterns.add(new SamplePattern());
		handPatterns.add(new SamplePattern());
		handPatterns.add(new Chicken());

		/*
		 * handPatterns.add(new 大四喜()); //0 
		 * handPatterns.add(new 十三么()); //1
		 * handPatterns.add(new 清么九()); //2 
		 * handPatterns.add(new 字一色()); //3
		 * handPatterns.add(new 清一色()); //4 
		 * handPatterns.add(new 小四喜()); //5
		 * handPatterns.add(new 大三元()); //6 
		 * handPatterns.add(new 小三元()); //7
		 * handPatterns.add(new 混一色()); //8 
		 * handPatterns.add(new 對對糊()); //9
		 * handPatterns.add(new 花么()); //10 
		 * handPatterns.add(new 平糊()); //11
		 * handPatterns.add(new 圈風牌刻子()); //12 
		 * handPatterns.add(new 門風牌刻子()); //13
		 * handPatterns.add(new 紅中刻子()); //14 
		 * handPatterns.add(new 發財刻子()); //15
		 * handPatterns.add(new 白板刻子()); //16 
		 * handPatterns.add(new 雞糊()); //17
		 */
	}

	public static HandChecker getInstance() {
		return instance;
	}

	private boolean checkPattern(int index) {
		if (handPatterns.get(index).checkPattern(hand)) {
			if (handPatterns.get(index).getPoint() == -1) {
				winningHand.clear();
			}
			winningHand.add(handPatterns.get(index));

			return true;
		} else
			return false;
	}

	public ArrayList<HandPattern> checkHand(Hand hand) {
		this.hand = hand;
		boolean hasDragon = false;
		boolean hasWind = false;
		winningHand = new ArrayList<HandPattern>();

		if (checkPattern(17)) {
			for (int i = 14; i < 17; i++)
				if (checkPattern(i))
					hasDragon = true;

			for (int i = 12; i < 14; i++)
				if (checkPattern(i))
					hasWind = true;

			if (hasDragon) {
				if (!checkPattern(3)) {
					checkPattern(8);
					checkPattern(9);
					checkPattern(10);
					if (!checkPattern(6))
						checkPattern(7);
				}
			} else if (hasWind) {
				if (!checkPattern(0)) {
					checkPattern(8);
					checkPattern(9);
					checkPattern(10);
					checkPattern(5);
				}
			} else {
				if (!checkPattern(1)) {
					if (!checkPattern(2)) {
						checkPattern(9);
						checkPattern(10);
						checkPattern(11);
						if (checkPattern(8))
							checkPattern(5);
						else
							checkPattern(4);
					}
				}
			}
		}

		Collections.sort(winningHand, new Comparator<HandPattern>() {
			@Override
			public int compare(HandPattern hp1, HandPattern hp2) {
				return ((Integer) hp1.getPoint()).compareTo((Integer) hp2.getPoint());
			}
		});

		return winningHand;
	}
}
